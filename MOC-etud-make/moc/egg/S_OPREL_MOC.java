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
public class S_OPREL_MOC {
LEX_MOC scanner;
  S_OPREL_MOC() {
    }
  S_OPREL_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle37() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_eg);
if  (att_eval)      action_gen_37();
  }
  private void regle38() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_neg);
if  (att_eval)      action_gen_38();
  }
  private void regle35() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_infeg);
if  (att_eval)      action_gen_35();
  }
  private void regle36() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_supeg);
if  (att_eval)      action_gen_36();
  }
  private void regle33() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_inf);
if  (att_eval)      action_gen_33();
  }
  private void regle34() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_sup);
if  (att_eval)      action_gen_34();
  }
private void action_gen_33() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIInferieur();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> inf #gen ;"});
}
  }
private void action_gen_37() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIEgal();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> eg #gen ;"});
}
  }
private void action_gen_36() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genISupEgal();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> supeg #gen ;"});
}
  }
private void action_gen_35() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIInfEgal();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> infeg #gen ;"});
}
  }
private void action_gen_34() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genISuperieur();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> sup #gen ;"});
}
  }
private void action_gen_38() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIDifferent();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPREL -> neg #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_inf : // 48
        regle33 () ;
      break ;
      case LEX_MOC.token_sup : // 50
        regle34 () ;
      break ;
      case LEX_MOC.token_infeg : // 49
        regle35 () ;
      break ;
      case LEX_MOC.token_supeg : // 51
        regle36 () ;
      break ;
      case LEX_MOC.token_eg : // 52
        regle37 () ;
      break ;
      case LEX_MOC.token_neg : // 53
        regle38 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
