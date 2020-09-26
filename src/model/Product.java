package model;

public class Product {

	private String code;
	private String name;
	private String description;
	private String nitRestaurant;
	private int price;
	
	public Product(String code, String name, String description, String nitRestaurant, int price) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.nitRestaurant = nitRestaurant;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNitRestaurant() {
		return nitRestaurant;
	}

	public void setNitRestaurant(String nitRestaurant) {
		this.nitRestaurant = nitRestaurant;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Nombre "+ name +" ;Codigo " + code + " ;Descripción "+ description + " ;Precio "+price+ " ;Nit restaurante "+nitRestaurant;
	}
	
	
	
	
}
