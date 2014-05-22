package moc.gc;

import moc.compiler.MOCException;

/**
 * Cette interface décrit une machine cible. A compléter, selon votre modèle
 * 
 * @author marcel
 * 
 */
public interface IMachine {
	/**
	 * Suffixe du fichier cible (.tam par exemple)
	 * 
	 * @return
	 */
	String getSuffixe();

	/**
	 * Ecrit le code dans un fichier à partir du nom du fichier source et du
	 * suffixe
	 * 
	 * @param fileName
	 * @param code
	 * @throws MOCException
	 */
	void writeCode(String fileName, String code) throws MOCException;
	
	/**
	 * Generate the code to free a specific size of space into the the stack
	 * 
	 * @param size size of the space to free
	 * @throws MOCException
	 */
	public String genFree(int size);

	/**
	 * Generate a specified comment
	 * 
	 * @param c the comment
	 * @throws MOCException
	 */
	public String genComment(String c);
	
	/**
	 * Insert ASM code in line
	 * 
	 * @param c code to insert
	 * @throws MOCException
	 */
	public String genCodeInLine(String c);
	
	/**
	 * Generate a label
	 * @throws MOCException
	 */
	public String genLabel();
	
	/**
	 * Generate a "if then ..."
	 * 
	 * @param codeCondition
	 * @param codeThen
	 * @param codeElse vaut "" s'il n'y a pas de else
	 * @throws MOCException
	 */
	public String genIf(String codeCondition, String codeThen, String codeElse);
	
	/**
	 * Generate a variable declaration without initialization
	 * 
	 * @param ident identifier of the variable to declare
	 * @param taille size of the variable
	 * @param empl address allocated
	 * @throws MOCException
	 */
	public String genDeclaration(String ident, int taille, Emplacement empl);
	
	/**
	 * Generate a variable declaration with an initialization
	 * 
	 * @param ident identifier of the declared variable
	 * @param taille size of the variable
	 * @param initCode initialization code
	 * @throws MOCException
	 */
	public String genDefinition(String ident, int taille, String initCode);
	
	/**
	 * Generate a unary operation
	 * 
	 * @param codeOp code of the unary operator
	 * @param codeFacteur code generating the value of the facteur
	 * @throws MOCException
	 */
	public String genOpUnaire(String codeOp, String codeFacteur);
	
	/**
	 * Generate an integer unary operation : -
	 * @throws MOCException
	 */
	public String genINegation();
	
	/**
	 * Generate a boolean unary operation : not 
	 * @param codeFacteur code generating the value of the facteur
	 * @throws MOCException
	 */
	public String genBNegation();
	
	/**
	 * Generate a binary operation
	 * 
	 * @param codeOp code of the binary operator
	 * @param codegauche left parameter
	 * @param codedroite right parameter
	 * @throws MOCException
	 */
	public String genOpBinaire(String codegauche, String codeOp, String codedroite);
	
	/**
	 * Code of the integer binary operator : *
	 * @throws MOCException
	 */
	public String genIMultiplication();
	
	/**
	 * Code of the integer binary operator : /
	 * @throws MOCException
	 */
	public String genIDivision();
	
	/**
	 * Code of the integer binary operator : mod 
	 * @throws MOCException
	 */
	public String genIModulo();
	
	/**
	 * Code of the boolean binary operator to be apply to integer parameter (0: false, *:true) : et 
	 * @throws MOCException
	 */
	public String genIEt();
	
	/**
	 * Code of the integer binary operator : + 
	 * @throws MOCException
	 */
	public String genIPlus();
	
	/**
	 * Code of the integer binary operator : -
	 * @throws MOCException
	 */
	public String genIMoins();
	
	/**
	 * Code of the boolean binary operator to be apply to integer parameter (0: false, *:true) : ou 
	 * @throws MOCException
	 */
	public String genBOu();
	
	/**
	 * Code of the integer binary operator : <
	 * @throws MOCException
	 */
	public String genIInferieur();
	
	/**
	 * Code of the integer binary operator : >
	 * @throws MOCException
	 */
	public String genISuperieur();
	
	/**
	 * Code of the integer binary operator : <=
	 * @throws MOCException
	 */
	public String genIInfEgal();
	
	/**
	 * Code of the integer binary operator : >=
	 * @throws MOCException
	 */
	public String genISupEgal();
	
	/**
	 * Code of the integer binary operator : ==
	 * @throws MOCException
	 */
	public String genIEgal();
	
	/**
	 * Code of the integer binary operator : /=
	 * @throws MOCException
	 */
	public String genIDifferent();
	
	/**
	 * Generate an integer constant
	 * @param c 
	 * @throws MOCException
	 */
	public String genEntier(String c);
	
	/**
	 * Generate a character  
	 * @param c
	 * @throws MOCException
	 */
	public String genCaractere(String c);

	/**
	 * Generate a string  
	 * @param c
	 * @throws MOCException
	 */
	public String genString(String c);
	/**
	 * Generate the code for calling a fonction  
	 * @param etiquette label of the fonction
	 * @throws MOCException
	 */
	public String genCall(String etiquette);
	
	/**
	 * Generate the code for an affectation : =  
	 * @param codeAdresse address to modify
	 * @param codeValeur value
	 * @param taille size of the value
	 *  @throws MOCException
	 */
	public String genAffectation(String codeAdresse, String codeValeur, int taille);
	
	/**
	 * Generate the code for an affectation : =  
	 * @param empl address to modify
	 * @param codeValeur value
	 * @param taille size of the value
	 *  @throws MOCException
	 */
	public String genAffectation(String codeValeur, Emplacement empl, int taille);
	
	/**
	 * Associate the code of a function to a label  
	 * @param ident name of the function 
	 * @param code code of the body of the function
	 * @throws MOCException
	 */
	public String genFonction(String etiquette, String code);
	
	/**
	 * Code for the "return" instruction of a function  
	 * @param tailleparams 
	 * @param tailleretour
	 * @param codeVaeurs code of the value to return
	 * @throws MOCException
	 */
	public String genRetour(int tailleparams, int tailleretour, String codeValeur);
	
	/**
	 * Read the value of a variable  
	 * @param ident name of the variable 
	 * @param taille size of the variable
	 * @param adresse position of the variable in the memory
	 * @throws MOCException
	 */
	public String genLire(String ident, int taille, Emplacement adresse);
	
	/**
	 * Read the value of a variable  
	 * @param taille size of the variable
	 * @param adresse position of the variable in the memory
	 * @throws MOCException
	 */
	public String genReadMem(Emplacement adresse, int taille);
	
	/**
	 * Read a value of in the address pre-specified 
	 * @param taille size of the value to read
	 * @throws MOCException
	 */
	public String genReadIndirectMem(int taille);
	
	/**
	 * Write a value of in  a variable  
	 * @param ident name of the variable 
	 * @param taille size of the variable
	 * @param adresse position of the variable in the memory
	 * @throws MOCException
	 */
	public String genEcrire(String ident, int taille, Emplacement adresse);
	
	/**
	 * Write a value of in the address pre-specified 
	 * @param codeValeur value to write
	 * @param taille size of the value
	 * @throws MOCException
	 */
	public String genWriteIndirectMem(String codeValeur, int taille);
	/**
	 * Push the address  of a variable  
	 * @param adresse position of the variable in the memory
	 * @throws MOCException
	 */
	public String genPushAdresse(Emplacement adresse);
	
	/**
	 * Pop the address  
	 * @throws MOCException
	 */
	public String genPopAdresse();

}