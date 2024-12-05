package by.it_academy_simplest.classes_and_objects;

import java.util.Arrays;
import java.util.Objects;

public class Airline {

	private String destination;
	private int numberFlight;
	private String typeAircraft;
	private int[] timeDeparture;
	private String[] daysOfWeek;

	public Airline() {
	}

	public Airline(String destination, int numberFlight, String typeAircraft, int[] timeDeparture,
			String[] daysOfWeek) {
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typeAircraft = typeAircraft;
		this.timeDeparture = timeDeparture;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public int[] getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(int[] timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public String[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public static String intToStr(int[] timeDeparture) {
		String hh, mm;
		if (timeDeparture[0] < 10) {
			hh = "0" + timeDeparture[0];
		} else {
			hh = ""+ timeDeparture[0];
		}
		if (timeDeparture[1] < 10) {
			mm = "0" + timeDeparture[1];
		}else {
			mm = ""+ timeDeparture[1];
		}
		return hh + ":" + mm;
	}
	@Override
	public String toString() {
		return "Пункт назначения : " + destination + "\t" + "Рейс № : " + numberFlight + "\t" + "Тип самолета : "
				+ typeAircraft + "\tВылет : " + intToStr(timeDeparture) + "\tДни недели : "
				+ Arrays.toString(daysOfWeek);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(daysOfWeek);
		result = prime * result + Arrays.hashCode(timeDeparture);
		result = prime * result + Objects.hash(destination, numberFlight, typeAircraft);
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
		Airline other = (Airline) obj;
		return Arrays.equals(daysOfWeek, other.daysOfWeek) && Objects.equals(destination, other.destination)
				&& numberFlight == other.numberFlight && Arrays.equals(timeDeparture, other.timeDeparture)
				&& Objects.equals(typeAircraft, other.typeAircraft);
	}

}
