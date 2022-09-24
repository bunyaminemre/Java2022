
public class MainSwitchDemo {

	public static void main(String[] args) {
		char grade = 'a';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");

			// Ctrl + Shift + F Kodları Hızlıca Basamak Yapar.
		}

	}

}
