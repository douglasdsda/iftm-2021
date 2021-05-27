import { useAuth } from "../../hooks/auth";

import "./styles.scss";

export function Dashboard() {
  const { emailUser, signOut } = useAuth();

  return (
    <>
      <div className="container-dashboard">Ola, {emailUser}</div>

      <button className="button button-dashboard" type="button" onClick={signOut}>
        Deslogar
      </button>
    </>
  );
}
