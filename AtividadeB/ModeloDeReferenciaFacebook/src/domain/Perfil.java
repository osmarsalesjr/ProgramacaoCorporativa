package domain;

import java.util.*;

public class Perfil {
	
	private List<Publicacao> minhasPublicacoes;
	private List<Amizade> amizades;
	private List<SolicitacaoDeAmizade> solicitacoesDeAmizade;
	private List<ParticipacaoEmGrupo> participacoesEmGrupos;
	private List<Pagina> paginasCurtidas;
	
	public Perfil() {
		
		this.minhasPublicacoes = new ArrayList<Publicacao>();
		this.amizades = new ArrayList<Amizade>();
		this.solicitacoesDeAmizade = new ArrayList<SolicitacaoDeAmizade>();
		this.participacoesEmGrupos = new ArrayList<ParticipacaoEmGrupo>();
		this.paginasCurtidas = new ArrayList<Pagina>();
	}
	
	public List<Publicacao> getMinhasPostagens() {
		
		return Collections.unmodifiableList(minhasPublicacoes);
	}
	
	public Publicacao getPublicacao(int index){
		
		return this.minhasPublicacoes.get(index);
	}
	
	public void addPublicacao(Publicacao publicacao){
		
		this.minhasPublicacoes.add(publicacao);
	}
	
	public void removePublicacao(int index){
		
		this.minhasPublicacoes.remove(index);
	}
	
	public void removePublicacao(Publicacao publicacao){
		
		this.minhasPublicacoes.remove(publicacao);
	}
	
	public List<Amizade> getAmizades() {
		
		return Collections.unmodifiableList(amizades);
	}

	public List<SolicitacaoDeAmizade> getSolicitacoesDeAmizade() {
		
		return Collections.unmodifiableList(solicitacoesDeAmizade);
	}
	
	public SolicitacaoDeAmizade getSolicitacaoDeAmizade(int index){
		
		return this.solicitacoesDeAmizade.get(index);
	}
	
	public void addSolicitacaoDeAmizade(SolicitacaoDeAmizade solicitacaoDeAmizade){
		
		this.solicitacoesDeAmizade.add(solicitacaoDeAmizade);
	}
	
	public void removeSolicitacaoDeAmizade(SolicitacaoDeAmizade solicitacaoDeAmizade){
		
		this.solicitacoesDeAmizade.remove(solicitacaoDeAmizade);
	}
	
	public void removeSolicitacaoDeAmizade(int index){
		
		this.solicitacoesDeAmizade.remove(index);
	}

	public List<ParticipacaoEmGrupo> getParticipacoesEmGrupos() {
		
		return Collections.unmodifiableList(participacoesEmGrupos);
	}
	
	public ParticipacaoEmGrupo getParticipacaoEmGrupo(int index){
		
		return this.participacoesEmGrupos.get(index);
	}
	
	public void addParticipacaoEmGrupo(ParticipacaoEmGrupo participacaoEmGrupo){
		
		this.participacoesEmGrupos.add(participacaoEmGrupo);
	}
	
	public void removeParticipacaoEmGrupo(ParticipacaoEmGrupo participacaoEmGrupo){
		
		this.participacoesEmGrupos.remove(participacaoEmGrupo);
	}
	
	public void removeParticipacaoEmGrupo(int index){
		
		this.participacoesEmGrupos.remove(index);
	}

	public List<Pagina> getPaginasCurtidas() {
		
		return Collections.unmodifiableList(paginasCurtidas);
	}
	
	public Pagina getPaginaCurtida(int index){
		
		return this.paginasCurtidas.get(index);
	}
	
	public void addPagina(Pagina pagina){
		
		this.paginasCurtidas.add(pagina);
	}
	
	public void removePagina(Pagina pagina){
		
		this.paginasCurtidas.remove(pagina);
	}
	
	public void removePagina(int index){
		
		this.paginasCurtidas.remove(index);
	}
}
