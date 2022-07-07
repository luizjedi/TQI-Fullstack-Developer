import logo from './assets/logo.svg';
import './App.css';
import Button from './components/button/Button';
import CompA from './components/compA/CompA';
import CompB from './components/compB/CompB';
// import LifeCycle from './pages/lifecycle/index';


function soma(a, b) {
  return alert(a + b);
}

function App() {

  const element = 'Digital Innovation';
  const element2 = <h1> LuizJedi student</h1>;

  return (
    <div className="App">
      <header className="App-header">
        {/* <Button onClick={() => LifeCycle} name='Ciclo de Vida' /> */}
        <img src={logo} className="App-logo" alt="logo" />
        <p className='test'>
          {element}
          {element2}
          <Button onClick={() => soma(10, 17)} name='Luiz Felipe de Oliveira' />
        </p>
        <CompA>
          <CompB>
            <Button onClick={() => soma(40, 30)} name='Componente B' />
          </CompB>
        </CompA>
        <a className="App-link" href="https://reactjs.org" target="_blank" rel="noopener noreferrer">
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
