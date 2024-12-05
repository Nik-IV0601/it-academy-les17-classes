package by.it_academy_simplest.classes_and_objects;

public class Bank {

	private Customer[] customList;
	private int countCustom = 0;

	public Bank(int countCustom) {
		customList = new Customer[countCustom];
	}

	public Bank(Customer[] ds) {
		customList = ds;
		countCustom = ds.length;
	}

	public Customer[] getBuyerList() {
		return customList;
	}

	public void setBuyerList(Customer[] _customList) {
		this.customList = _customList;
	}

	public void print() {
		for (int i = 0; i < countCustom; i++) {
			customList[i].print();
			System.out.println();
		}
	}

	public void add(Customer b) {
		if (countCustom >= customList.length) {
			Customer[] temp = new Customer[customList.length];
			for (int i = 0; i < customList.length; i++) {
				temp[i] = customList[i];
			}
			customList = temp;
		}
		customList[countCustom++] = b;
	}

//	public void strSort(Customer c1, Customer c2) {
//		Customer temp = c1;
//		c1 = c2;
//		c2 = temp;
//	}

	public void patronymicSort() {

		int count = 0;
		do {
			for (int i = 0; i < customList.length - 1; i++) {
				if (!customList[i].getPatronymic().equals(customList[i + 1].getPatronymic())) {
					char[] arrStr0 = customList[i].getPatronymic().toCharArray();
					char[] arrStr1 = customList[i + 1].getPatronymic().toCharArray();
					int c1 = customList[i].getPatronymic().length();
					int c2 = customList[i + 1].getPatronymic().length();
					int minLength = c1 < c2 ? c1 : c2;
					int count1 = 0;
					for (int j = 0; j < minLength; j++) {
						if (arrStr0[j] == arrStr1[j]) {
							count1++;
							continue;
						} else if (arrStr0[j] > arrStr1[j]) {
							Customer temp = customList[i];
							customList[i] = customList[i + 1];
							customList[i + 1] = temp;
							break;
						} else {
							count++;
						}
					}
					if (count1 == minLength && c1 > c2) {
						Customer temp = customList[i];
						customList[i] = customList[i + 1];
						customList[i + 1] = temp;
						break;
					} else {
						count++;
					}
				} else {
					count++;
				}
			}
		} while (count < customList.length);
	}

	public void firstNameSort() {

		int count = 0;
		do {
			for (int i = 0; i < customList.length - 1; i++) {
				if (!customList[i].getFirstName().equals(customList[i + 1].getFirstName())) {
					char[] arrStr0 = customList[i].getFirstName().toCharArray();
					char[] arrStr1 = customList[i + 1].getFirstName().toCharArray();
					int c1 = customList[i].getFirstName().length();
					int c2 = customList[i + 1].getFirstName().length();
					int minLength = c1 < c2 ? c1 : c2;
					int count1 = 0;
					for (int j = 0; j < minLength; j++) {
						if (arrStr0[j] == arrStr1[j]) {
							count1++;
							continue;
						} else if (arrStr0[j] > arrStr1[j]) {
							Customer temp = customList[i];
							customList[i] = customList[i + 1];
							customList[i + 1] = temp;
							break;
						} else {
							count++;
						}
					}
					if (count1 == minLength && c1 > c2) {
						Customer temp = customList[i];
						customList[i] = customList[i + 1];
						customList[i + 1] = temp;
						break;
					} else {
						count++;
					}
				} else {
					count++;
				}
			}
		} while (count < customList.length);
	}

	public void lastNameSort() {

		int count = 0;
		do {
			for (int i = 0; i < customList.length - 1; i++) {
				if (!customList[i].getLastName().equals(customList[i + 1].getLastName())) {
					char[] arrStr0 = customList[i].getLastName().toCharArray();
					char[] arrStr1 = customList[i + 1].getLastName().toCharArray();
					int c1 = customList[i].getLastName().length();
					int c2 = customList[i + 1].getLastName().length();
					int minLength = c1 < c2 ? c1 : c2;
					int count1 = 0;
					for (int j = 0; j < minLength; j++) {
						if (arrStr0[j] == arrStr1[j]) {
							count1++;
							continue;
						} else if (arrStr0[j] > arrStr1[j]) {
							Customer temp = customList[i];
							customList[i] = customList[i + 1];
							customList[i + 1] = temp;
							break;
						} else {
							count++;
						}
					}
					if (count1 == minLength && c1 > c2) {
						Customer temp = customList[i];
						customList[i] = customList[i + 1];
						customList[i + 1] = temp;
						break;
					} else {
						count++;
					}
				} else {
					count++;
				}
			}
		} while (count < customList.length);
	}

	public void alphabetSort() {

		int count = 0;
		do {

			for (int i = 0; i < customList.length - 1; i++) {
				if (customList[i].getLastName().equals(customList[i + 1].getLastName())
						&& customList[i].getFirstName().equals(customList[i + 1].getFirstName())
						&& customList[i].getPatronymic().equals(customList[i + 1].getPatronymic())) {
					if (customList[i].getId() > customList[i + 1].getId()) {
						Customer temp = customList[i];
						customList[i] = customList[i + 1];
						customList[i + 1] = temp;
					} else {
						count++;
					}
				} else if (customList[i].getLastName().equals(customList[i + 1].getLastName())
						&& customList[i].getFirstName().equals(customList[i + 1].getFirstName())) {
					patronymicSort();

				} else if (customList[i].getLastName().equals(customList[i + 1].getLastName())) {
					firstNameSort();

				} else {
					lastNameSort();
				}
			}
		} while (count < customList.length);
	}

	public void listCustomeWithCardNumberInInterval(int creditCardNumberMin, int creditCardNumberMax) {

		if (creditCardNumberMin >= creditCardNumberMax | creditCardNumberMax == 0) {
			throw new RuntimeException("Невозможные параметры диапазона: min >= max или max = 0");
		}
		for (int i = 0; i < customList.length; i++) {
			if (customList[i].getCreditCardNumber() < creditCardNumberMax
					&& customList[i].getCreditCardNumber() > creditCardNumberMin) {
				customList[i].print();
			}
		}
	}

}
