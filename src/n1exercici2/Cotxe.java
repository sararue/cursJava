package n1exercici2;

public class Cotxe {
	
	private static final String marca = "seat";
	private static String model;
	private final int potencia;
	
	//Constructors
	public Cotxe (int potencia) {
		this.potencia=potencia;
		model = "leon";
	}
	
	static {
		model = "ibiza";
	}

	//Mètodes
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public String toString() {
		String descripcio = "La marca del cotxe és " + marca + " el model és " + model + " i la potencia és de " + potencia + " cavalls.";
		return descripcio;
	}

}
