package n1exercici2;

public class Cotxe {
	
	private static final String marca = "seat";
	private static String model;
	private final int potencia = 500;
	
	static {
		model = "leon";
	}

	//Mètodes
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}

}
