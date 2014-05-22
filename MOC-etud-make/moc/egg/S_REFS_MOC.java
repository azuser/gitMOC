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
public class S_REFS_MOC {
LEX_MOC scanner;
  S_REFS_MOC() {
    }
  S_REFS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  DTYPE att_htype;
  DTYPE att_type;
  TDS att_tds;
  LEX_MOC att_scanner;
  private void regle11() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_syntheseType_11();
  }
  private void regle12() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_REFS_MOC x_4 = new S_REFS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_12(x_4);
    x_2.analyser(LEX_MOC.token_mult);
if  (att_eval)      action_recapType_12(x_4);
    x_4.analyser() ;
if  (att_eval)      action_creatType_12(x_4);
  }
private void action_creatType_12(S_REFS_MOC x_4) throws Exception {
try {
// instructions
this.att_type= new POINTEUR(x_4.att_type);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#creatType","REFS -> mult #recapType REFS1 #creatType ;"});
}
  }
private void action_recapType_12(S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#recapType","REFS -> mult #recapType REFS1 #creatType ;"});
}
  }
private void action_auto_inh_12(S_REFS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","REFS -> mult #recapType REFS1 #creatType ;"});
}
  }
private void action_syntheseType_11() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#syntheseType","REFS -> #syntheseType ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_ident : // 65
        regle11 () ;
      break ;
      case LEX_MOC.token_parf : // 33
        regle11 () ;
      break ;
      case LEX_MOC.token_mult : // 57
        regle12 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
