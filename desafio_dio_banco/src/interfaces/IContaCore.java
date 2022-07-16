package interfaces;

import classes.Banco;

// Interface base da entidade Conta.
public interface IContaCore {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IContaCore contadestino);

	void imprimirExtrato(Banco banco);
}
