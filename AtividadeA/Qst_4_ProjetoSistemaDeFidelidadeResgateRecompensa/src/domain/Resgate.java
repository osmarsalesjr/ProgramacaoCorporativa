package domain;

public class Resgate {
	
	private String descricao;
	private int pontosNecessarios;
	private ServicoOuProduto servicoOuProduto;	
	
	public Resgate(String descricao, int pontosNecessarios, ServicoOuProduto servicoOuProdutoDisponivel) {
		
		this.descricao = descricao;
		this.pontosNecessarios = pontosNecessarios;
		this.servicoOuProduto = servicoOuProdutoDisponivel;
	}
}
