import java.util.ArrayList;
import java.util.Scanner;

public class MobitelTest {

	public static void main(String[] args) {
		Mobitel mobitel = new Mobitel ("Samsung", "S4", 1.8, 2, 3, 16, 8 );
		mobitel.aplikacije.add("E-Mail");
		mobitel.aplikacije.add("Messenger");
		mobitel.aplikacije.add("WhatsApp");
		mobitel.aplikacije.add("Microsoft Apps");
		
		System.out.println("Osobine (konfiguracija) mobitela:");
		mobitel.ispisi();
		System.out.println();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Unesite aplikaciju koju zelite instalirati: ");
		String aplikacija = input.nextLine();
		mobitel.instalirajAplikaciju(aplikacija);
		System.out.println();
		
		System.out.println("Unesite aplikaciju koju zelite izbrisati: ");
		String aplikacija2 = input.nextLine();
		mobitel.obrisiAplikaciju(aplikacija2);
		
		System.out.println("Aplikacije koje su instalirane:");
		mobitel.ispisiAplikacije();
		

	}

}
