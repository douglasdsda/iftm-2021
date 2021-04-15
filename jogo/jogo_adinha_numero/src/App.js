import React from "react";
import "./styles/components/home.css";

const arrayStatus = [
  { status: "inicio", value: "Vamos Jogar" },
  { status: "jogando", value: "Digite um numero e confirme" },
  { status: "final", value: "Achou o numero" },
];

export class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { pesquisar: "", valor: "28", status: "inicio", contador: 0 };
    this.handlerStart = this.handlerStart.bind(this);
    this.handlerValue = this.handlerValue.bind(this);
  }

  calcStatus(status) {
    return arrayStatus.find((w) => w.status == status).value;
  }

  handlerValue() {
    // igual
    if (this.state.valor == this.state.pesquisar) {
      this.setState({
        status: "final",
      });
      alert(
        `Voce achou o numero ${this.state.valor} com ${this.state.contador} tentativas.`
      );
      setTimeout(() => {
        this.setState({
          valor: "",
          status: "inicio",
          pesquisar: "",
          contador: 0,
        });
      }, 3000);
    } else if (this.state.valor > this.state.pesquisar) {
      // menor
      alert("Digite um numero maior");
      this.setState({
        contador: this.state.contador + 1,
        pesquisar: "",
      });
    } else if (this.state.valor < this.state.pesquisar) {
      // menor
      alert("Digite um numero menor");
      this.setState({
        contador: this.state.contador + 1,
        pesquisar: "",
      });
    }
  }

  handlerStart() {
    const auxValue = parseInt(Math.random() * 100 + 1);
    alert("Jogo iniciado!");
    this.setState({
      valor: auxValue,
      status: "jogando",
      contador: 0,
    });
  }

  render() {
    return (
      <div className="container-home">
        <main>
          <p>{this.calcStatus(this.state.status)}</p>
          {this.state.status == "jogando" && (
            <p>Quantidade de tentativas: {this.state.contador}</p>
          )}

          <div className="container-home-pesquisa">
            <label htmlFor="pesquisar">Pesquisar</label>
            <input
              type="number"
              id="pesquisar"
              name="pesquisar"
              disabled={this.state.status != "jogando"}
              value={this.state.pesquisar}
              onChange={(e) =>
                this.setState({
                  pesquisar: e.target.value,
                })
              }
            />

            <button
              disabled={this.state.status != "jogando"}
              onClick={this.handlerValue}
              type="button"
            >
              Confirmar numero
            </button>
          </div>
          {this.state.status == "final" && (
            <div className="result-value">
              <span>Você achou o numero {this.state.valor}</span>
            </div>
          )}
        </main>
        <button
          className="fixedButton"
          onClick={this.handlerStart}
          type="button"
        >
          Novo jogo
        </button>
      </div>
    );
  }
}

export default App;
