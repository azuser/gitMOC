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
public class S_E_MOC {
LEX_MOC scanner;
  S_E_MOC() {
    }
  S_E_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_est_adresse;
  boolean att_affectable;
  Emplacement att_adresse;
  Register att_regLB;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_type;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  boolean att_initialiser;
  DTYPE att_tChar;
  TDS att_tds;
  boolean att_lire_resultat;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  DTYPE glob_27_typeE;
  private void regle27() throws Exception {

    //declaration
    S_A_MOC x_2 = new S_A_MOC(scanner,att_eval) ;
    S_AFFX_MOC x_5 = new S_AFFX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_27(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_getType_27(x_2, x_5);
if  (att_eval)      action_code_gauche_27(x_2, x_5);
    x_5.analyser() ;
if  (att_eval)      action_verifCompatible_27(x_2, x_5);
if  (att_eval)      action_estAffectable_27(x_2, x_5);
if  (att_eval)      action_gen_27(x_2, x_5);
if  (att_eval)      action_testInit_27(x_2, x_5);
  }
private void action_getType_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
glob_27_typeE=x_2.att_type;
this.att_type=glob_27_typeE;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_auto_inh_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_5.att_lire_resultat=this.att_lire_resultat;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_2.att_tds_fonction=this.att_tds_fonction;
x_5.att_tds_fonction=this.att_tds_fonction;
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_estAffectable_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_testInit_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
if (x_5.att_vide){
this.att_initialiser=x_2.att_initialiser;
}
else {
if (x_2.att_var!=null){
x_2.att_var.setInitialiser();
this.att_initialiser=true;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_100, MOCMessages.B_100,new Object[]{""+" erreur affectation **"});

this.att_initialiser=false;
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_code_gauche_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hest_adresse=x_2.att_est_adresse;
x_5.att_hadresse=x_2.att_adresse;
x_5.att_code_gauche=x_2.att_code;
x_5.att_htype=glob_27_typeE;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#code_gauche","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_gen_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// instructions
if (x_5.att_estAffectation){
if (!(x_2.att_affectable)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_NonAffectable, MOCMessages.NonAffectable,new Object[]{""+"Le cote gauche n est pas affectable"});

}

}

this.att_code=x_5.att_code;
this.att_est_adresse=x_2.att_est_adresse;
this.att_adresse=x_2.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
private void action_verifCompatible_27(S_A_MOC x_2, S_AFFX_MOC x_5) throws Exception {
try {
// locales
boolean loc_compValue;
// instructions
if (!(x_5.att_vide)){
loc_compValue=x_2.att_type.compareTo(x_5.att_type);
if (!(loc_compValue)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_6, MOCMessages.B_6,new Object[]{""+"affectation : type non compatible"});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifCompatible","E -> A #getType #code_gauche AFFX #verifCompatible #estAffectable #gen #testInit ;"});
}
  }
  public void analyser () throws Exception {
    regle27 () ;
  }
  }
