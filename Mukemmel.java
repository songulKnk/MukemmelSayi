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

			return "M�kemmel bir say�";

		else

			return "M�kemmel de�il";

	}

	
	
	static void sayiyaKadarMukemmel(int sayi) {
		
		String sonuc;
		
		for(int i=1;i<=sayi;i++) 
		{
			sonuc=sayiMukemmelMi(i);
			if(sonuc.equals("M�kemmel bir say�"))
				System.out.println(i);
		}
		

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secim,sayi;
		String sonuc;// return ile d�nd�rmek i�in buna att�k bunla d�nd�rd�k
		do {

			System.out.println("Ne yapmak istiyorsunuz?" 
			+"\n1.Bir say�n�n m�kemmel olup olmad���n� sor"
			+ "\n2.Bir say�ya kadar bulunan t�m m�kemmel say�lar� listele" 
			+ "\n3.��k��(-1)");
			secim = input.nextInt();

			if (secim != 3) {

				switch (secim) {

				case 1:
					
					System.out.println("Say� girin:");
					sayi = input.nextInt();
					sonuc=sayiMukemmelMi(sayi);
					System.out.println("Sonu� "+sonuc);
					break;

				case 2:
					
					
					System.out.println("Say� girin:");
					sayi = input.nextInt();
					sayiyaKadarMukemmel(sayi);

					break;

				    default: System.out.println("Yanl�� se�im"); break;
				 
				}
			}
		} while (secim != 3);

		System.out.println("\nG�le g�le");

	}
}
