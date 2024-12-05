package by.it_academy_simplest.classes_and_objects;
//import by.it_academy_simplest.classes_and_objects.Bank;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		System.out.println("Задание 1");
//		Test1 v = new Test1(6, 5);
//		v.print();
//		System.out.println(v.max());
//		System.out.println("a + b = " + v.sum());

//		System.out.println("Задание 2");
//		Test2 w = new Test2(4, 7);
//		w.print();

//		System.out.println("Задание 3");
//		Student[] vt = { new Student("Иванов И.И", "40a", new int[] { 9, 9, 10, 10, 9 }),
//				new Student("Петров П.П", "40с", new int[] { 9, 9, 9, 9, 9 }),
//				new Student("Безфамильный А.И", "41", new int[] { 8, 8, 8, 6, 7 }),
//				new Student("Сидоров С.С", "40b", new int[] { 9, 8, 10, 10, 9 }) };
//		printVt(vt);

		System.out.println("Задание 4: Train");
		Train[] rw = { new Train("Minsk", 643, new int[] { 13, 47 }), new Train("Vitebsk", 641, new int[] { 19, 37 }),
				new Train("Mins", 642, new int[] { 6, 18 }), new Train("Gomel", 640, new int[] { 6, 22 }), };

		sortRwPoNomeru(rw);
		infOPoezde(rw);
		sortRwPoPunktNaznachenya(rw);
		printRw(rw);

//		System.out.println("Задание 5");
//		Task5 coun = new Task5(2, 20);
//		System.out.println("Текущее значение счётчика : " + coun.getCount());

//		System.out.println("Задание 6"); // доделать
//		Time t1 = new Time (12,);
//		Time t2 = new Time (12,);
		
//		System.out.println("Задание 8");
//		Customer[]	asb =	{
//				new Customer (1119, "Малаще", "Пётр", "Иван", new String[] {"Юности", "50"}, 111, "BY456789188963"),
//			    new Customer (1110, "Малаще", "Пётр", "Иван", new String[] {"Юности", "59"}, 123, "BY456789188963"),
//			    new Customer (1108, "Малаще", "Пётр", "Иван", new String[] {"Юности", "59"}, 123, "BY456789188963"),
//			    new Customer (1132, "Малаще", "Пётр", "Иван", new String[] {"Жданова", "11"}, 523, "BY456786188963")};
//		Bank bank = new Bank (asb);	   
//		bank.print();

//		bank.lastNameSort();
//		bank.firstNameSort();
//		bank.patronymicSort();
//		bank.alphabetSort();
//		bank.print();
//		bank.listCustomeWithCardNumberInInterval(110, 522);
		
//		System.out.println("Задание 9");
//		Library library = new Library();
//		boolean result = library.add(new Book(1, "Java", "Ekkel", 310));
//		library.add(new Book(2, "C++", "Straustrup", 300));
//		library.add(new Book(3, "Asm", "Pinsler", 300));
//		library.print();
//		library.delete(2);
//		library.print();

