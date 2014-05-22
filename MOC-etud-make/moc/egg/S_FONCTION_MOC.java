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
public class S_FONCTION_MOC {
LEX_MOC scanner;
  S_FONCTION_MOC() {
    }
  S_FONCTION_MOC(LEX_MOC scanner, boolean eval) {
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
  int glob_4_tailleparams;
  String glob_4_leCode;
  DTYPE glob_4_tRetour;
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    S_PARFS_MOC x_7 = new S_PARFS_MOC(scanner,att_eval) ;
    T_MOC x_8 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_12 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_7, x_12);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
    x_4.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_params_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_adresse_4(x_2, x_3, x_7, x_12);
    x_7.analyser() ;
    x_8.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_tds_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_passeTypeRet_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_passeTailleparams_4(x_2, x_3, x_7, x_12);
    x_12.analyser() ;
if  (att_eval)      action_tds_fonction_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_verifReturn_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_aff_4(x_2, x_3, x_7, x_12);
if  (att_eval)      action_gen_4(x_2, x_3, x_7, x_12);
  }
private void action_passeTailleparams_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
glob_4_tailleparams=-(x_7.att_last_adr)-1;
x_12.att_htailleparams=glob_4_tailleparams;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTailleparams","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_auto_inh_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_7.att_tInt=this.att_tInt;
x_12.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_7.att_tChar=this.att_tChar;
x_12.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_7.att_tPointeurNull=this.att_tPointeurNull;
x_12.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_7.att_tVoid=this.att_tVoid;
x_12.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_7.att_tString=this.att_tString;
x_12.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_7.att_regLB=this.att_regLB;
x_12.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
x_12.att_tds_fonction=this.att_tds_fonction;
x_7.att_machine=this.att_machine;
x_12.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_gen_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
glob_4_leCode=this.att_machine.genFonction(x_3.att_txt, x_12.att_code);
glob_4_tRetour=x_2.att_type;
if ((glob_4_tRetour.isVoid())){
glob_4_leCode=glob_4_leCode+this.att_machine.genRetour(glob_4_tailleparams, 0, "");
}

this.att_code=glob_4_leCode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_params_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
x_7.att_hparams= new PARAMETRES();
x_7.att_htdspar= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_aff_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#aff","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_verifReturn_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
if (!(x_2.att_type.isVoid())&&!(x_12.att_isRet)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_22, MOCMessages.B_22,new Object[]{""+"vous avez oublie le retour"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifReturn","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_adresse_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
x_7.att_hadr=-(1);
x_12.att_hadr=3;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_tds_fonction_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// locales
INFOFONCTION loc_i;
TDS loc_t;
String loc_s;
// instructions
loc_i= new INFOFONCTION(x_2.att_type, x_7.att_params);
loc_t=this.att_tds_fonction;
loc_s="Already_declared";
if ((loc_t.chercherLocalement(x_3.att_txt)!=null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_01, MOCMessages.B_01,new Object[]{""+"fonction deja existante"});

}
else {
loc_t.inserer(x_3.att_txt, loc_i);
}
this.att_stds_fonction=loc_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds_fonction","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_passeTypeRet_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
x_12.att_typeRet=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTypeRet","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
private void action_tds_4(S_TYPE_MOC x_2, T_MOC x_3, S_PARFS_MOC x_7, S_BLOC_MOC x_12) throws Exception {
try {
// instructions
x_12.att_tds=x_7.att_tdspar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","FONCTION -> TYPE ident paro #params #adresse PARFS parf #tds #passeTypeRet #passeTailleparams BLOC #tds_fonction #verifReturn #aff #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }
