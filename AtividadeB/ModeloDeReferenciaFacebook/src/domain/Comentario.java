package domain;

import java.util.*;

public class Comentario extends Postagem{
	
	private List<Resposta> respostas;
	
	public Comentario(Usuario usuario, String urlConteudoMidia, String descricaoTextual, Calendar dataPostagem) {
		
		super(usuario, urlConteudoMidia, descricaoTextual, dataPostagem);
		this.respostas = new ArrayList<Resposta>();
	}
	
	public List<Resposta> getRespostas() {
		
		return Collections.unmodifiableList(respostas);
	}
	
	public void addResposta(Resposta resposta){
		
		this.respostas.add(resposta);
	}
	
	public void removeResposta(Resposta reposta){
		
		this.respostas.remove(reposta);
	}
	
	public void removeResposta(int index){
		
		this.respostas.remove(index);
	}
}
