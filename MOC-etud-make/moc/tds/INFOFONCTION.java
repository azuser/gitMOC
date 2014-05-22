package moc.tds;

import moc.type.*;
/**
 * Cette classe dÃ©crit une variable locale : adresse et type
 * 
 * @author Solene, Zohour, Leger
 * 
 */
public class INFOFONCTION implements INFO {
	/**
	 * Le type de la variable
	 */
	protected DTYPE retour;
	protected PARAMETRES parametres;

	public DTYPE getRetour() {
		return retour;
	}
	
	public PARAMETRES getParametres (){
		return parametres;
	}
	
	/**
	 * Une variable a un type et un emplacement pour sa valeur
	 * @param t
	 * @param e
	 */
	public INFOFONCTION(DTYPE r) {
		retour = r;
		parametres = new PARAMETRES();
	}

	public INFOFONCTION(DTYPE r, PARAMETRES params){
		retour = r;
		parametres = params;
	}
	
	public void addParametre (DTYPE p){
		parametres.inserer(p);
	}
	
	public boolean goodParametre (DTYPE d, int dep){
		if (parametres.get(dep).equals(d)){
			return true; 
		}
		else {
			return false;	
		}
	}
	@Override
	public String toString() {
		return "INFOFONCTION [retour=" + retour.getNom() + ", parametre =" + parametres.toString() + "]";
	}

}
