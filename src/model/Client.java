package model;

import java.io.Serializable;



public class Client implements Serializable{
	
	private static final long serialVersionUID = -1L;
	
	private String idType;
	private String idNumber;
	private String name;
	private String lastName;
	private int phone;
	private String adrress;
	
	
	public Client(String idType, String idNumber, String name, String lastName, int phone, String adrress) {
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


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getAdrress() {
		return adrress;
	}


	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Nombre del cliente " + name + " " +lastName + " telefono " + phone;
		return "Nombre Completo " + name + " " +lastName + "; tipo de Id " + idType + " ;num de ID "+ idNumber + " ;telefono " + phone + " ;dirección "+adrress;
	}



	
	
	
	

}
