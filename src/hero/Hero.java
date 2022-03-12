package hero;

import partie.De;

public class Hero {
	private int pointDeVie = 150;
	private int monstreFacilTues = 0;
	private int monstreDifficileTues = 0;
	private int points = 0;
	public De de = new De();

	public boolean estMort() {
		return pointDeVie==0;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getMonstreFacilTues() {
		return monstreFacilTues;
	}

	public void setMonstreFacilTues(int monstreFacilTues) {
		this.monstreFacilTues = monstreFacilTues;
	}

	public int getMonstreDifficileTues() {
		return monstreDifficileTues;
	}

	public void setMonstreDifficileTues(int monstreDifficileTues) {
		this.monstreDifficileTues = monstreDifficileTues;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int monstresFaciles, int monstresDifficiles) {
		this.points = monstresFaciles + (2*monstresDifficiles) ;
	}
	
}
