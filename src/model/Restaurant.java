package model;

import java.util.ArrayList;

public class Restaurant {

	private String name;
	private String nit;
	private String admiName;
	
	public Restaurant(String name, String nit, String admiName) {
		super();
		this.name = name;
		this.nit = nit;
		this.admiName = admiName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getAdmiName() {
		return admiName;
	}


	public void setAdmiName(String admiName) {
		this.admiName = admiName;
	}
		
	
}
