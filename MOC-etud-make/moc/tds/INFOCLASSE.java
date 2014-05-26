package moc.tds;

import java.util.ArrayList;

import moc.gc.Emplacement;
import moc.type.DTYPE;

public class INFOCLASSE implements INFO {
	
	protected DTYPE type;
	protected TDS methodes; // Hashmap<String, INFOMETHODE>
	protected Emplacement tv;
	
	public INFOCLASSE(DTYPE type) {
		this.type = type;
		this.methodes = new TDS();
	}
	
	public INFOCLASSE(DTYPE type, Emplacement tv) {
		this.type = type;
		this.methodes = new TDS();
		this.tv = tv;
	}
	
	public INFOCLASSE(DTYPE type, INFOCLASSE parent) {
		this.type = type;
		this.methodes = new TDS(parent.getMethodes());
	}
	
	public INFOCLASSE(DTYPE type, INFOCLASSE parent, Emplacement tv) {
		this.type = type;
		this.methodes = new TDS(parent.getMethodes());
		this.tv = tv;
	}
	
	public INFOCLASSE(DTYPE type, TDS parent) {
		this.type = type;
		this.methodes = new TDS(parent);
	}
	
	public INFOCLASSE(DTYPE type, TDS parent, Emplacement tv) {
		this.type = type;
		this.methodes = new TDS(parent);
		this.tv = tv;
	}
	
	public INFOCLASSE(TDS methodes, DTYPE type) {
		this.type = type;
		this.methodes = new TDS(methodes);
	}
	
	public INFOCLASSE(TDS methodes, DTYPE type, Emplacement tv) {
		this.type = type;
		this.methodes = new TDS(methodes);
		this.tv = tv;
	}
	
	public DTYPE getType() {
		return type;
	}

	public void setType(DTYPE type) {
		this.type = type;
	}

	public TDS getMethodes() {
		return methodes;
	}

	public void setMethodes(TDS methodes) {
		this.methodes = methodes;
	}

	public Emplacement getTv() {
		return tv;
	}

	public void setTv(Emplacement tv) {
		this.tv = tv;
	}
	
	public TDS listeMethodes() {
		ArrayList<TDS> ascendants = new ArrayList<TDS>();
		TDS liste = new TDS();
		TDS temp = new TDS();
		temp = this.methodes;
		while (temp != null) {
			ascendants.add(temp);
			temp = temp.getParente();
		}
		for(int i = ascendants.size() - 1; i >= 0; i--) {
			liste.putAll(ascendants.get(i));
		}
		return liste;
	}
	
	public void inserer(String nom, INFOMETHODE methode) {
		TDS liste = this.listeMethodes();
		int nombre = liste.size();
		INFOMETHODE method = (INFOMETHODE) liste.chercherLocalement(nom);
		INFOMETHODE method_aux = methode;
		if (method == null) {
			method_aux.setNumero(nombre + 1);
		} else {
			method_aux.setNumero(method.getNumero());
		}
		this.methodes.put(nom, method_aux);
	}
}
