package classes;

import java.util.Random;

import interfaces.IContaCore;

// Classe base das contas responsável pelos parâmetros e características comuns entre as outras classe que herdam dela.
public abstract class ContaCore implements IContaCore {

	// Constantes
	protected static final int TIPO_CONTA_CORRENTE = 001;
	protected static final int TIPO_CONTA_POUPANCA = 013;
	private static final int AGENCIA_PADRAO = 1001;
	private static String NUMERO_CC = "000" + new Random().nextInt(99999) + "-" + (new Random().nextInt(9) + 1);
	private static String NUMERO_CP = "000" + new Random().nextInt(99999) + "-" + (new Random().nextInt(9) + 1);

	// Parâmetros base.
	protected int agencia;
	protected String numConta;
	protected double saldo;
	private Cliente cliente;

	// Construtor
	public ContaCore(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.cliente = cliente;
	}

	// Métodos Base
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IContaCore contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);
	}

	protected void imprimirInfoConta() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta corrente: " + this.numConta);
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
		System.out.println("_________________________________");
	}

	protected String criarConta(int operacao) {
		if (operacao == TIPO_CONTA_CORRENTE)
			return NUMERO_CC;
		else
			return NUMERO_CP;
	}

	// Getters
	public int getAgencia() {
		return agencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
