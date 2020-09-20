package model;

import java.util.Comparator;

public class ClientLastNameSort  implements Comparator<Client>{

	@Override
	public int compare(Client o1, Client o2) {
		return (o1.getLastName().compareToIgnoreCase(o2.getLastName()))==0?
				o2.getName().compareToIgnoreCase(o1.getName()):o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

}
