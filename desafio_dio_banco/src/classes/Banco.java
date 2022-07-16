package classes;

import java.util.List;

//Classe responsável pela entidade Banco.
public class Banco {

	// Atributos Banco.
	private String nome;
	private List<ContaCore> contas;

	// Métodos.
	public void imprimiContas(List<ContaCore> contas) {
		int numeroDeContas = contas.size();
		int contador = 0;
		System.out.println("$$ Esse é o Banco " + this.nome + " $$");
		System.out.println("_________________________________");
		System.out.println();
		System.out.println("Número de contas: " + numeroDeContas);
		System.out.println("_________________________________");

		for (ContaCore conta : contas) {
			contador++;
			System.out.println();
			System.out.println("Conta " + contador);
			System.out.println("Titular: " + conta.getCliente().getNome());
			System.out.println("Agência: " + conta.agencia);
			System.out.println("Número da Conta: " + conta.numConta);
			System.out.println("_________________________________");
		}
		System.out.println();
	}

	protected void imprimirInfoBanco(String nome) {
		System.out.println("Nome do Banco: " + this.nome);
	}

	// Getters e Setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ContaCore> getContas() {
		return contas;
	}

	public void setContas(List<ContaCore> contas) {
		this.contas = contas;
	}
}
