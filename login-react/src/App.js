import AppProvider from "./hooks";

import { Login } from "./pages/Login";
import "./styles/global.scss";

function App() {
  return (
    <>
      <AppProvider><Login></Login></AppProvider>
    </>
  );
}

export default App;
