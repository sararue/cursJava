package n1exercici1;

public class Vent extends Instruments{
	
	private static String identificadorVent = "0002";
	
	//constructor
	
	public Vent (String nom, int preu) {
		super(nom, preu);
	}
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
		
	}
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorVent);
	}

}
