package monstres;

import partie.De;

public interface Monstre {
	
	public De de = new De();
	public boolean estMort();
	public void setEstMort();
}
