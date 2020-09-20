package model;

public class Client implements Comparable<Client>{
	
	private String idType;
	private String idNumber;
	private String name;
	private String lastName;
	private String phone;
	private String adrress;
	
	
	public Client(String idType, String idNumber, String name, String lastName, String phone, String adrress) {
		super();
		this.idType = idType;
		this.idNumber = idNumber;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.adrress = adrress;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAdrress() {
		return adrress;
	}


	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}


	@Override
	public int compareTo(Client o) {
		
		return 0;
	}
	
	
	
	
	

}
