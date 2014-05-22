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
public class S_BLOC_MOC {
LEX_MOC scanner;
  S_BLOC_MOC() {
    }
  S_BLOC_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  boolean att_eval;
  DTYPE att_typeRet;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  int att_htailleparams;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  DTYPE att_tChar;
  boolean att_isRet;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  TDS glob_16_t;
  private void regle16() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_INSTS_MOC x_5 = new S_INSTS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_16(x_5);
    x_2.analyser(LEX_MOC.token_aco);
if  (att_eval)      action_tds_16(x_5);
if  (att_eval)      action_passeTypeRet_16(x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_acf);
if  (att_eval)      action_isReturn_16(x_5);
if  (att_eval)      action_gen_16(x_5);
  }
private void action_auto_inh_16(S_INSTS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_hadr=this.att_hadr;
x_5.att_htailleparams=this.att_htailleparams;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","BLOC -> aco #tds #passeTypeRet INSTS acf #isReturn #gen ;"});
}
  }
private void action_gen_16(S_INSTS_MOC x_5) throws Exception {
try {
// locales
int loc_tailleBloc;
// instructions
loc_tailleBloc=x_5.att_adr-this.att_hadr;
System.out.print(""+"; tds:\n"+glob_16_t);
System.out.print(""+"; taille des locales = "+loc_tailleBloc+"\n");
this.att_code=x_5.att_code+this.att_machine.genComment("fin d'un bloc : pop")+this.att_machine.genFree(loc_tailleBloc);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","BLOC -> aco #tds #passeTypeRet INSTS acf #isReturn #gen ;"});
}
  }
private void action_tds_16(S_INSTS_MOC x_5) throws Exception {
try {
// instructions
glob_16_t= new TDS(this.att_tds);
x_5.att_tds=glob_16_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","BLOC -> aco #tds #passeTypeRet INSTS acf #isReturn #gen ;"});
}
  }
private void action_isReturn_16(S_INSTS_MOC x_5) throws Exception {
try {
// instructions
this.att_isRet=x_5.att_isRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","BLOC -> aco #tds #passeTypeRet INSTS acf #isReturn #gen ;"});
}
  }
private void action_passeTypeRet_16(S_INSTS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTypeRet","BLOC -> aco #tds #passeTypeRet INSTS acf #isReturn #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle16 () ;
  }
  }
