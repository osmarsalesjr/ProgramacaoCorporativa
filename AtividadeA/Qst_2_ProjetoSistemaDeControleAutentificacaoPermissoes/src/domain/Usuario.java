package domain;

public class Usuario {
	
	private String nome;
	private Grupo grupo;
	private Login login;
	
	public Usuario(String nome, Grupo grupo, Login login) {
		
		this.nome = nome;
		this.grupo = grupo;
		this.login = login;
	}
}
