package domain;

public class Parada {
	
	private Local local;
	private Item item;
	
	public Parada(Local local, Item item) {
		
		this.local = local;
		this.item = item;
	}
	
	public Local getLocal() {
		
		return local;
	}
	
	public Item getItem() {
		
		return item;
	}
	
	public void setItem(Item item) {
		
		this.item = item;
	}
}
