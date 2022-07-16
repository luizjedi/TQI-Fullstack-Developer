package classes;

// Classe responsável pela entidade ContaCorrente.
public class ContaCorrente extends ContaCore {
	
	// Construtor da classe.
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.numConta = criarConta(TIPO_CONTA_CORRENTE);
	}

	// Imprime a visão geral da conta.
	@Override
	public void imprimirExtrato(Banco banco) {
		System.out.println("_________________________________");
		System.out.println();
		banco.imprimirInfoBanco(banco.getNome());
		System.out.println();
		System.out.println("$$$$ Extrato Conta Corrente $$$$$");
		imprimirInfoConta();
	}

	
}
