package monstres;

import partie.De;

public class MonstreEtCompagnie {
	private De de = new De();
	

	public Monstre getMonstre() {
		if (de.lance(2)==1) {
			return new MonstreFacile();
		}
		return new MonstreDifficile();
	}
}
