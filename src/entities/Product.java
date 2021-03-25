package entities;

public class Product {
	private String name;
	private Double price;
	private String description;
	private Integer quantity;
	private String category;
	
	public Product() {
	}
	
	public Product(String name, Double price, String description, Integer quantity, String category) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n" 
				+ "Price: R$" + price + "\n"
				+ "Description: " + description + "\n" 
				+ "Quantity: " + quantity + "\n"
				+ "Category: " + category + ".\n";
	}
}