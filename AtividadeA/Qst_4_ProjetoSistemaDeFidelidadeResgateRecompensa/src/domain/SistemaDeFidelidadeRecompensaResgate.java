package domain;

import java.util.*;

public class SistemaDeFidelidadeRecompensaResgate {
	
	private List<Fidelidade> fidelidades;
	private List<Recompensa> recompensas;
	private List<Resgate> resgates;
	private List<ServicoOuProduto> servicosOuProdutos;
	private List<Cliente> clientes;
	
	public SistemaDeFidelidadeRecompensaResgate() {
		
		this.fidelidades = new ArrayList<Fidelidade>();
		this.recompensas = new ArrayList<Recompensa>();
		this.resgates = new ArrayList<Resgate>();
		this.servicosOuProdutos = new ArrayList<ServicoOuProduto>();
		this.clientes = new ArrayList<Cliente>();
	}
}
