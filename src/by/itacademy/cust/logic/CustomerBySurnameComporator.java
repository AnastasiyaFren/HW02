package by.itacademy.cust.logic;

import java.util.Comparator;
import by.itacademy.cust.entity.Customer;

public class CustomerBySurnameComporator implements Comparator<Customer> {

	@Override
	public int compare (Customer o1, Customer o2){
		
		 return o1.getSurname().compareTo(o2.getSurname());
	}

}

