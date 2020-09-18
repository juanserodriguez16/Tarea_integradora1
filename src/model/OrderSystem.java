package model;

import java.util.ArrayList;

public class OrderSystem {
	
	private ArrayList<Restaurant> restaurants;

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

	
	
}
