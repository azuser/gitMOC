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
public class S_OPMUL_MOC {
LEX_MOC scanner;
  S_OPMUL_MOC() {
    }
  S_OPMUL_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle48() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_mult);
if  (att_eval)      action_gen_48();
  }
  private void regle50() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_mod);
if  (att_eval)      action_gen_50();
  }
  private void regle51() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_et);
if  (att_eval)      action_gen_51();
  }
  private void regle49() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_div);
if  (att_eval)      action_gen_49();
  }
private void action_gen_50() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIModulo();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPMUL -> mod #gen ;"});
}
  }
private void action_gen_51() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIEt();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPMUL -> et #gen ;"});
}
  }
private void action_gen_49() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIDivision();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPMUL -> div #gen ;"});
}
  }
private void action_gen_48() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIMultiplication();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","OPMUL -> mult #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_mult : // 57
        regle48 () ;
      break ;
      case LEX_MOC.token_div : // 58
        regle49 () ;
      break ;
      case LEX_MOC.token_mod : // 59
        regle50 () ;
      break ;
      case LEX_MOC.token_et : // 60
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
