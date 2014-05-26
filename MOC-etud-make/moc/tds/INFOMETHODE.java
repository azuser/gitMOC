package moc.tds;

import moc.type.DTYPE;

public class INFOMETHODE extends INFOFONCTION {

	protected boolean classmethod; // true si de classe, false si d'instance
	protected Integer numero;
	protected String etiquette;
	
	public INFOMETHODE(DTYPE r, boolean classmethod, Integer numero) {
		super(r);
		this.classmethod = classmethod;
		this.numero = numero;
	}
	
	public INFOMETHODE(DTYPE r, boolean classmethod, Integer numero, String etiquette) {
		super(r);
		this.classmethod = classmethod;
		this.numero = numero;
		this.etiquette = etiquette;
	}

	public INFOMETHODE(DTYPE r, PARAMETRES params, boolean classmethod, Integer numero) {
		super(r, params);
		this.classmethod = classmethod;
		this.numero = numero;
	}
	
	public INFOMETHODE(DTYPE r, PARAMETRES params, boolean classmethod, Integer numero, String etiquette) {
		super(r, params);
		this.classmethod = classmethod;
		this.numero = numero;
		this.etiquette = etiquette;
	}

	public boolean isClassmethod() {
		return classmethod;
	}

	public void setClassmethod(boolean classmethod) {
		this.classmethod = classmethod;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

}
