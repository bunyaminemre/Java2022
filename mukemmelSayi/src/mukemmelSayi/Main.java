package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// mükemmel sayı; tüm tam bölenlerinin toplamı kendisidir.
		// 6--- 1,2,3
		// 28---1,2,4,7,14

		int number = 27;
		int total = 0;
		

		for (int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				System.out.println("i = " + i);
				total = total + i;
				System.out.println("Toplam = " + total);}
			
		}
		if (total == number) {
			System.out.println("Sayi Mükemmel Sayidir.");
		} else {
			System.out.println("Sayi Mükemmel Sayi Dğildir.");
		}
	}

}
