import java.util.Scanner;

public class Mukemmel {

	static String sayiMukemmelMi(int sayi) {

		
		int sayac = 0;

		for (int i = 1; i <= sayi / 2; i++) {

			if (sayi % i == 0) {

				sayac += i;
			}

		}
		if (sayac == sayi)

			return "Mükemmel bir sayý";

		else

			return "Mükemmel deðil";

	}

	
	
	static void sayiyaKadarMukemmel(int sayi) {
		
		String sonuc;
		
		for(int i=1;i<=sayi;i++) 
		{
			sonuc=sayiMukemmelMi(i);
			if(sonuc.equals("Mükemmel bir sayý"))
				System.out.println(i);
		}
		

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secim,sayi;
		String sonuc;// return ile döndürmek için buna attýk bunla döndürdük
		do {

			System.out.println("Ne yapmak istiyorsunuz?" 
			+"\n1.Bir sayýnýn mükemmel olup olmadýðýný sor"
			+ "\n2.Bir sayýya kadar bulunan tüm mükemmel sayýlarý listele" 
			+ "\n3.Çýkýþ(-1)");
			secim = input.nextInt();

			if (secim != 3) {

				switch (secim) {

				case 1:
					
					System.out.println("Sayý girin:");
					sayi = input.nextInt();
					sonuc=sayiMukemmelMi(sayi);
					System.out.println("Sonuç "+sonuc);
					break;

				case 2:
					
					
					System.out.println("Sayý girin:");
					sayi = input.nextInt();
					sayiyaKadarMukemmel(sayi);

					break;

				    default: System.out.println("Yanlýþ seçim"); break;
				 
				}
			}
		} while (secim != 3);

		System.out.println("\nGüle güle");

	}
}
