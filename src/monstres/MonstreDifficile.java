package monstres;

import partie.De;

public class MonstreDifficile implements Monstre {

	private boolean mort = false;
	public De de = new De();

	public boolean estMort() {
		return mort;
	}

	public void setEstMort() {
		this.mort = true;

	}
}
