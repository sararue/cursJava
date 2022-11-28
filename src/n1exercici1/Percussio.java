package n1exercici1;

public class Percussio extends Instruments {
	private static String identificadorPercussio = "0003";
	
	//constructor
	
	public Percussio (String nom, int preu) {
		super(nom, preu);
	}
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
		
	}
	
	//mètode static
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorPercussio);
	}
	

}
