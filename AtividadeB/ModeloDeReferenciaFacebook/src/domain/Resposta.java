package domain;

import java.util.Calendar;

public class Resposta extends Postagem{
	
	public Resposta(Usuario usuario, String urlConteudoMidia, String descricaoTextual, Calendar dataPostagem) {
		
		super(usuario, urlConteudoMidia, descricaoTextual, dataPostagem);
	}
}
