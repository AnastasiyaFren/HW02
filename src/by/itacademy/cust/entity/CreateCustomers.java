package by.itacademy.cust.entity;

public interface CreateCustomers {
	
	public static Customer[] CreateCustomersArray() {
		
		Customer Customer1 = new Customer(1, "Андрей",    "Петров",   "Николаевич",    "г.Минск, пр.Независсимости, д. 58, кв. 12",   12346543333909876L, "BY09 UNBS 4578 5566 7398 0001 2933");
		Customer Customer2 = new Customer(2, "Александр", "Иванов",   "Юрьевич",       "г.Брест, ул.Советская, д. 5, кв. 92",         22346000093909876L, "BY09 UNBS 9843 6777 6700 0001 2933");
		Customer Customer3 = new Customer(3, "Татьяна",   "Сидорова", "Викторовна",    "г.Минск, пр.Машерова, д. 9, кв. 10",          30000000000909876L, "BY09 UNBS 0000 4834 7398 0001 2933");
		Customer Customer4 = new Customer(4, "Ольга",     "Попова",   "Александровна", "г.Гомель, пр.Коммунистическая, д. 23, кв. 4", 72346543700001111L, "BY09 UNBS 9090 3322 0000 0001 2933");
		
		Customer CustomersArray[] = {Customer1, Customer2, Customer3, Customer4};
		
		return CustomersArray;
		
		
	}

}
