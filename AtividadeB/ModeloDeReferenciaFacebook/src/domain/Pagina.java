package domain;

import java.util.*;

public class Pagina extends Usuario{
	
	private List<Curtir> curtidas;
	private List<Publicacao> publicacoes;
	
	public Pagina(String descricao, Calendar dataDeCriacao, Login login) {
		
		super(descricao, dataDeCriacao, login);
		this.curtidas = new ArrayList<Curtir>();
		this.publicacoes = new ArrayList<Publicacao>();
	}

	public List<Curtir> getCurtidas() {
		
		return Collections.unmodifiableList(curtidas);
	}
	
	public List<Publicacao> getPublicacoes() {
		
		return Collections.unmodifiableList(publicacoes);
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
	
	public void addPublicacao(Publicacao publicacao){
		
		this.publicacoes.add(publicacao);
	}
	
	public void removePublicacao(Publicacao publicacao){
		
		this.publicacoes.remove(publicacao);
	}
	
	public void removePublicacao(int index){
		
		this.publicacoes.remove(index);
	}
	
	public Publicacao getPublicacao(int index){
		
		return this.publicacoes.get(index);
	}
}
