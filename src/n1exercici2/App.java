package n1exercici2;

public class App {
	
	public static void main (String [] args) {
		
		Cotxe cotxe1 = new Cotxe(500);
		Cotxe cotxe2 = new Cotxe(300);
		
		Cotxe.frenar();
		cotxe1.accelerar();
		cotxe2.accelerar();
		
		System.out.println(cotxe2.toString());
		
		
	}
	/*Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.*/



}
