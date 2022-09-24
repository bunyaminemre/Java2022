
public class MainReCapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 300;
		int sayi2 = 25;
		int sayi3 = 2000;
		int sayiEnBuyuk,sayiEnKucuk;
		
		sayiEnBuyuk=sayi1;
		sayiEnKucuk=sayi2;
		
		if (sayi2>sayiEnBuyuk) {
			sayiEnBuyuk=sayi2;
		}
		if (sayi3>sayiEnBuyuk) {
			sayiEnBuyuk=sayi3;
		}
		if (sayiEnKucuk>sayi1) {
			sayiEnKucuk=sayi1;
		}
		if (sayiEnKucuk>sayi3) {
			sayiEnKucuk=sayi3;
		}
		
		System.out.println("En büyük sayı : " +sayiEnBuyuk);
		System.out.println("En küçük sayı : " +sayiEnKucuk);
		
	}

}
