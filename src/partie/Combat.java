package partie;

import hero.Bouclier;
import hero.Hero;
import monstres.Monstre;
import monstres.MonstreDifficile;
import monstres.MonstreEtCompagnie;
import monstres.MonstreFacile;

public class Combat {

	
	private Tour tourActuel;
	private Hero heroActuel;
	private Bouclier bouclierActuel;
	private Monstre monstreActuel;

	public Combat(Hero hero, Bouclier bouclier) {
		MonstreEtCompagnie monstreEtCompagnie = new MonstreEtCompagnie();
		this.monstreActuel = monstreEtCompagnie.getMonstre();
		if (this.monstreActuel instanceof MonstreFacile) {
			System.out.println("Nouveau Monstre Facile");
		}
		else {
			System.out.println("Nouveau Monstre Difficile");
		}
		heroActuel=hero;
		bouclierActuel=bouclier;
		System.out.println("Nouveau tour");
		tourActuel= new Tour(heroActuel,bouclierActuel,monstreActuel);

	}


	public void verifieTourFini() {
		System.out.println("Tour finis "+tourActuel.estFini());
		System.out.println("Point de vie "+heroActuel.getPointDeVie());
		if(tourActuel.estFini()) {
			if ((monstreActuel instanceof MonstreFacile) && (!heroActuel.estMort())) {
				heroActuel.setMonstreFacilTues(heroActuel.getMonstreFacilTues() + 1);
			} else if ((monstreActuel instanceof MonstreDifficile) && (!heroActuel.estMort())) {
				heroActuel.setMonstreDifficileTues(heroActuel.getMonstreDifficileTues() + 1);
			}
			System.out.println("Nouveau tour");
			tourActuel = new Tour(heroActuel,bouclierActuel,monstreActuel);
		}
	}

	public boolean estFini() {
		return heroActuel.estMort() || monstreActuel.estMort();
	}
}
