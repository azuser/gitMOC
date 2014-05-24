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
public class S_ARGSX_MOC {
LEX_MOC scanner;
  S_ARGSX_MOC() {
    }
  S_ARGSX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  boolean att_eval;
  String att_code;
  PARAMETRES att_hparams;
  PARAMETRES att_params;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  DTYPE att_tChar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle66() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_params_66();
if  (att_eval)      action_gen_66();
  }
  private void regle67() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_4 = new S_E_MOC(scanner,att_eval) ;
    S_ARGSX_MOC x_7 = new S_ARGSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_67(x_4, x_7);
    x_2.analyser(LEX_MOC.token_virg);
if  (att_eval)      action_lire_resultat_67(x_4, x_7);
    x_4.analyser() ;
if  (att_eval)      action_params1_67(x_4, x_7);
if  (att_eval)      action_testInit_67(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_params2_67(x_4, x_7);
if  (att_eval)      action_gen_67(x_4, x_7);
  }
private void action_params2_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// instructions
this.att_params=x_7.att_params;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params2","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_auto_inh_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// instructions
x_4.att_tInt=this.att_tInt;
x_7.att_tInt=this.att_tInt;
x_4.att_tChar=this.att_tChar;
x_7.att_tChar=this.att_tChar;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_7.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tVoid=this.att_tVoid;
x_7.att_tVoid=this.att_tVoid;
x_4.att_tString=this.att_tString;
x_7.att_tString=this.att_tString;
x_4.att_regLB=this.att_regLB;
x_7.att_regLB=this.att_regLB;
x_4.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
x_4.att_tds_fonction=this.att_tds_fonction;
x_7.att_tds_fonction=this.att_tds_fonction;
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_params1_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// locales
PARAMETRES loc_par;
// instructions
loc_par=this.att_hparams;
loc_par.inserer(x_4.att_type);
x_7.att_hparams=loc_par;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params1","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_lire_resultat_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// instructions
x_4.att_lire_resultat=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_gen_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code+this.att_machine.genComment("parametre de sous-programme")+x_4.att_code+this.att_machine.genComment("charger le parametre ?");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_gen_66() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ARGSX -> #params #gen ;"});
}
  }
private void action_testInit_67(S_E_MOC x_4, S_ARGSX_MOC x_7) throws Exception {
try {
// instructions
if (!(x_4.att_initialiser)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_50, MOCMessages.B_50,new Object[]{""+" parametre non initialise"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","ARGSX -> virg #lire_resultat E #params1 #testInit ARGSX1 #params2 #gen ;"});
}
  }
private void action_params_66() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","ARGSX -> #params #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 33
        regle66 () ;
      break ;
      case LEX_MOC.token_virg : // 36
        regle67 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
