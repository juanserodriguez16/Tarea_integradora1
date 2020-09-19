package model;

public class Client {
	
	private String idType;
	private String idNumber;
	private String fullName;
	private String phone;
	private String adrress;
	
	
	public Client(String idType, String idNumber, String fullName, String phone, String adrress) {
		super();
		this.idType = idType;
		this.idNumber = idNumber;
		this.fullName = fullName;
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


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
	
	
	
	

}
