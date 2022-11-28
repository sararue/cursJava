package n1exercici1;

public class Vent extends Instruments{
	
	private static String identificadorVent = "0002";
	
	//constructor
	
	public Vent (String nom, int preu) {
		super(nom, preu);
	}
	
	//static code block 
	
	static {
		System.out.println("L'identificador dels instruments de vent és: " + identificadorVent);
	}
	
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
		
	}	
	
	//toString

	public String toString () {
		String descripcio;
		descripcio = "L'instrument de vent és un " + nom + " i el seu preu és de " + preu;
		return descripcio;
	}

}
