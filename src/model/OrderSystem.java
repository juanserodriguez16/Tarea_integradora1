package model;

import java.util.ArrayList;
import java.util.Date;

public class OrderSystem {
	
	private ArrayList<Restaurant> restaurants;
	private ArrayList<Product> products;
	private ArrayList<Client> clients;
	private ArrayList<Order> orders;
	

	public OrderSystem(ArrayList<Restaurant> restaurants) {
		super();
		this.restaurants = restaurants;
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	
	public void addRestaurant(String name, String nit, String admiName) {
		Restaurant rest = new Restaurant(name, nit, admiName);	
		if (rest != null) {
			restaurants.add(rest);
		}
	}
	public void addProduct(String name, String description, double price, String code, String nitRestaurant) {
		Product product = new Product(code, name, description, nitRestaurant, price);
		if (product != null) {
			products.add(product);
		}
	}
	
	public void addClient(String idType, String fullName, String idNumber, String phone, String address) {
		Client client = new Client(idType, idNumber, fullName, phone, address);
		if (client != null) {
			clients.add(client);
		}
	}
	
	// Terminar metodo
	public void addOrder(String CodeClient, String nitRestaurant, ArrayList<Product> products ) {
		
	}
	
	public void updateRestaurant(String nitRestaurant, String name, String admiName) {		
		if (nitRestaurant != null) {
			for (int i = 0; i < restaurants.size(); i++) {
				Restaurant rest = restaurants.get(i);
				if (nitRestaurant.equals(rest.getNit())) {
					rest.setAdmiName(admiName);
					rest.setName(name);
				}
			}
		}
	}
	
	public void updateProduct(String codeProduct, String name, String description, String nitRestaurant, double price) {
		if (codeProduct != null) {
			for (int i = 0; i < products.size(); i++) {
				Product prod = products.get(i);
				if (codeProduct.equals(prod.getCode())) {
					prod.setDescription(description);
					prod.setName(name);
					prod.setNit(nitRestaurant);
					prod.setPrice(price);
				}
			}
		}
	}
	public void updateClient(String idNumber, String idType, String fullName, String phone, String adrress) {
		if (idNumber != null) {
			for (int i = 0; i < clients.size(); i++) {
				Client cli = clients.get(i);
				if (idNumber.equals(cli.getIdNumber())) {
					cli.setAdrress(adrress);
					cli.setFullName(fullName);
					cli.setIdType(idType);
					cli.setPhone(phone);
				}
			}
		}
	}
	
	public void updateOrder(String code, Date date, String cli, String rest, ArrayList<Product> products) {
		if (code != null) {
			for (int i = 0; i < orders.size(); i++) {
				Order order = orders.get(i);
				if (code.equals(order.getCode())) {
					order.setClient(cli);
					order.setDate(date);
					order.setProductos(products);
					order.setRestaurant(rest);
				}
			}
		}
	}
}