package model;

import java.io.Serializable;

import java.util.*;

public class Restaurant implements Serializable, Comparable<Restaurant> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	@Override
	public String toString() {
		return "Nombre Restaurante "+ name + ", NIT " + nit + " nombre de su Admin " + admiName;
	}


	@Override
	public int compareTo(Restaurant o) {
		int x = Integer.parseInt(o.getNit());
		int y = Integer.parseInt(nit);
		if (x>y) {
			return -1;
		}
		else if(x == y) {
			return 0;
		}else {
			return 1;
			
		}
	}
		
	
}
