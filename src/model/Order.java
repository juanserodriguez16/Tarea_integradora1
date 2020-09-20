package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	public final static String SOLICITADO = "Solicitado";
	public final static String EN_PROCESO = "En Proceso";
	public final static String ENVIADO = "Enviado";
	public final static String ENTREGADO = "Entregado";
	
	private int state;
	private String code;
	private Date date;
	private String idClient;
	private String nitRestaurant;
	private ArrayList<Product> products;
	
	public Order(String code, Date date, String idClient, String nitRestaurant, ArrayList<Product> products) {
		super();
		this.code = code;
		this.date = date;
		this.idClient = idClient;
		this.nitRestaurant = nitRestaurant;
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

	public String getClient() {
		return idClient;
	}

	public void setClient(String client) {
		this.idClient = client;
	}

	public String getRestaurant() {
		return nitRestaurant;
	}

	public void setRestaurant(String restaurant) {
		this.nitRestaurant = restaurant;
	}

	public ArrayList<Product> getProductos() {
		return products;
	}

	public void setProductos(ArrayList<Product> productos) {
		this.products = productos;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public String orderState(int state) {
		String stateReturn="";
		
		switch (state) {
		case 1:
			stateReturn = SOLICITADO; 
			break;
			
		case 2:
			stateReturn = EN_PROCESO; 
			break;
		case 3:
			stateReturn = ENVIADO; 
			break;
		case 4:
			stateReturn = ENTREGADO; 
			break;
		}
		
		
		return stateReturn;
	}
	
	
	
	
}
