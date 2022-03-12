package heroVsMonstre;

import partie.Partie;

public class Main {

	public static void main(String[] args) {
		System.out.println("Nouvelle Partie");
		Partie partie = new Partie();
		while (!partie.estFini()) {
		//for(int i=0; i<10; i++) {
			partie.joue();
		}
		System.out.println("Bravo !!! Vous avez tué "+partie.monstresFacileTues()+" monstres facile et "+partie.monstresDifficilesTues()+". Vous avez "+partie.points()+" points.");

	}

}
