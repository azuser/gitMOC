package moc.tds;

import moc.gc.Emplacement;
import moc.type.DTYPE;

/**
* Cette classe décrit une variable locale : adresse et type
*
* @author marcel
*
*/
public class INFOVAR implements INFO {
/**
* Le type de la variable
*/
	protected DTYPE type;

	public DTYPE getType() {
		return type;
	}

/**
* Represente un emplacement memoire : depend de la machine
*
*/
	protected Emplacement empl;

	public Emplacement getEmpl() {
		return empl;
	}	

	public int getTaille() {
		return this.getType().getTaille();
	}

/**
* Une variable a un type et un emplacement pour sa valeur
* @param t
* @param e
*/
	public INFOVAR(DTYPE t, Emplacement e) {
		type = t;
		empl = e;
	}

	@Override
	public String toString() {
		return "INFOVAR [type=" + type + ", empl=" + empl + "]";
	}

}

