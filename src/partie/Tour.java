package partie;

import hero.Bouclier;
import hero.Hero;
import monstres.Monstre;

public class Tour {

	private Hero heroActuel;
	private Bouclier bouclierActuel;
	private Monstre monstreActuel;

	public Tour(Hero hero, Bouclier bouclier, Monstre monstre) {
		super();
		this.heroActuel = hero;
		this.bouclierActuel = bouclier;
		this.monstreActuel = monstre;
	}

	public boolean estFini() {
		if (heroActuel.de.lance(6) >= monstreActuel.de.lance(6)) {
			monstreActuel.setEstMort();
			System.out.println("Monstre mort");
			return true;
		} else if ((monstreActuel.de.lance(6) > heroActuel.de.lance(6)) && (bouclierActuel.de.lance(6) > 2)) {
			heroActuel.setPointDeVie(heroActuel.getPointDeVie() - 10);
			System.out.println("-10 hp");
			return true;
		}else if ((monstreActuel.de.lance(6) > heroActuel.de.lance(6)) && (bouclierActuel.de.lance(6) <= 2)) {
			bouclierActuel.setCoupBloque(bouclierActuel.getCoupBloque()+1);
			System.out.println("Coup bloqué");
		}
		return false;
	}

}
