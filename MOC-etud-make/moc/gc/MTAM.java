package moc.gc;


/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {

	@Override 
	public String getSuffixe() {
		return "tam";
	}
	
	@Override
	public String genFree(int size) {
		return "\tPOP(0) " + size + "\n";
	}
	
	@Override
	public String genComment(String c) {
		return "\t; " + c + "\n";
	}

	@Override
	public String genCodeInLine(String c) {
		return genComment("code in inline : start") + c + genComment("code in inline : end");
	}
	
	// counter to generate unique labels
	private static int cpt = -1;

	/** Generate a unique label
	 * 
	 * @return the label
	 */
	@Override
	public String genLabel() {
		cpt++;
		return "label" + cpt;
	}
	
	@Override
	public String genIf(String codeCondition, String codeThen, String codeElse) {
		String code;
		String labelEndIf = genLabel();
		// check the condition
		code = genComment("if") + codeCondition + "\tJUMPIF(0) ";
		/*if (codeElse == "") {
			code += labelEndIf + "\n"
					+ genComment("then") + codeThen + "\n";
		} else {*/
			String labelElse = genLabel();
			code += labelElse + "\n"
					+ genComment("then") +   codeThen + "\n" + "\tJUMP " + labelEndIf + "\n" 
					+ genComment("else") + labelElse+" :" + "\n" + codeElse + "\n";
		//}
		code += labelEndIf+" :" + "\n" + genComment("end if");
		return code;
	}

	@Override
	public String genDeclaration(String ident, int taille, Emplacement empl) {
		return genComment("declaration sans initialisation de "+ident+ " de taille "+taille+" en "+empl)
				+ "\tPUSH "+taille+"\n"; 
	}

	@Override
	public String genDefinition(String ident, int taille, String initCode) {
		return genComment("declaration avec initialisation de "+ident+ "de taille "+taille)
				+ initCode;
	}

	@Override
	public String genOpUnaire(String codeOp, String codeFacteur) {
		return codeFacteur + 
				codeOp;
	}

	@Override
	public String genINegation() {
		return "\tSUBR INeg\n";
	}

	@Override
	public String genBNegation() {
		return genComment("; negation sur des entiers : 0 : false; *:true => comparer a 0")+
				"LOADL 0\n"
				+ "\tSUBR IEq";
		}
	
	@Override
	public String genEntier(String c) {
		return "\tLOADL "+c+genComment("entier");
	}

	@Override
	public String genCaractere(String c) {
		return "\tLOADL "+c+genComment("caractere");
	}

	@Override
	public String genCall(String etiquette) {
		return genComment("Appel de " + etiquette) + "\tCALL(SB) _" + etiquette + "\n";
	}

	@Override
        public String genCallMethod(String fct, Emplacement e, int depl){
		String temp ="";
		/* La recuperation du LOADA */
		temp = genEntier("0");
		temp = temp + genOpBinaire(genPushAdresse(e), genIPlus(), genEntier(""+depl)); 
		//temp = temp + genReadIndirect();
		return genComment("Appel de methode "+fct) 
			+ temp
			+ "\nCALLI";
	}

	//Obsolete
	@Override
	public String genAffectation(String codeAdresse, String codeValeur, int taille) {
		return codeAdresse + genComment("affectation :=")+codeValeur+"\tSTOREI("+taille+")" ;
	}
	
	@Override
	public String genAffectation(String codeValeur, Emplacement empl, int taille) {
		return codeValeur + "\tSTORE("+taille+") "+empl.getDep()+"["+empl.getReg().getName()+"]\n";
	}

	@Override
	public String genFonction(String etiquette, String code) {
		return "_" + etiquette + ":\n" 
				+ code + "\n";
	}

	@Override
	public String genRetour(int tailleparams, int tailleretour,
			String codeValeur) {
		return genComment("retour")
				+ codeValeur + 
				"\tRETURN (" + tailleretour + ") "+ tailleparams + "\n"
				+ genComment("fin retour");
	}

	@Override
	public String genString(String c) {
		return "\tLOADL "+c+genComment("chaine de caractere");
	}

	@Override
	public String genOpBinaire(String codegauche, String codeOp,
			String codedroite) {
		return genComment("operation binaire ") + codegauche + codedroite + "\tSUBR "+codeOp+"\n";
	}

	@Override
	public String genIPlus() {
		return "IAdd";
	}
	
	@Override
	public String genIMoins() {
		return "ISub";
	}
	
	@Override
	public String genBOu() {
		return "IAdd";
	}

	@Override
	public String genIMultiplication() {
		return "IMul";
	}
	
	@Override
	public String genIDivision() {
		return "IDiv";
	}

	@Override
	public String genIModulo() {
		return "IMod";
	}

	@Override
	public String genIEt() {
		return "IMul";
	}

	@Override
	public String genIInferieur() {
		return "ILss";
	}

	@Override
	public String genISuperieur() {
		return "IGtr";
	}
	@Override
	public String genIInfEgal() {
		return "ILeq";
	}
	@Override
	public String genISupEgal() {
		return "IGeq";
	}
	
	@Override
	public String genIEgal() {
		return "IEq";
	}
	
	@Override
	public String genIDifferent() {
		return "INEq";
	}
	
	//Obsolete
	@Override
	public String genLire(String ident, int taille, Emplacement adresse) {
		return genComment("acces a " + ident) + "\tLOAD ("+taille+") "+adresse.getDep()+"["+adresse.getReg().getName()+"]\n";
	}
	
	@Override
	public String genReadMem(Emplacement adresse, int taille) {
		return "\tLOAD ("+taille+") "+adresse.getDep()+"["+adresse.getReg().getName()+"]\n";
	}
	
	@Override
	public String genWriteIndirectMem(String codeValeur, int taille) {
		return genComment("valeur affectee") + codeValeur
				+genComment("affectation")+"\tSTOREI ("+taille+")\n";
	}

	@Override
	public String genReadIndirectMem(int taille) {
		return genComment("lecture indirecte")+
				"\tLOADI ("+taille+")\n";
	}

	// Obsolete
	@Override
	public String genEcrire(String ident, int taille, Emplacement adresse) {
		throw new RuntimeException("Undefined Method");
	}

	@Override
	public String genPushAdresse(Emplacement adresse) {
		return genComment("lecture du contenu de l'adresse de "+adresse)
				+"\tLOADA "+adresse.getDep()+"["+adresse.getReg().getName()+"]\n";
	}

	@Override
	public String genPopAdresse() {
		return genComment("adresse en sommet de pile inutile : depiler!") +
				genFree(1);
	}

	@Override
	public String genAdrField(int dep) {
                return "\t;Calcul deplacement struct " + dep + "\n" + "\tLOADL " + dep
                                + "\n\tSUBR Iadd\n";
        }

}