// для лист
//		
//		List<Book> books = new ArrayList<Book>();
//
//		books.add(new Book(1, "Java", "Ekkel", 310));
//		books.add(new Book(2, "C++", "Straustrup", 300));
//		books.add(new Book(3, "Asm", "Pinsler", 300));
//
//		System.out.println("--------------------------");
//		System.out.println("--------------------------");
//		for (int i = 0; i < books.size(); i++) {
//			Book b = books.get(i);//books[i]
//			String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
//			System.out.println(i + " - " + message);
//		}
//		
//		books.add(new Book(4, "Ada", "Lavleis", 600));
//		books.add(2, new Book(5, "C", "Kernigan", 300));
//		
//		System.out.println("--------------------------");
//		for (int i = 0; i < books.size(); i++) {
//			Book b = books.get(i);
//			String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
//			System.out.println(i + " - " + message);
//		}
//		
//		books.remove(3);
//		
//		System.out.println("--------------------------");
//		for (int i = 0; i < books.size(); i++) {
//			Book b = books.get(i);
//			String message = "Book: id="+b.getId() + ", title="+b.getTitle()+", author="+b.getAuthor()+", price="+b.getPrice();
//			System.out.println(i + " - " + message);
//		}		
//		List<String> list = new ArrayList<>();
////		List<Integer> list1 = new ArrayList<Integer>();
//		
//		list.add("White");
//		list.add("Black");
//		list.add("Red");
//		list.add("Yellow");
//		list.add("Orange");
//		list.add("Green");
//
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " - " + list.get(i));//list[i]
//		}
//
//		list.remove(2);
//
//		System.out.println("--------------------------");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " - " + list.get(i));
//		}

	}

	public static void printVt(Student[] vt) {

		int count = 1;
		for (int i = 0; i < vt.length; i++) {
			int temp = 0;
			for (int j = 0; j < 5; j++) {
				if (vt[i].getBall()[j] > 8) {
					temp++;
				}
			}
			if (temp == 5) {
				System.out.print(count + ") ");
				vt[i].print();
				count++;
			}
		}
	}

	public static void infOPoezde(Train[] rw) {

		Scanner inpNomerPoezda = new Scanner(System.in);
		System.out.print("Введите номер поезда : ");
		int n = inpNomerPoezda.nextInt();
		int count = 0;
		for (int i = 0; i < rw.length; i++) {
			if (n == rw[i].getNomerPoezda()) {
				rw[i].print();
				System.out.println();
			} else {
				count++;
			}
		}
		if (count == rw.length) {
			System.out.print("В графике нет поезда с таким номером\n");
		}
	}

	public static void sortRwPoNomeru(Train[] rw) {

		int count = 0;
		do {
			for (int i = 0; i < rw.length - 1; i++) {
				if (rw[i].getNomerPoezda() > rw[i + 1].getNomerPoezda()) {
					Train temp = rw[i];
					rw[i] = rw[i + 1];
					rw[i + 1] = temp;
				} else {
					count++;
				}
			}
		} while (count != rw.length - 1);
	}

	public static void sortRwPoPunktNaznachenya(Train[] rw) {

		int count = 0;
		do {
			for (int i = 0; i < rw.length - 1; i++) { // перебираем список поездов
				int minLength = 0; // в эту переменную запишем нименьшую длинну строки (пункта назначения) из двух
									// соседних сравниваемых
				if (rw[i].getPunktNaznachenya().length() < rw[i + 1].getPunktNaznachenya().length()) {
					minLength = rw[i].getPunktNaznachenya().length();
				} else {
					minLength = rw[i + 1].getPunktNaznachenya().length();
				}
				char[] arrStr0 = rw[i].getPunktNaznachenya().toCharArray(); // преобразуем строку (пункт назначения 1) в
																			// массив символов
				char[] arrStr1 = rw[i + 1].getPunktNaznachenya().toCharArray(); // преобразуем строку (пункт назначения
																				// 2) в массив символов
				int count1 = 0; // счётчик количества совпадений символов в названях городов (пунктов
								// назначения)
				for (int j = 0; j < minLength; j++) { // перебираем символы в обоих пунктах назначения пока не
														// закончатся буквы в наиболее коротком из них
					if (arrStr0[j] == arrStr1[j]) { // если символы на одинаковых позициях j равны,
						count1++; // то увеличиваем счётчик совпадений символов на 1
						continue; // завершаем эту итерацию, так как символы одинаковы и дальнейшая работа с ними
									// бессмысленна
					} else if (arrStr0[j] > arrStr1[j]) { // но если символ на позиции j первого города имеет большее
						Train temp = rw[i]; // значение (в Юникод по алфавиту стоит дальше) чем символ
						rw[i] = rw[i + 1]; // на этой позиции второго города
						rw[i + 1] = temp;
						break;
					} else {
						count++;
						break;
					}
				}
				if (count1 == minLength
						&& rw[i].getPunktNaznachenya().length() > rw[i + 1].getPunktNaznachenya().length()) {
					Train temp = rw[i];
					rw[i] = rw[i + 1];
					rw[i + 1] = temp;
				}
			}
		} while (count < rw.length); // пока количество поездов, которые не меняли позицию, меньше количества поездов
										// в массиве

// Далее - сортировка по времени поездов с одинаковым пунктом назначения
		for (int i = 0; i < rw.length - 1; i++) {
			if (rw[i].getPunktNaznachenya().equals(rw[i + 1].getPunktNaznachenya())) { // есть ли в списке одинаковые
																						// пункты назначения
				for (int j = 0; j < 2; j++) { // если есть, работаем со временем их отправления
					int time0 = rw[i].getVremyaOtpravlenya()[0] * 60 + rw[i].getVremyaOtpravlenya()[1]; // переводим час
																										// отправления в
																										// минуты и
																										// складываем с
																										// минутами
																										// отправления
					int time1 = rw[i + 1].getVremyaOtpravlenya()[0] * 60 + rw[i + 1].getVremyaOtpravlenya()[1];
					if (time0 > time1) { // если время отправления первого из одинаковых поездов позже второго
						Train temp = rw[i]; // через посредника temp меняем такие поезда в списке местами
						rw[i] = rw[i + 1];
						rw[i + 1] = temp;
					}
				}
			}
		}
	}

	public static void printRw(Train[] rw) {

		for (int i = 0; i < rw.length; i++) {
			rw[i].print();
			System.out.println();
		}
	}

}