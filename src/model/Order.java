package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {

	public final static String SOLICITADO = "Solicitado";
	public final static String EN_PROCESO = "En Proceso";
	public final static String ENVIADO = "Enviado";
	public final static String ENTREGADO = "Entregado";
	
	private int state;
	private int code;
	private Date date;
	private String idClient;
	private String nitRestaurant;
	private ArrayList<Product> products;
	
	public Order(int state, int code, Date date, String idClient, String nitRestaurant, ArrayList<Product> products) {
		super();
		this.state = state;
		this.code = code;
		this.date = date;
		this.idClient = idClient;
		this.nitRestaurant = nitRestaurant;
		this.products = products;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
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

	public String getNitRestaurant() {
		return nitRestaurant;
	}

	public void setNitRestaurant(String restaurant) {
		this.nitRestaurant = restaurant;
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
	public String nameState() {
		String stateReturn="";
		
		switch (this.state) {
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
	
	public String showProducts() {
		String str = "";
		for(Product e: getProducts()) {
			str+=e.toString()+"\n";
		}
		return str;
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Product e: products) {
			str += e.getName()+" -- ";
		}
		return "Codigo "+code+" ;estado "+nameState()+" ;Fecha "+date+" ;Nit restaurante "+nitRestaurant+ " ;ID Cliente "+ idClient + " ;productos "+str;
	}
	
	
}
