package n1exercici1;

public class Vent extends Instruments{
	
	private static String identificadorVent;
	
	//constructor
	
	public Vent (String nom, int preu) {
		super(nom, preu);
	}
	
	//static code block 
	
	static {
		identificadorVent= "0002";
	}
	
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
		
	}	
	
	//Mètode static
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorVent);
	}
	
	//toString

	public String toString () {
		String descripcio;
		descripcio = "L'instrument de vent és un " + nom + " i el seu preu és de " + preu;
		return descripcio;
	}

}
