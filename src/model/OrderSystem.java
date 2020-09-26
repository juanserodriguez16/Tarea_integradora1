package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import exception.ClientNoFoundException;
import exception.NotSwitchOrderStateException;
import exception.OrderVerificationException;

public class OrderSystem {

	private ArrayList<Restaurant> restaurants;
	private ArrayList<Product> products;
	private ArrayList<Client> clients;
	private ArrayList<Order> orders;

	public OrderSystem() {
		clients = new ArrayList<Client>();
		restaurants = new ArrayList<Restaurant>();
		products = new ArrayList<Product>();
		orders = new ArrayList<Order>();
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public void addRestaurant(Restaurant rest) {
		restaurants.add(rest);

	}

	public void addProduct(Product product) {
		if (product != null) {
			products.add(product);
		}
	}

	public void addClient(Client client) {
		clients.add(client);

	}

	public void addOrder(Order order) {
		if (order != null) {
			orders.add(order);
		}
	}

	public void updateRestaurant(String nitRestaurant, String name, String admiName) {
		if (nitRestaurant != null && nitRestaurant != " ") {
			for (int i = 0; i < restaurants.size(); i++) {
				Restaurant rest = restaurants.get(i);
				if (nitRestaurant.equals(rest.getNit())) {
					rest.setAdmiName(admiName);
					rest.setName(name);
				}
			}
		}
	}

	public void updateProduct(String codeProduct, String name, String description, String nitRestaurant, int price) {
		if (codeProduct != null) {
			for (int i = 0; i < products.size(); i++) {
				Product prod = products.get(i);
				if (codeProduct.equals(prod.getCode())) {
					prod.setDescription(description);
					prod.setName(name);
					prod.setNitRestaurant(nitRestaurant);
					prod.setPrice(price);
				}
			}
		}
	}

	public void updateClient(String idNumber, String idType, String name, String lastName, int phone, String adrress) {
		if (idNumber != null) {
			for (int i = 0; i < clients.size(); i++) {
				Client cli = clients.get(i);
				if (idNumber.equals(cli.getIdNumber())) {
					cli.setAdrress(adrress);
					cli.setName(name);
					cli.setLastName(lastName);
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
					order.setProducts(products);
					order.setNitRestaurant(rest);
				}
			}
		}
	}

	public String changeOrderState(Order order, int newState) throws NotSwitchOrderStateException {
		String state = "";
		if ((order.getState() != 0) && (newState != 0)) {
			if (newState > order.getState()) {
				order.setState(newState);
				state = order.orderState(newState);
			} else {
				throw new NotSwitchOrderStateException();
			}
		}
		return state;
	}

	public boolean verifyProductsRestaurants(Order order) throws OrderVerificationException {
		boolean verify = false;
		int cont = 0;
		if (order != null) {
			int products = order.getProducts().size();
			for (int i = 0; i < products; i++) {
				if (order.getProducts().get(i).getNitRestaurant() == order.getNitRestaurant()) {
					cont++;
				} else {
					throw new OrderVerificationException(order.getProducts().get(i).getName(),
							order.getNitRestaurant());
				}
			}
			if (products == cont) {
				verify = true;
			}
		}
		return verify;
	}

	public void bubbleSortRestaurants() {
		if (this.getRestaurants() != null) {
			int x = this.getRestaurants().size();
			Restaurant[] matrix = new Restaurant[x];
			for (int i = 0; i < x; i++) {
				matrix[i] = this.getRestaurants().get(i);
			}
			Restaurant temp;
			for (int i = 1; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length - 1; j++) {
					if (matrix[j].getName().charAt(0) > matrix[j + 1].getName().charAt(0)) {
						temp = matrix[j];
						matrix[j] = matrix[j + 1];
						matrix[j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < x; i++) {
				System.out.println(matrix[i].toString());
			}
		}
	}

	public void insercionPhoneNumbers() {
		int x = clients.size();
		Client[] vector = new Client[x];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = clients.get(i);
		}
		for (int i = 1; i < vector.length; i++) {
			Client aux = vector[i];
			int j;
			for (j = i - 1; j >= 0 && vector[j].getPhone() < aux.getPhone(); j--) {
				vector[j + 1] = vector[j];
			}
			vector[j + 1] = aux;
		}
		System.out.println("InsercionPhoneNumbers");
		for(Client e : vector ) {
			System.out.println(e.toString());
		}
	}

	public Client searchClient(String name) throws ClientNoFoundException {
		long startTime = System.currentTimeMillis();
		Client cli = null;
		String str = "";
		Collections.sort(clients, new ClientNameSort());
		boolean encontre = false;
		int inicio = 0;
		int fin = clients.size();
		while (inicio <= fin) {
			int medio = (int) Math.floor((inicio + fin) / 2);
			if (medio != clients.size()) {
				String elementoDelMedio = clients.get(medio).getName();
				int resultadoDeComparancion = name.compareToIgnoreCase(elementoDelMedio);
				if (resultadoDeComparancion == 0) {
					encontre = true;
					cli = clients.get(medio);
					str = "Nombre: " + cli.getName() + "\n" + "Apellido: " + cli.getLastName() + "\n" + "Tipo ID: "
							+ cli.getIdType() + "\n" + "Num ID: " + cli.getIdNumber() + "\n" + "Numero Telefonico: "
							+ cli.getPhone() + "\n" + "Dirección: " + cli.getAdrress() + "\n";
				} else if (resultadoDeComparancion < 0) {
					fin = medio - 1;
				} else if (resultadoDeComparancion > 0) {
					inicio = medio + 1;
				}
			}
		}
		
		System.out.println(str);
		if (encontre == false) {
			System.out.println("no existe el cliente"+name);
			
			throw new ClientNoFoundException(name);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Duracion de busquedad: " + (endTime - startTime) / 1e6 + " ms");
		str += "Duracion de busquedad: " + (endTime - startTime) / 1e6 + " ms";
		return cli;
	}
}
