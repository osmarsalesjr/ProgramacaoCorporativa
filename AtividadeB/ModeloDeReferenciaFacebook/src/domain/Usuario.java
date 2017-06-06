package domain;

import java.util.Calendar;

abstract class Usuario {
	
	private String descricao;
	private Calendar dataDeAtivacao;
	private Login login;
	private LinhaDoTempo linhaDoTempo; 
	
	public Usuario(String descricao, Calendar dataDeAtivacao, Login login) {
		
		this.descricao = descricao;
		this.dataDeAtivacao = dataDeAtivacao;
		this.login = login;
		this.linhaDoTempo = new LinhaDoTempo();
	}
	
	public String getDescricao() {
		
		return descricao;
	}
	
	public LinhaDoTempo getLinhaDoTempo() {
		
		return linhaDoTempo;
	}
	
	public Calendar getDataDeAtivacao() {
		
		return dataDeAtivacao;
	}
	
	protected Login getLogin() {
		
		return login;
	}
	protected void setLogin(Login login){
		
		this.login = login;
	}
}
