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
public class S_TYPE_MOC {
LEX_MOC scanner;
  S_TYPE_MOC() {
    }
  S_TYPE_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_tVoid;
  Register att_regLB;
  boolean att_eval;
  DTYPE att_tChar;
  DTYPE att_type;
  TDS att_tds;
  DTYPE att_tPointeurNull;
  DTYPE att_tInt;
  LEX_MOC att_scanner;
  DTYPE att_tString;
  private void regle10() throws Exception {

    //declaration
    S_STYPE_MOC x_2 = new S_STYPE_MOC(scanner,att_eval) ;
    S_REFS_MOC x_4 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_10(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_recapTypePointeur_10(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_creatType_10(x_2, x_4);
  }
private void action_creatType_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
private void action_recapTypePointeur_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#recapTypePointeur","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
private void action_auto_inh_10(S_STYPE_MOC x_2, S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","TYPE -> STYPE #recapTypePointeur REFS #creatType ;"});
}
  }
  public void analyser () throws Exception {
    regle10 () ;
  }
  }
