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
public class S_ENTITES_MOC {
LEX_MOC scanner;
  S_ENTITES_MOC() {
    }
  S_ENTITES_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Register att_regLB;
  boolean att_eval;
  TDS att_stds_fonction;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  DTYPE att_tChar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_tds_fonction_1();
if  (att_eval)      action_gen_1();
  }
  private void regle3() throws Exception {

    //declaration
    S_FONCTION_MOC x_2 = new S_FONCTION_MOC(scanner,att_eval) ;
    S_ENTITES_MOC x_4 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_tds_fonction_3(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_stds_fonction_3(x_2, x_4);
if  (att_eval)      action_gen_3(x_2, x_4);
  }
  private void regle2() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    S_ENTITES_MOC x_5 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_4, x_5);
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_2(x_4, x_5);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
    x_5.analyser() ;
if  (att_eval)      action_tds_fonction_2(x_4, x_5);
if  (att_eval)      action_gen_2(x_4, x_5);
  }
private void action_gen_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_gen_1() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> #tds_fonction #gen ;"});
}
  }
private void action_gen_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCodeInLine(x_4.att_code_asm)+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tds=this.att_tds;
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_1() throws Exception {
try {
// instructions
this.att_stds_fonction=this.att_tds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
try {
// instructions
this.att_stds_fonction=x_5.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_tds_fonction_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tds_fonction=x_2.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","ENTITES -> FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_stds_fonction_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_4) throws Exception {
try {
// instructions
this.att_stds_fonction=x_4.att_stds_fonction;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds_fonction","ENTITES -> FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
private void action_auto_inh_2(ASM x_4, S_ENTITES_MOC x_5) throws Exception {
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
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> asm #tds ASM ENTITES1 #tds_fonction #gen ;"});
}
  }
private void action_auto_inh_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_4) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_4.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_4.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_4.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_4.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_4.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_tds_fonction=this.att_tds_fonction;
x_2.att_hadr=this.att_hadr;
x_4.att_hadr=this.att_hadr;
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> FONCTION #tds_fonction ENTITES1 #stds_fonction #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.EOF :
        regle1 () ;
      break ;
      case LEX_MOC.token_asm : // 42
        regle2 () ;
      break ;
      case LEX_MOC.token_void : // 41
        regle3 () ;
      break ;
      case LEX_MOC.token_int : // 43
        regle3 () ;
      break ;
      case LEX_MOC.token_char : // 44
        regle3 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
