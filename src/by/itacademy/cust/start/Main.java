/* Вариант А
 * Создать классы, спецификации которых приведены ниже. 
 * Определить конструкторы и методы setТип(), getТип(), toString(). 
 * Определить дополнительно методы в классе, создающем массив объектов. 
 * Задать критерий выбора данных и вывести эти данные на консоль. 
 * В каждом классе, обладающем информацией, 
 * должно быть объявлено несколько конструкторов.
 * 2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
 * Номер банковского счета.
 * Создать массив объектов. Вывести:
	a) список покупателей в алфавитном порядке;
	b) список покупателей, у которых номер кредитной карточки находится
    в заданном интервале.*/

package by.itacademy.cust.start;

import java.util.Arrays;
import by.itacademy.cust.entity.Customer;
import by.itacademy.cust.entity.CreateCustomers;
import by.itacademy.cust.logic.CustomerBySurnameComporator;

public class Main {

	public static void main(String[] args) {
				
		Customer[] CustomersList = CreateCustomers.CreateCustomersArray();
		
		// сортировка
		Arrays.sort(CustomersList, new CustomerBySurnameComporator());
		
		System.out.println("Cписок покупателей в алфавитном порядке (по фамилии):");
		for (Customer Cust : CustomersList)
			System.out.println(Cust.getSurname() + " " + Cust.getName());
		
		// проверка, находится ли номер карты в заданном интервале
		
		long StartValue = 10000000000000000L;
		long FinishValue = 50000000000000000L;
		
		System.out.println();
		System.out.println("Cписок покупателей, у которых номер кредитной карточки находится в интервале от " + StartValue + " до " + FinishValue + ":");
		
		for (Customer Cust : CustomersList) {
			if (Cust.getCreditCard() > StartValue && Cust.getCreditCard() < FinishValue)
				System.out.println(Cust.getSurname() + " " + Cust.getName() + ": " + Cust.getCreditCard());
		}
		
	}

}

