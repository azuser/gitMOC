package moc.egg;
import moc.tds.*;
import moc.type.*;
import java.util.*;
import moc.gc.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_INSTS_ASM {
LEX_ASM scanner;
  S_INSTS_ASM() {
    }
  S_INSTS_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle1() throws Exception {

    //declaration
    S_INST_ASM x_2 = new S_INST_ASM(scanner,att_eval) ;
    S_INSTS_ASM x_3 = new S_INSTS_ASM(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_1(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_1(x_2, x_3);
  }
  private void regle2() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_2();
  }
private void action_gen_1(S_INST_ASM x_2, S_INSTS_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_code_asm+"\n"+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INSTS -> INST INSTS1 #gen ;"});
}
  }
private void action_gen_2() throws Exception {
try {
// instructions
this.att_code_asm="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INSTS -> #gen ;"});
}
  }
private void action_auto_inh_1(S_INST_ASM x_2, S_INSTS_ASM x_3) throws Exception {
try {
// instructions
x_2.att_tds_asm=this.att_tds_asm;
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","INSTS -> INST INSTS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_nl : // 32
        regle1 () ;
      break ;
      case LEX_ASM.token_info : // 38
        regle1 () ;
      break ;
      case LEX_ASM.token_load : // 16
        regle1 () ;
      break ;
      case LEX_ASM.token_loada : // 17
        regle1 () ;
      break ;
      case LEX_ASM.token_loadi : // 18
        regle1 () ;
      break ;
      case LEX_ASM.token_loadl : // 19
        regle1 () ;
      break ;
      case LEX_ASM.token_store : // 20
        regle1 () ;
      break ;
      case LEX_ASM.token_storei : // 21
        regle1 () ;
      break ;
      case LEX_ASM.token_call : // 22
        regle1 () ;
      break ;
      case LEX_ASM.token_calli : // 23
        regle1 () ;
      break ;
      case LEX_ASM.token_return : // 24
        regle1 () ;
      break ;
      case LEX_ASM.token_subr : // 25
        regle1 () ;
      break ;
      case LEX_ASM.token_ident : // 37
        regle1 () ;
      break ;
      case LEX_ASM.token_push : // 26
        regle1 () ;
      break ;
      case LEX_ASM.token_pop : // 27
        regle1 () ;
      break ;
      case LEX_ASM.token_jump : // 28
        regle1 () ;
      break ;
      case LEX_ASM.token_jumpi : // 29
        regle1 () ;
      break ;
      case LEX_ASM.token_jumpif : // 30
        regle1 () ;
      break ;
      case LEX_ASM.token_halt : // 31
        regle1 () ;
      break ;
      case LEX_ASM.token_acf : // 15
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
