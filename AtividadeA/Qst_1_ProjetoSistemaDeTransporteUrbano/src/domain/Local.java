package domain;

public class Local {
	
	private String descricaoLocal;
	private String endereco;
	
	public Local(String descricaoLocal, String endereco) {
		
		this.descricaoLocal = descricaoLocal;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Local: " + this.descricaoLocal + "\nEndereco: " + this.endereco + ".";
	}
	
	public String getDescricaoLocal() {
		
		return descricaoLocal;
	}
	
	public String getEndereco() {
		
		return endereco;
	}
	
	public void setDescricaoLocal(String descricaoLocal) {
		
		this.descricaoLocal = descricaoLocal;
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
}
