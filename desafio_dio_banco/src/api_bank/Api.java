package api_bank;

import java.util.ArrayList;
import java.util.List;

import classes.Banco;
import classes.Cliente;
import classes.ContaCore;
import classes.ContaCorrente;
import classes.ContaPoupanca;

//Classe responsável por executar a api do banco.
public class Api {

	// Método principal.
	public static void main(String[] args) {

		Cliente rico = new Cliente();
		Cliente pobre = new Cliente();

		rico.setNome("Luiz Felipe");
		pobre.setNome("Fulano");

		ContaCore cc = new ContaCorrente(rico);
		cc.depositar(750);

		ContaCore poupanca = new ContaPoupanca(pobre);
		cc.transferir(150, poupanca);

		List<ContaCore> contas = new ArrayList<ContaCore>();
		contas.add(poupanca);
		contas.add(cc);

		Banco banco = new Banco();
		banco.setNome("Java Fiance");
		banco.setContas(contas);

		banco.imprimiContas(contas);
		cc.imprimirExtrato(banco);
		poupanca.imprimirExtrato(banco);
	}
}
