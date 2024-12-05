//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
//данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
//поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
//возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
//быть упорядочены по времени отправления.

package by.it_academy_simplest.classes_and_objects;

public class Train {
	private String punktNaznachenya;
	private int nomerPoezda;
	private int[] vremyaOtpravlenya = new int[2];
	
//	

	public Train(String _punktNaznachenya, int _nomerPoezda, int[] _vremyaOtpravlenya) {
		punktNaznachenya = _punktNaznachenya;
		nomerPoezda = _nomerPoezda;
		vremyaOtpravlenya = _vremyaOtpravlenya;
	}
	
	public String getPunktNaznachenya() {
		return punktNaznachenya;
	}

	public void setPunktNaznachenya(String punktNaznachenya) {
		this.punktNaznachenya = punktNaznachenya;
	}
	
	public int[] getVremyaOtpravlenya() {
		return vremyaOtpravlenya;
	}

	public void setVremyaOtpravlenya(int[] vremyaOtpravlenya) {
		this.vremyaOtpravlenya = vremyaOtpravlenya;
	}
	
	public int getNomerPoezda() {
		return nomerPoezda;
	}

	public void setNomerPoezda(int nomerPoezda) {
		this.nomerPoezda = nomerPoezda;
	}
	
	public void print() {
		System.out.println(" Пункт назначения - " + punktNaznachenya);
		System.out.println("     Номер поезда - " + nomerPoezda);
		System.out.printf("Время отправления - %d:%d\n", vremyaOtpravlenya[0], vremyaOtpravlenya[1]);
	}

	
	
	
}
