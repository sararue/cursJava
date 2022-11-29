package n1exercici1;

public class Corda extends Instruments {
	
	private static String identificadorCorda;
	
	//constructor
	
	public Corda (String nom, int preu) {
		super(nom, preu);
	}
	
	//static bloc codi
	static {
		identificadorCorda = "0001";
	}
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
		
	}
	
	//mètode static
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorCorda);
	}

	//toString

		public String toString () {
			String descripcio;
			descripcio = "L'instrument de corda és un " + nom + " i el seu preu és de " + preu;
			return descripcio;
		}

}
