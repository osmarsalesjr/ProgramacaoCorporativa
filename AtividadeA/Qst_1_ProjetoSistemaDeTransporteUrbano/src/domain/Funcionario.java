package domain;

public class Funcionario {
	
	private String nome;
	private int identificacao;
	private Cargo cargo;
	
	public Funcionario(String nome, int identificacao, Cargo cargo) {
		
		this.nome = nome;
		this.identificacao = identificacao;
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Identificacao: " + this.identificacao + "\nNome: " + this.nome + "\nCargo: " + this.cargo.getDescricaoCargo();
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public int getIdentificacao() {
		
		return identificacao;
	}
	
	public void setCargo(Cargo cargo) {
		
		this.cargo = cargo;
	}
}