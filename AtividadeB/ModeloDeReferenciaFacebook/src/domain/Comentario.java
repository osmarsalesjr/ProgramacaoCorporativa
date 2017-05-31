package domain;

import java.util.*;

public class Comentario {
	
	private Usuario usuario;
	private String urlMidia;
	private String descricaoTextual;
	private Calendar dataPostagem;
	private List<Curtir> curtidas;
	private Comentario resposta;
}
