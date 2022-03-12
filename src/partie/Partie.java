package partie;

import hero.Bouclier;
import hero.Hero;

public class Partie {

	protected Hero heroActuel;
	protected Bouclier bouclierActuel;
	private Combat combatActuel;

	public Partie() {
		super();
		this.heroActuel = new Hero();
		this.bouclierActuel = new Bouclier();
		System.out.println("Nouveau Comba");
		this.combatActuel = new Combat(this.heroActuel, this.bouclierActuel);

	}

	public void joue() {
		this.combatActuel.verifieTourFini();
		if (this.combatActuel.estFini()) {
			System.out.println("Nouveau Combat");
			combatActuel = new Combat(this.heroActuel, this.bouclierActuel);
		}
	}

	public boolean estFini() {
		return this.heroActuel.estMort();
	}

	public int monstresFacileTues() {
		return this.heroActuel.getMonstreFacilTues();
	}

	public int monstresDifficilesTues() {
		return this.heroActuel.getMonstreDifficileTues();
	}

	public int points() {
		this.heroActuel.setPoints(monstresFacileTues(), monstresDifficilesTues());
		return this.heroActuel.getPoints();
	}
}
