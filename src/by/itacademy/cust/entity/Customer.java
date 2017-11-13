package by.itacademy.cust.entity;

public class Customer {
	
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private String address;
	private long CreditCard;
	private String BankAccount;
	
	public Customer() {}
	
	public Customer(int id, String name, String surname, String patronymic) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}
	
	public Customer(int id, String name, String surname, String patronymic, String address, long creditCard,
			String bankAccount) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.address = address;
		CreditCard = creditCard;
		BankAccount = bankAccount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BankAccount == null) ? 0 : BankAccount.hashCode());
		result = prime * result + (int) (CreditCard ^ (CreditCard >>> 32));
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (BankAccount == null) {
			if (other.BankAccount != null)
				return false;
		} else if (!BankAccount.equals(other.BankAccount))
			return false;
		if (CreditCard != other.CreditCard)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer <id = " + id + ", name = " + name + 
				", surname = " + surname + ", patronymic = " + patronymic +
				", address = " + address + ", CreditCard = " + CreditCard +
				", BankAccount = " + BankAccount + ">";
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(long creditCard) {
		CreditCard = creditCard;
	}
	public String getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}

	
	
}
