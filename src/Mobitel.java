import java.util.ArrayList;

public class Mobitel {
	
	private String proizvodjac;
	private String model;
	private double brzinaProcesora;
	private int brojJezgriProcesora;
	private double kolicinaRamMemorije;
	private double kolicinaMemorije;
	private double brojMegapiksela;

	
	public Mobitel(String proizvodjac, String model, double brzinaProcesora, int brojJezgriProcesora,
			        double kolicinaRamMemorije, double kolicinaMemorije, double brojMegapiksela) {
		
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.brzinaProcesora = brzinaProcesora;
		this.brojJezgriProcesora = brojJezgriProcesora;
		this.kolicinaRamMemorije = kolicinaRamMemorije;
		this.kolicinaMemorije = kolicinaMemorije;
		this.brojMegapiksela = brojMegapiksela;
		
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public int getBrojJezgriProcesora() {
		return brojJezgriProcesora;
	}

	public void setBrojJezgriProcesora(int brojJezgriProcesora) {
		this.brojJezgriProcesora = brojJezgriProcesora;
	}

	public double getKolicinaRamMemorije() {
		return kolicinaRamMemorije;
	}

	public void setKolicinaRamMemorije(double kolicinaRamMemorije) {
		this.kolicinaRamMemorije = kolicinaRamMemorije;
	}

	public double getKolicinaMemorije() {
		return kolicinaMemorije;
	}

	public void setKolicinaMemorije(double kolicinaMemorije) {
		this.kolicinaMemorije = kolicinaMemorije;
	}

	public double getBrojMegapiksela() {
		return brojMegapiksela;
	}

	public void setBrojMegapiksela(double brojMegapiksela) {
		this.brojMegapiksela = brojMegapiksela;
	}

	
	
	
	public void ispisi() {
		System.out.println("Proizvodjac: " + proizvodjac);
		System.out.println("Model: " + model);
		System.out.println("Brzina procesora: " + brzinaProcesora);
		System.out.println("Broj jezgri procesora: " + brojJezgriProcesora);
		System.out.println("Kolicina RAM memorije: " + kolicinaRamMemorije);
		System.out.println("Kolicina memorije: " + kolicinaMemorije);
		System.out.println("Broj megapiksela: " + brojMegapiksela);
		
	}



	 ArrayList<String> aplikacije = new ArrayList<String>();
	public void instalirajAplikaciju(String imeAplikacije) {
		
			if(!aplikacije.contains(imeAplikacije) && (aplikacije.size()<20)) {
				aplikacije.add(imeAplikacije);
			}
			else{
			System.out.println("Ova aplikacija je vec instalirana.");
		}
		
	}
	
	public void obrisiAplikaciju(String imeAplikacije) {
		
			if(aplikacije.contains(imeAplikacije)){
				aplikacije.remove(imeAplikacije);
			}
			else{
			System.out.println("Ova aplikacija nije ni instalirana.");
		}
	}
	
	public void ispisiAplikacije() {
		System.out.println("Instalirane aplikacije su:");
		for(int i=0; i<aplikacije.size(); i++) {
			System.out.println(aplikacije.get(i));
		}
	}
	
	public void ubaciSDKarticu(int povecano) {
		this.kolicinaMemorije += povecano;
		
		System.out.println("Trenutno stanje memorije poslije postavljanja SD kartice je:" + this.kolicinaMemorije);
	}

}
	