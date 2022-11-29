package n1exercici1;

public class Main {
    public static void main(String[] args) {
    	
    	//cridem mètode static de la classe Corda
    	
    	Corda.ensenyaIdentificador();
    	
    	//Creem variables de diferents classes per veure la instància

    	
    	Vent vent1 = new Vent("Flauta",300);
    	Percussio percussio1 = new Percussio ("Tambor",800);
    	Corda corda1 = new Corda("Violi",700);
    	
    	//Output
    	
    	System.out.println(vent1);
    	System.out.println(percussio1);
    	System.out.println(corda1);
    	

	}

}
