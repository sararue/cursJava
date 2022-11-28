package n1exercici2;

public class App {
	
	public static void main (String [] args) {
		
		Cotxe cotxe1 = new Cotxe();
		Cotxe cotxe2 = new Cotxe();
		
		Cotxe.frenar();
		cotxe1.accelerar();
		cotxe2.accelerar();
		
		System.out.println(cotxe2.toString());
		
		
	}
	/*Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.*/



}
