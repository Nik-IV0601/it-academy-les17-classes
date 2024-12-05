package by.it_academy_simplest.classes_and_objects;

import java.util.ArrayList;
import java.util.List;

public class MainTask10 {

	public static void main(String[] args) {

		List<Airline> port = new ArrayList<>();
		port.add(new Airline("Москва", 123, "ТУ154", new int[] { 16, 57 }, new String[] { "СБ", "BC" }));
		port.add(new Airline("Пермь", 183, "ТУ164", new int[] { 6, 26 }, new String[] { "ПН", "СР", "ПТ" }));
		port.add(new Airline("Астана", 1183, "ТУ164", new int[] { 9, 00 }, new String[] { "ВТ", "ЧТ", "СБ" }));
		port.add(new Airline("Астана", 1184, "ТУ164", new int[] { 11, 00 }, new String[] { "СР", "ПТ", "ВС" }));
		port.add(new Airline("Владивосток", 2182, "Superjet", new int[] { 11, 00 }, new String[] { "ПН" }));

		for (int i = 0; i < port.size(); i++) {
			System.out.println(port.get(i));
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		flightsDestination(port, "Астана"); // список рейсов для заданного пункта назначения;
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		flightsDayOfWeek(port, "ПН", new int[] { 00, 05 }); // список рейсов заданного дня недели...если {время > 0,0},
															// то выдаст только рейсы после этого времени;
	}

	public static void flightsDestination(List<Airline> port, String str) {
		for (int i = 0; i < port.size(); i++) {
			Airline g = port.get(i);
			if (g.getDestination().contains(str)) {
				System.out.println(port.get(i));
			}
		}
	}

	public static void flightsDayOfWeek(List<Airline> port, String day, int[] timeInDay) {

		String str = timeInDay[0] + timeInDay[1] > 0 ? "после " + Airline.intToStr(timeInDay) : "";
		System.out.printf("В %s %s можем предложить :\n", day, str);
		for (int i = 0; i < port.size(); i++) {
			Airline g = port.get(i);
			for (int j = 0; j < g.getDaysOfWeek().length; j++) {
				if (g.getDaysOfWeek()[j].contains(day) && (g.getTimeDeparture()[0] * 60
						+ g.getTimeDeparture()[1]) >= (timeInDay[0] * 60 + timeInDay[1])) {
					System.out.println(port.get(i));
				}
			}
		}
	}

}
