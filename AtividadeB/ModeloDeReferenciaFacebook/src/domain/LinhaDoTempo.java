package domain;

import java.util.*;

public class LinhaDoTempo {
	
	private List<Publicacao> listaDePublicacoes;
	
	public LinhaDoTempo() {
		
		this.listaDePublicacoes = new ArrayList<Publicacao>();
	}
	
	public List<Publicacao> getListaDePublicacoes() {
		
		return listaDePublicacoes;
	}
	
	public void addPublicacao(Publicacao publicacao){
		
		this.listaDePublicacoes.add(publicacao);
	}
	
	public void removePublicacao(int index){
		
		this.listaDePublicacoes.remove(index);
	}
}
