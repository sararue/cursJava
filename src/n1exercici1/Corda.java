package n1exercici1;

public class Corda extends Instruments {
	
	private static String identificadorCorda = "0001";
	
	//constructor
	
	public Corda (String nom, int preu) {
		super(nom, preu);
	}
	
	//mètode tocar
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
		
	}
	
	//mètode static
	
	public static void ensenyaIdentificador() {
		System.out.println(identificadorCorda);
	}

}
