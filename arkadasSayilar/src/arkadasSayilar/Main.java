package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284

		int number1 = 220;
		int number2 = 500;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {
				//System.out.println("i = " + i);
				total1 = total1 + i;
				// System.out.println("Toplam1 = " + total1);
			}

		}

		for (int j = 1; j < number2; j++) {

			if (number2 % j == 0) {
				//System.out.println("j = " + j);
				total2 = total2 + j;
				// System.out.println("Toplam2 = " + total2);
			}

		}
		System.out.println("Toplam1 = " + total1);
		System.out.println("Toplam2 = " + total2);

		if ((total1 == number2) && (total2 == number1)) {
			System.out.println("Sayilar Arkadaş Sayidir.");
		} else {
			System.out.println("Sayilar Arkadaş Sayi Değildir.");
		}
	}

}
