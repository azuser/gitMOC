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
public class S_PARFS_MOC {
LEX_MOC scanner;
  S_PARFS_MOC() {
    }
  S_PARFS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  boolean att_eval;
  PARAMETRES att_hparams;
  PARAMETRES att_params;
  IMachine att_machine;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  int att_last_adr;
  TDS att_htdspar;
  DTYPE att_tChar;
  TDS att_tdspar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle6() throws Exception {

    //declaration
    S_PARF_MOC x_2 = new S_PARF_MOC(scanner,att_eval) ;
    S_PARFSX_MOC x_5 = new S_PARFSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_6(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_params1_6(x_2, x_5);
if  (att_eval)      action_adresse_6(x_2, x_5);
    x_5.analyser() ;
if  (att_eval)      action_params2_6(x_2, x_5);
if  (att_eval)      action_last_adr_6(x_2, x_5);
  }
  private void regle5() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_params_5();
if  (att_eval)      action_last_adr_5();
  }
private void action_last_adr_6(S_PARF_MOC x_2, S_PARFSX_MOC x_5) throws Exception {
try {
// instructions
this.att_last_adr=x_5.att_last_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","PARFS -> PARF #params1 #adresse PARFSX #params2 #last_adr ;"});
}
  }
private void action_auto_inh_6(S_PARF_MOC x_2, S_PARFSX_MOC x_5) throws Exception {
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
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_2.att_hparams=this.att_hparams;
x_2.att_htdspar=this.att_htdspar;
x_2.att_hadr=this.att_hadr;
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","PARFS -> PARF #params1 #adresse PARFSX #params2 #last_adr ;"});
}
  }
private void action_last_adr_5() throws Exception {
try {
// instructions
this.att_last_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","PARFS -> #params #last_adr ;"});
}
  }
private void action_params_5() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_tdspar=this.att_htdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","PARFS -> #params #last_adr ;"});
}
  }
private void action_params2_6(S_PARF_MOC x_2, S_PARFSX_MOC x_5) throws Exception {
try {
// instructions
this.att_params=x_5.att_params;
this.att_tdspar=x_5.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params2","PARFS -> PARF #params1 #adresse PARFSX #params2 #last_adr ;"});
}
  }
private void action_adresse_6(S_PARF_MOC x_2, S_PARFSX_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hadr=x_2.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","PARFS -> PARF #params1 #adresse PARFSX #params2 #last_adr ;"});
}
  }
private void action_params1_6(S_PARF_MOC x_2, S_PARFSX_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hparams=x_2.att_params;
x_5.att_htdspar=x_2.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params1","PARFS -> PARF #params1 #adresse PARFSX #params2 #last_adr ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 33
        regle5 () ;
      break ;
      case LEX_MOC.token_void : // 41
        regle6 () ;
      break ;
      case LEX_MOC.token_int : // 43
        regle6 () ;
      break ;
      case LEX_MOC.token_char : // 44
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
