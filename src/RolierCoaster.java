import java.util.Scanner;

public class RolierCoaster {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite neku recenicu:");
		String recenica = unos.nextLine();
		
		
		Scanner input = new Scanner(recenica);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			
			for(int i=0; i<line.length(); i++) {
				if(i%2==0) {
				
					char ch =  Character.toUpperCase(line.charAt(i));
					System.out.print(ch);
				}
				if(i%2!=0) {
					
					char ch =  Character.toLowerCase(line.charAt(i));
					System.out.print(ch);
				}
				
				
			}
			
			
		

		}
		
		
	}

}
