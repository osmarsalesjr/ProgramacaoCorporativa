package domain;

public class Funcionario extends Pessoa {
	
	private int matricula;
	private Cargo cargo;
	
	public Funcionario(String nome, int identidade, int cpf, Local endereco, int telefoneOuCelular, int matricula, Cargo cargo) {
		
		super(nome, identidade, cpf, endereco, telefoneOuCelular);
		this.matricula = matricula;
		this.cargo = cargo;
	}
}
