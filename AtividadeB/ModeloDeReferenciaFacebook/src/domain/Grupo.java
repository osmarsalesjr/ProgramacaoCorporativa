package domain;

import java.util.*;

public class Grupo {
	
	private String descricao;
	private Calendar dataDeCriacao;
	private List<UsuarioComum> participantes;
	private List<Publicacao> publicacoes;
	
	public Grupo(String descricao, Calendar dataDeCriacao) {
		
		this.dataDeCriacao = dataDeCriacao;
		this.descricao = descricao;
		this.participantes = new ArrayList<UsuarioComum>();
		this.publicacoes = new ArrayList<Publicacao>();
	}
	
	public Calendar getDataDeCriacao() {
		
		return dataDeCriacao;
	}
	
	public String getDescricao() {
		
		return descricao;
	}
	
	public List<UsuarioComum> getParticipantes() {
		
		return Collections.unmodifiableList(participantes);
	}
	
	public List<Publicacao> getPostagens() {
		
		return Collections.unmodifiableList(publicacoes);
	}
	
	public void addUsuario(UsuarioComum usuario){
		
		this.participantes.add(usuario);
	}
	
	public UsuarioComum getUsuario(int index){
		
		return this.participantes.get(index);
	}
	
	public void removeUsuario(int index){
		
		this.participantes.remove(index);
	}
	
	public void removeUsuario(UsuarioComum usuario){
		
		this.participantes.remove(usuario);
	}
	
	public void addPostagem(Publicacao postagem){
		
		this.publicacoes.add(postagem);
	}
	
	public Publicacao getPostagem(int index){
		
		return this.publicacoes.get(index);
	}
	
	public void removePostagem(Publicacao postagem){
		
		this.publicacoes.remove(postagem);
	}
	
	public void removePostagem(int index){
		
		this.publicacoes.remove(index);
	}
}
