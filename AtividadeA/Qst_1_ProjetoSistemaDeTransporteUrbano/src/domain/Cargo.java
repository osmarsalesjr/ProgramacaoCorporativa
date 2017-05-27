package domain;

public class Cargo {
	
	private String descricaoCargo;
	private int codigoCargo;
	
	public Cargo(String descricaoCargo, int codigoCargo) {
		
		this.descricaoCargo = descricaoCargo;
		this.codigoCargo = codigoCargo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo: " + this.codigoCargo + "\nCargo: " + this.descricaoCargo + ".";
	}
	
	public int getCodigoCargo() {
		
		return codigoCargo;
	}
	
	public String getDescricaoCargo() {
		
		return descricaoCargo;
	}
}
