package by.it_academy_simplest.classes_and_objects;

public class Customer {

	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String[] address;
	private int creditCardNumber;
	private String bankAccountNumber;
		
	public Customer() {
	}

	public Customer(int id, String lastName, String firstName, String patronymic, String[] address, int creditCardNumber, String bankAccountNumber) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public void print() {
		System.out.println("             id - " + id);
		System.out.println("        Фамилия - " + lastName);
		System.out.println("            Имя - " + firstName);
		System.out.println("       Отчество - " + patronymic);
		System.out.printf("          Адрес - Улица %s, %s\n", address[0], address[1]);
		System.out.println("Кредитная карта - " + creditCardNumber);
		System.out.println("Банковский счёт - " + bankAccountNumber);
	}

}
