package domain;

public class Passageiro extends Pessoa {
	
	private String assento;
	private Voo voo;
	private Classe classe;
	
	public Passageiro(String nome, int identidade, int cpf, Local endereco, int telefoneOuCelular, String assento, Voo voo, Classe classe) {
		
		super(nome, identidade, cpf, endereco, telefoneOuCelular);
		this.assento = assento;
		this.voo = voo;
		this.classe = classe;
	}
}
