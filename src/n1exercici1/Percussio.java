package n1exercici1;

public class Percussio extends Instruments {
	private static String identificadorPercussio = "0003";
	
	//constructor
	
	public Percussio (String nom, int preu) {
		super(nom, preu);
	}
	
	//static bloc codi
	static {
		System.out.println("L'identificador dels instruments de percussió és: " + identificadorPercussio);
	}
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
		
	}
	
	//mètode static
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorPercussio);
	}
	
	//toString

		public String toString () {
			String descripcio;
			descripcio = "L'instrument de percussió és un " + nom + " i el seu preu és de " + preu;
			return descripcio;
		}

	

}
