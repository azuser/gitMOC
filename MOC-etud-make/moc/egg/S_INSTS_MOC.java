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
public class S_INSTS_MOC {
LEX_MOC scanner;
  S_INSTS_MOC() {
    }
  S_INSTS_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_adr;
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
  private void regle17() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_isReturn_17();
if  (att_eval)      action_adr_17();
if  (att_eval)      action_gen_17();
  }
  private void regle18() throws Exception {

    //declaration
    S_INST_MOC x_3 = new S_INST_MOC(scanner,att_eval) ;
    S_INSTS_MOC x_6 = new S_INSTS_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_18(x_3, x_6);
if  (att_eval)      action_passeType_18(x_3, x_6);
    x_3.analyser() ;
if  (att_eval)      action_tds_18(x_3, x_6);
if  (att_eval)      action_adresse_18(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_isReturn_18(x_3, x_6);
if  (att_eval)      action_adr_18(x_3, x_6);
if  (att_eval)      action_gen_18(x_3, x_6);
  }
private void action_gen_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_adr_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_adr=x_6.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adr","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_auto_inh_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
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
x_3.att_tds_fonction=this.att_tds_fonction;
x_6.att_tds_fonction=this.att_tds_fonction;
x_3.att_hadr=this.att_hadr;
x_3.att_htailleparams=this.att_htailleparams;
x_6.att_htailleparams=this.att_htailleparams;
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_gen_17() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_adr_17() throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adr","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_adresse_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_6.att_hadr=x_3.att_adr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_tds_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_6.att_tds=x_3.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_isReturn_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
this.att_isRet=x_3.att_isRet||x_6.att_isRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
private void action_isReturn_17() throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INSTS -> #isReturn #adr #gen ;"});
}
  }
private void action_passeType_18(S_INST_MOC x_3, S_INSTS_MOC x_6) throws Exception {
try {
// instructions
x_3.att_typeRet=this.att_typeRet;
x_6.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeType","INSTS -> #passeType INST #tds #adresse INSTS1 #isReturn #adr #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_acf : // 35
        regle17 () ;
      break ;
      case LEX_MOC.token_void : // 41
        regle18 () ;
      break ;
      case LEX_MOC.token_int : // 43
        regle18 () ;
      break ;
      case LEX_MOC.token_char : // 44
        regle18 () ;
      break ;
      case LEX_MOC.token_entier : // 62
        regle18 () ;
      break ;
      case LEX_MOC.token_caractere : // 63
        regle18 () ;
      break ;
      case LEX_MOC.token_plus : // 54
        regle18 () ;
      break ;
      case LEX_MOC.token_moins : // 55
        regle18 () ;
      break ;
      case LEX_MOC.token_non : // 61
        regle18 () ;
      break ;
      case LEX_MOC.token_null : // 46
        regle18 () ;
      break ;
      case LEX_MOC.token_paro : // 32
        regle18 () ;
      break ;
      case LEX_MOC.token_ident : // 65
        regle18 () ;
      break ;
      case LEX_MOC.token_mult : // 57
        regle18 () ;
      break ;
      case LEX_MOC.token_aco : // 34
        regle18 () ;
      break ;
      case LEX_MOC.token_si : // 39
        regle18 () ;
      break ;
      case LEX_MOC.token_retour : // 45
        regle18 () ;
      break ;
      case LEX_MOC.token_asm : // 42
        regle18 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
