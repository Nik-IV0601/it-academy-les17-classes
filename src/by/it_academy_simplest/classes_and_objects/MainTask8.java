package by.it_academy_simplest.classes_and_objects;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.Comparator;

public class MainTask8 {

	public static void main(String[] args) {
		
//------------------------------------через List-------------------------------------------
		List<Customer> groop = new ArrayList<>();

		groop.add(new Customer(1111, "Малашенков", "Пётр", "Иванович", new String[] { "Юности", "50" }, 111,
				"BY456789188963"));
		groop.add(new Customer(1112, "Малашенков", "Пётр", "Петрович", new String[] { "Юности", "20" }, 115,
				"BY456789188963"));
		groop.add(new Customer(1103, "Игнатов", "Ииигорь", "Иванович", new String[] { "Юности", "5" }, 101,
				"BY456789188993"));
// Просто вывод всего списка на печать
//		for (int i = 0; i < groop.size(); i++) {
//			Customer g = groop.get(i);
//			System.out.println("             id - " + g.getId());
//			System.out.println("        Фамилия - " + g.getLastName());
//			System.out.println("            Имя - " + g.getFirstName());
//			System.out.println("       Отчество - " + g.getPatronymic());
//			System.out.printf("          Адрес - Улица %s, дом %s\n", g.getAddress()[0], g.getAddress()[1]);
//			System.out.println("Кредитная карта - " + g.getCreditCardNumber());
//			System.out.println("Банковский счёт - " + g.getBankAccountNumber());
//			System.out.println("-------------------------------------");
//		}

// Сортировка по ФИО работает, но это мы не проходили:)		
//		Comparator<Customer> compareByString = Comparator.comparing(Customer::getLastName)
//				.thenComparing(Customer::getFirstName).thenComparing(Customer::getPatronymic);
//
//		ArrayList<Customer> sortedCustomer = groop.stream().sorted(compareByString)
//				.collect(Collectors.toCollection(ArrayList::new));
//
//		for (Customer g : sortedCustomer) {
//			System.out.println("             id - " + g.getId());
//			System.out.println("        Фамилия - " + g.getLastName());
//			System.out.println("            Имя - " + g.getFirstName());
//			System.out.println("       Отчество - " + g.getPatronymic());
////			System.out.printf("          Адрес - Улица %s, дом %s\n", g.getAddress()[0], g.getAddress()[1]);
////			System.out.println("Кредитная карта - " + g.getCreditCardNumber());
////			System.out.println("Банковский счёт - " + g.getBankAccountNumber());
//			System.out.println("-------------------------------------");
//		}

// Сортировка по картам в диапазоне работает			
		int creditCardNumberMin = 100;
		int creditCardNumberMax = 112;
		System.out.println(
				"\nСортировка по картам в диапазоне :" + creditCardNumberMin + " - " + creditCardNumberMax + "\n");
		if (creditCardNumberMin >= creditCardNumberMax | creditCardNumberMax == 0) {
			throw new RuntimeException("Невозможные параметры диапазона: min >= max или max = 0");
		}
		for (int i = 0; i < groop.size(); i++) {
			Customer g = groop.get(i);
			if (g.getCreditCardNumber() < creditCardNumberMax && g.getCreditCardNumber() > creditCardNumberMin) {
				System.out.println("             id - " + g.getId());
				System.out.println("        Фамилия - " + g.getLastName());
//			System.out.println("            Имя - " + g.getFirstName());
//			System.out.println("       Отчество - " + g.getPatronymic());
//			System.out.printf("          Адрес - Улица %s, дом %s\n", g.getAddress()[0], g.getAddress()[1]);
				System.out.println("Кредитная карта - " + g.getCreditCardNumber());
//				System.out.println("Банковский счёт - " + g.getBankAccountNumber());
				System.out.println("-------------------------------------");
			}
		}
//----------------------------------------------через дополнительный класс----------------------------------------------------
		Customer[]	asb =	{
				new Customer (1119, "Малаще", "Пётр", "Иван", new String[] {"Юности", "50"}, 111, "BY456789188963"),
			    new Customer (1110, "Малаще", "Пётр", "Иван", new String[] {"Юности", "59"}, 123, "BY456789188963"),
			    new Customer (1108, "Малаще", "Пётр", "Иван", new String[] {"Юности", "59"}, 123, "BY456789188963"),
			    new Customer (1132, "Малаще", "Пётр", "Иван", new String[] {"Жданова", "11"}, 523, "BY456786188963")};
		Bank bank = new Bank (asb);	   
//		bank.print();

//		bank.lastNameSort();
//		bank.firstNameSort();
//		bank.patronymicSort();
		bank.alphabetSort();
		bank.print();
//		bank.listCustomeWithCardNumberInInterval(110, 522);
		
	}
}
