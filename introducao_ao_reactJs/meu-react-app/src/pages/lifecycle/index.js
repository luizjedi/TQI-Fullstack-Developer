import React, { Component } from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

class LifeCycle extends Component {

    constructor(props) {
        super(props)

        this.state = {
            clock: 1000,
            copo: 'água'
        }
    }

    componentDidMount() {
        window.setTimeout(() => {
            this.setState({
                copo: 'suco'
            })
        }, 3000)
    }

    alterarCopo = () => {
        this.setState({
            copo: 'refrigerante'
        })
    }

    render() {
        const { clock, copo } = this.state;

        return (
            <div>
                <h1>{clock}</h1>
                <button onClick={() => this.alterarCopo()}>{copo}</button>
            </div>
        )
    }

}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <LifeCycle />
  </React.StrictMode>
);

