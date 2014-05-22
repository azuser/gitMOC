package moc.egg;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_AFFX_MOC {
LEX_MOC scanner;
  S_AFFX_MOC() {
    }
  S_AFFX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_gauche;
  Register att_regLB;
  boolean att_vide;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_type;
  DTYPE att_tInt;
  boolean att_hest_adresse;
  DTYPE att_tString;
  boolean att_estAffectation;
  DTYPE att_tVoid;
  Emplacement att_hadresse;
  DTYPE att_tChar;
  DTYPE att_htype;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  DTYPE glob_28_t;
  private void regle29() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_getType_29();
if  (att_eval)      action_estVide_29();
if  (att_eval)      action_gen_29();
  }
  private void regle28() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_A_MOC x_3 = new S_A_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_3);
    x_2.analyser(LEX_MOC.token_affect);
    x_3.analyser() ;
if  (att_eval)      action_getType_28(x_3);
if  (att_eval)      action_estVide_28(x_3);
if  (att_eval)      action_gen_28(x_3);
if  (att_eval)      action_testInit_28(x_3);
  }
private void action_getType_29() throws Exception {
try {
// instructions
this.att_type=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","AFFX -> #getType #estVide #gen ;"});
}
  }
private void action_auto_inh_28(S_A_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","AFFX -> affect A #getType #estVide #gen #testInit ;"});
}
  }
private void action_estVide_28(S_A_MOC x_3) throws Exception {
try {
// instructions
this.att_vide=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estVide","AFFX -> affect A #getType #estVide #gen #testInit ;"});
}
  }
private void action_getType_28(S_A_MOC x_3) throws Exception {
try {
// instructions
glob_28_t=x_3.att_type;
this.att_type=glob_28_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","AFFX -> affect A #getType #estVide #gen #testInit ;"});
}
  }
private void action_estVide_29() throws Exception {
try {
// instructions
this.att_vide=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estVide","AFFX -> #getType #estVide #gen ;"});
}
  }
private void action_testInit_28(S_A_MOC x_3) throws Exception {
try {
// instructions
if (!(x_3.att_initialiser)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_55, MOCMessages.B_55,new Object[]{""+" cote droit non initialise"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","AFFX -> affect A #getType #estVide #gen #testInit ;"});
}
  }
private void action_gen_28(S_A_MOC x_3) throws Exception {
try {
// locales
String loc_leCode;
String loc_adr_gauche;
Emplacement loc_empl_gauche;
Emplacement loc_empl_droit;
String loc_code_valeur_gauche;
String loc_codedroit;
// instructions
loc_leCode=this.att_machine.genComment("adresse d'affectation inexistante 4");
loc_codedroit=this.att_machine.genComment("adresse terme droit d'affectation inexistante 3");
this.att_estAffectation=true;
loc_empl_droit=x_3.att_adresse;
if (loc_empl_droit!=null){
loc_codedroit=x_3.att_code+this.att_machine.genReadMem(loc_empl_droit, glob_28_t.getTaille());
}
else {
if (x_3.att_est_adresse){
loc_codedroit=x_3.att_code+this.att_machine.genReadIndirectMem(glob_28_t.getTaille());
}
else {
loc_codedroit=x_3.att_code;
}
}
loc_code_valeur_gauche=this.att_machine.genComment("code de la nouvelle de la variable affectee");
loc_empl_gauche=this.att_hadresse;
if (loc_empl_gauche!=null){
loc_code_valeur_gauche=loc_code_valeur_gauche+this.att_machine.genReadMem(loc_empl_gauche, this.att_htype.getTaille());
loc_leCode=this.att_code_gauche+this.att_machine.genAffectation(loc_codedroit, this.att_hadresse, glob_28_t.getTaille());
}
else {
if (this.att_hest_adresse){
loc_code_valeur_gauche=loc_code_valeur_gauche+this.att_code_gauche+this.att_machine.genReadIndirectMem(this.att_htype.getTaille());
loc_leCode=this.att_code_gauche+this.att_machine.genWriteIndirectMem(loc_codedroit, glob_28_t.getTaille());
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Interne_adresse, MOCMessages.Interne_adresse,new Object[]{""+"adresse d'affectation inexistante 1"});

}
}
this.att_code=loc_leCode+loc_code_valeur_gauche;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","AFFX -> affect A #getType #estVide #gen #testInit ;"});
}
  }
private void action_gen_29() throws Exception {
try {
// locales
String loc_leCode;
Emplacement loc_empl_gauche;
String loc_code_valeur_gauche;
// instructions
this.att_estAffectation=false;
loc_leCode=this.att_machine.genComment("pas d'affectation : code de l'expression");
loc_empl_gauche=this.att_hadresse;
if (loc_empl_gauche!=null){
loc_leCode=loc_leCode+this.att_code_gauche+this.att_machine.genReadMem(loc_empl_gauche, this.att_htype.getTaille());
}
else {
if (this.att_hest_adresse){
loc_leCode=loc_leCode+this.att_code_gauche+this.att_machine.genReadIndirectMem(this.att_htype.getTaille());
}
else {
loc_leCode=loc_leCode+this.att_code_gauche;
}
}
this.att_code=loc_leCode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","AFFX -> #getType #estVide #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_affect : // 38
        regle28 () ;
      break ;
      case LEX_MOC.token_pv : // 37
        regle29 () ;
      break ;
      case LEX_MOC.token_virg : // 36
        regle29 () ;
      break ;
      case LEX_MOC.token_parf : // 33
        regle29 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
