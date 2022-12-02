package n1exercici1;

public class Percussio extends Instruments {
	private static String identificadorPercussio;
	
	//constructor
	
	public Percussio (String nom, int preu) {
		super(nom, preu);
	}
	
	//static bloc codi
	static {
		identificadorPercussio = "0003";
	}
	//mètode tocar
	
    @Override
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
