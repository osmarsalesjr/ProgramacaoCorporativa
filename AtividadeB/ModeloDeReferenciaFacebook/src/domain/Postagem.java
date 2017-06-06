package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

abstract class Postagem {
	
	private Usuario usuario;
	private String urlConteudoMidia;
	private String descricaoTextual;
	private Calendar dataPostagem;
	private List<Curtir> curtidas;
	private List<Usuario> marcacoes;
	
	public Postagem(Usuario usuario, String urlConteudoMidia, String descricaoTextual, Calendar dataPostagem) {
		
		this.usuario = usuario;
		this.urlConteudoMidia = urlConteudoMidia;
		this.descricaoTextual = descricaoTextual;
		this.dataPostagem = dataPostagem;
		this.curtidas = new ArrayList<Curtir>();
		this.marcacoes = new ArrayList<Usuario>();
	}
	
	public Usuario getUsuario() {
		
		return usuario;
	}
	
	public List<Curtir> getCurtidas() {
		
		return Collections.unmodifiableList(curtidas);
	}
	
	public List<Usuario> getPessoasMarcadas() {
		
		return Collections.unmodifiableList(marcacoes);
	}
	
	public String getUrlConteudoMidia() {
		
		return urlConteudoMidia;
	}
	
	public void addMarcacao(Usuario usuario){
		
		this.marcacoes.add(usuario);
	}
	
	public void removeMarcacao(int index){
		
		this.marcacoes.remove(index);
	}
	
	public void addCurtida(Curtir curtida){
		
		this.curtidas.add(curtida);
	}
	
	public void removeCurtida(Curtir curtida){
		
		this.curtidas.remove(curtida);
	}
	
	public void removeCurtida(int index){
		
		this.curtidas.remove(index);
	}
	
	public String getDescricaoTextual() {
		
		return descricaoTextual;
	}
	
	protected void setDescricaoTextual(String descricaoTextual) {
		
		this.descricaoTextual = descricaoTextual;
	}
	
	public Calendar getDataPostagem() {
		
		return dataPostagem;
	}
}