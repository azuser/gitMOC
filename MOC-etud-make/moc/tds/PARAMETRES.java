package moc.tds;

import moc.type.*;

import java.util.ArrayList;

public class PARAMETRES extends ArrayList<DTYPE> {
	
	private static final long serialVersionUID = 1L;

	public int getTaille() {
		int t = 0;
		for (DTYPE p : this) {
			t += p.getTaille();
		}
		return t;
	}

	public void inserer(DTYPE c) {
		add(c);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (DTYPE p : this) {
			sb.append(p + ", ");
		}
		return sb.toString();
	}

	public boolean compareTo(PARAMETRES autre) {
		int lc = size();
		int lca = autre.size();
		if (lc != lca)
			return false;
		for (int i = 0; i < lc; i++) {
			DTYPE p = get(i);
			DTYPE pa = autre.get(i);
			if (!p.getNom().equals(pa.getNom())
					|| !(p.getTaille() == pa.getTaille()))
				return false;
		}
		return true;
	}
}
