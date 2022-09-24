package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'e';

		switch (harf) {
		
		case 'A': 
		case 'O': 
		case 'U': 
		case 'I': 
		case 'a': 
		case 'o': 
		case 'u': 
		case 'ı': 
			System.out.println("Harf Kalın Seslidir."); break;
		default:
			System.out.println("Harf İnce Seslidir.");
		
		

		}

	}

}
