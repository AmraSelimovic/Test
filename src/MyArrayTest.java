
public class MyArrayTest {
	public static void main(String[] args) {
		
		int[] niz = new int[7];
		
		for(int i=0; i<niz.length; i++) {
			niz[i] = (int)(Math.random()*10);
		}
		
		System.out.println("Niz ima vrijednosti:");
		
		for(int i=0; i<niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		
		MyArray mojNiz = new MyArray(niz);
		
		int najmanjiElement = mojNiz.getSmallestElement();
		System.out.println("Najmanji element u nizu je:" + najmanjiElement);
		
		int najveciElement = mojNiz.getLargestElement();
		System.out.println("Najveci element u nizu je: " + najveciElement);
		
		int sumaElemenata = mojNiz.sumAllElements();
		System.out.println("Suma svih elemenata niza je: " + sumaElemenata);
		
		mojNiz.printAllElements();
		
		
	}
}
