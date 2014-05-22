package moc.egg;
import java.util.Arrays;
import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.messages.NLS;
import mg.egg.eggc.runtime.libjava.lex.LEXICAL4;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
public class LEX_MOC extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_comm = 1 ;
 public static final int token_plus = 2 ;
 public static final int token_asm = 3 ;
 public static final int token_mod = 4 ;
 public static final int token_pv = 5 ;
 public static final int token_neg = 6 ;
 public static final int token_null = 7 ;
 public static final int token_void = 8 ;
 public static final int token_aco = 9 ;
 public static final int token_entier = 10 ;
 public static final int token_sup = 11 ;
 public static final int token_chaine = 12 ;
 public static final int token_si = 13 ;
 public static final int token_paro = 14 ;
 public static final int token_acf = 15 ;
 public static final int token_moins = 16 ;
 public static final int token_parf = 17 ;
 public static final int token_ident = 18 ;
 public static final int token_sinon = 19 ;
 public static final int token_ou = 20 ;
 public static final int token_supeg = 21 ;
 public static final int token_infeg = 22 ;
 public static final int token_retour = 23 ;
 public static final int token_caractere = 24 ;
 public static final int token_int = 25 ;
 public static final int token_mult = 26 ;
 public static final int token_char = 27 ;
 public static final int token_separateur = 28 ;
 public static final int token_affect = 29 ;
 public static final int token_et = 30 ;
 public static final int token_nil = 31 ;
 public static final int token_inf = 32 ;
 public static final int token_non = 33 ;
 public static final int token_div = 34 ;
 public static final int token_eg = 35 ;
 public static final int token_virg = 36 ;
  static final int token_autre = 37 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,    {"comm"} ,
{"plus"},
{"asm"},
{"mod"},
{"pv"},
{"neg"},
{"null"},
{"void"},
{"aco"},
    {"entier"} ,
{"sup"},
    {"chaine"} ,
{"si"},
{"paro"},
{"acf"},
{"moins"},
{"parf"},
    {"ident"} ,
{"sinon"},
{"ou"},
{"supeg"},
{"infeg"},
{"retour"},
    {"caractere"} ,
{"int"},
{"mult"},
{"char"},
    {"separateur"} ,
{"affect"},
{"et"},
{"nil"},
{"inf"},
{"non"},
{"div"},
{"eg"},
{"virg"},
  } ;
  private int [] separateurs = { 
token_comm
, token_separateur
    } ;
  public int[] getSeparateurs(){
    return separateurs;
    }
  private int [] comments = { 
    } ;
  public int[] getComments(){
    return comments;
    }
  private int le_comment = -1;
  public int getComment(){
    return le_comment;
    }
  public LEX_MOC(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr, lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_MOC();
  }
  public void setSource ( LEXICAL4 scanner) throws EGGException{
    scanner.analyseur.toContext(scanner.contexte);
    analyseur.fromContext(scanner.contexte);
  }
  public void setReader ( LEXICAL4 scanner) {
    scanner.analyseur.setReader(scanner.contexte.source);
  }
  public void accepter_sucre ( int t ) throws EGGException {
    if ( fenetre[0].code == t ) {
      dernier_accepte = fenetre[0].ligne ;
      recovery = false;
      decaler () ;
    }else {
      _interrompre(IProblem.Syntax,getBeginLine(), IMOCMessages.id_MOC_expected_token, MOCMessages.MOC_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IMOCMessages.id_MOC_expected_token, MOCMessages.MOC_expected_eof, new Object[]{fenetre[0].getNom()});
      }
     else {
      dernier_accepte = fenetre[0].ligne ;
      }
    }
  public int ligneDepart () {
    return getBeginLine() + getEndLine() ;
    }
  public void _interrompre (int cat,  int line, int id,  String c , Object [] m )  {
      //recovery = true;
      recovery = false;
      contexte.errors++;
        problemReporter.handle(cat, id,line  , NLS.bind(c,m), getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Error,m);
    }
    public void _signaler ( int cat, int line, int id, String c , Object [] m )  {
        problemReporter.handle(cat , id, line  , NLS.bind(c,m),getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Warning,m);
    }
  }
