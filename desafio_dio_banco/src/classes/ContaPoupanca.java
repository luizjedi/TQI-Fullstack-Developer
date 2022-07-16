package classes;

//Classe responsável pela entidade ContaPoupanca.
public class ContaPoupanca extends ContaCore {

	// Construtor da classe.
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.numConta = criarConta(TIPO_CONTA_POUPANCA);
	}

	// Imprime a visão geral da conta.
	@Override
	public void imprimirExtrato(Banco banco) {
		System.out.println("_________________________________");
		System.out.println();
		banco.imprimirInfoBanco(banco.getNome());
		System.out.println();
		System.out.println("$$$$ Extrato Conta Poupança $$$$$");
		imprimirInfoConta();
		;
	}
}