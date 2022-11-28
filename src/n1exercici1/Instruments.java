package n1exercici1;

public abstract class Instruments {
	
	protected String nom;
	protected int preu;
	
	public Instruments (String nom, int preu) {
		this.nom=nom;
		this.preu=preu;
	}
	
	//instancia de la classe
	{
		nom="ni idea";
		preu=0;
		System.out.println("instancio que el nom i el preu de l'instrument és: " + nom + " i "+ preu);
	}
	
	
	//mètode tocar
	abstract void tocar();
	

	
	
	
	/*Tots els instruments tenen com a atributs el seu nom, i el seu preu. 
	 * A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument i,
	 *  per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, 
	 *  el mètode ha de mostrar per consola: "Està sonant un instrument de vent", 
	 *  si s’està tocant un instrument de corda: “Està sonant un instrument de corda”
	 *   i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.
	 */



}
