package domain;

public class Recompensa {
	
	private String descricao;
	private int pontosAConceder;
	
	public Recompensa(String descricao, int pontosGanho, ServicoOuProduto servicosOuProdutosBonificado) {
		
		this.descricao = descricao;
		this.pontosAConceder = pontosGanho;
	}
	
}
