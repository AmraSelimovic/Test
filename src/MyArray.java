
public class MyArray {
	
	private int[] array;

	MyArray(){
		
	}
	
	MyArray(int[] niz){
		this.array = niz;
	}
	
	public int getSmallestElement() {
		int najmanji = this.array[0];
		for(int i=0; i<this.array.length; i++) {
			if(najmanji > array[i]) {
				najmanji = array[i];
			}
			
		}
		return najmanji;
	}

	public int getLargestElement() {
		int najveci = this.array[0];
		for(int i=0; i<this.array.length; i++) {
			if(najveci < array[i]) {
				najveci = array[i];
			}
			
		}
		return najveci;
	}
	
	public int sumAllElements() {
		int suma=0;
		for(int i=0; i<array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	public void printAllElements() {
		System.out.println("Niz je oblika:");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
