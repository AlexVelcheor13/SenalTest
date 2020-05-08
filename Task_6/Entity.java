package Task_6;

public class Entity {
	private int price;
	private int weight;
	
	public Entity(int weight, int price) {
		super();
		this.price = price;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "price: " + price + " | weight: " + weight;
	}
	
	
	
}
