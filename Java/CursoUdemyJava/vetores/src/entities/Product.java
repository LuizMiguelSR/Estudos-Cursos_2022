package entities;

public class Product {
	
	private String nmae;
	private double price;
	
	public Product(String nmae, double price) {
		this.nmae = nmae;
		this.price = price;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
