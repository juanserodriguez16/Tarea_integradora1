package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	private String code;
	private Date date;
	private Client client;
	private Restaurant restaurant;
	private ArrayList<Product> products;
	
	public Order(String code, Date date, Client client, Restaurant restaurant, ArrayList<Product> products) {
		super();
		this.code = code;
		this.date = date;
		this.client = client;
		this.restaurant = restaurant;
		this.products = products;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public ArrayList<Product> getProductos() {
		return products;
	}

	public void setProductos(ArrayList<Product> productos) {
		this.products = productos;
	}
	
	
	
	
}
