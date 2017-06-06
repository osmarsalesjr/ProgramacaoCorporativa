package domain;

import java.util.*;

public class Publicacao extends Postagem{
	
	private Grupo grupoDaPostagem;
	private List<Comentario> comentarios;
	
	public Publicacao(Usuario usuario, String urlConteudoMidia, String descricaoTextual, Calendar dataPostagem) {
		
		super(usuario, urlConteudoMidia, descricaoTextual, dataPostagem);
		this.grupoDaPostagem = null;
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public Publicacao(Usuario usuario, String urlConteudoMidia, String descricaoTextual, Calendar dataPostagem, Grupo grupoDaPostagem) {
		
		super(usuario, urlConteudoMidia, descricaoTextual, dataPostagem);
		this.grupoDaPostagem = grupoDaPostagem;
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public Grupo getGrupoDaPostagem() {
		
		return grupoDaPostagem;
	}
	
	public List<Comentario> getComentarios() {
		
		return Collections.unmodifiableList(comentarios);
	}
	
	public void addComentario(Comentario comentario){
		
		this.comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario){
		
		this.comentarios.remove(comentario);
	}
	
	public void removeComentario(int index){
		
		this.comentarios.remove(index);
	}
}
