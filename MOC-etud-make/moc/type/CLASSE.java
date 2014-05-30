package moc.type;

import java.util.ArrayList;
import java.util.List;

public class CLASSE extends DTYPE {

	private String nomClasse;
	// private POINTEUR tv; obligatoirement present dans les champs : POINTEUR sur DTYPE
	private LCHAMPS attributs;
	private CLASSE classeMere;
	
	public CLASSE(String nom, LCHAMPS champs, CLASSE mere) {
		super("classe", champs.getTaille());
		nomClasse = nom;
		attributs = champs;
		classeMere = mere;
		// verifier la presence du pointeur tv
		if (attributs != null) // ligne a enlever apres 1er test
		{
			CHAMP tv = attributs.chercher("tv");
			if ( (tv == null) || ! (tv.getType() instanceof POINTEUR) )
				throw new RuntimeException("Mauvaise declaration de classe : le pointeur tv est absent des champs");
		}
	}
	
	public String toString(){
		return super.toString() + " "+nomClasse+" herite de "+classeMere+" "+attributs.toString();
	}
	
	/** Obtenir la liste des classes parentes. */
	public List<CLASSE> getAncetres() {
		List<CLASSE> l;
		if (nomClasse.equals("NSObject")) {
			l = null;
		} else {
			l = classeMere.getAncetres();
			if (l == null) {
				// classeMere = NSObject
				l = new ArrayList<CLASSE>();
			}
			l.add(classeMere);
		}
		return l;
	}
	
	public String getNomClasse() {
		return nomClasse;
	}
	
	public CLASSE getClasseMere() {
		return classeMere;
	}
	
	public static boolean estObjet(DTYPE a) {
		return (a instanceof POINTEUR) && ( ((POINTEUR)a).getType() instanceof CLASSE ) ;
	}

	@Override
	// A.conformsTo(B) <=> A = B est ok ie A==B ou A ancetre de B ou B=nil
	public boolean compareTo(DTYPE autre) {
		if (autre instanceof CLASSE) {
			if (((CLASSE) autre).getNomClasse().equals(getNomClasse()))
				return true;
			else {
				List<CLASSE> l = ((CLASSE) autre).getAncetres();
				return l.contains(this);
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean castableTo(DTYPE autre) {
		return compareTo(autre);
	}

}