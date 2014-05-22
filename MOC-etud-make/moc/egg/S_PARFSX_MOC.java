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
public class S_PARFSX_MOC {
LEX_MOC scanner;
  S_PARFSX_MOC() {
    }
  S_PARFSX_MOC(LEX_MOC scanner, boolean eval) {
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
  private void regle8() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_PARF_MOC x_3 = new S_PARF_MOC(scanner,att_eval) ;
    S_PARFSX_MOC x_6 = new S_PARFSX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_8(x_3, x_6);
    x_2.analyser(LEX_MOC.token_virg);
    x_3.analyser() ;
if  (att_eval)      action_params1_8(x_3, x_6);
if  (att_eval)      action_adresse_8(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_params2_8(x_3, x_6);
if  (att_eval)      action_last_adr_8(x_3, x_6);
  }
  private void regle7() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_params_7();
if  (att_eval)      action_last_adr_7();
  }
private void action_params2_8(S_PARF_MOC x_3, S_PARFSX_MOC x_6) throws Exception {
try {
// instructions
this.att_params=x_6.att_params;
this.att_tdspar=x_6.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params2","PARFSX -> virg PARF #params1 #adresse PARFSX1 #params2 #last_adr ;"});
}
  }
private void action_params_7() throws Exception {
try {
// instructions
this.att_params=this.att_hparams;
this.att_tdspar=this.att_htdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","PARFSX -> #params #last_adr ;"});
}
  }
private void action_last_adr_8(S_PARF_MOC x_3, S_PARFSX_MOC x_6) throws Exception {
try {
// instructions
this.att_last_adr=x_6.att_last_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","PARFSX -> virg PARF #params1 #adresse PARFSX1 #params2 #last_adr ;"});
}
  }
private void action_last_adr_7() throws Exception {
try {
// instructions
this.att_last_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#last_adr","PARFSX -> #params #last_adr ;"});
}
  }
private void action_adresse_8(S_PARF_MOC x_3, S_PARFSX_MOC x_6) throws Exception {
try {
// instructions
x_6.att_hadr=x_3.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","PARFSX -> virg PARF #params1 #adresse PARFSX1 #params2 #last_adr ;"});
}
  }
private void action_auto_inh_8(S_PARF_MOC x_3, S_PARFSX_MOC x_6) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_6.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_6.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_6.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_6.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_6.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_6.att_regLB=this.att_regLB;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_3.att_hparams=this.att_hparams;
x_3.att_htdspar=this.att_htdspar;
x_3.att_hadr=this.att_hadr;
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","PARFSX -> virg PARF #params1 #adresse PARFSX1 #params2 #last_adr ;"});
}
  }
private void action_params1_8(S_PARF_MOC x_3, S_PARFSX_MOC x_6) throws Exception {
try {
// instructions
x_6.att_hparams=x_3.att_params;
x_6.att_htdspar=x_3.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params1","PARFSX -> virg PARF #params1 #adresse PARFSX1 #params2 #last_adr ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_parf : // 33
        regle7 () ;
      break ;
      case LEX_MOC.token_virg : // 36
        regle8 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
