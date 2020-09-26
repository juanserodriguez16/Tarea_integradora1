package model;

import java.util.Comparator;

public class RestaurantSort implements Comparator<Restaurant>{

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		return o1.getNit().compareToIgnoreCase(o2.getNit());
	}

}

