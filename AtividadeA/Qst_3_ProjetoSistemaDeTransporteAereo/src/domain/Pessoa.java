package domain;

abstract class Pessoa {
	
	private String nome;
	private int identidade;
	private int cpf;
	private Local endereco;
	private int telefoneOuCelular;
	
	public Pessoa(String nome, int identidade, int cpf, Local endereco, int telefoneOuCelular) {
		
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefoneOuCelular = telefoneOuCelular;
	}
}
