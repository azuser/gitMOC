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
public class S_INST_MOC {
LEX_MOC scanner;
  S_INST_MOC() {
    }
  S_INST_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_adr;
  Register att_regLB;
  TDS att_stds;
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
  int glob_19_adresse;
  INFO glob_19_i;
  Emplacement glob_19_empl;
  private void regle26() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_26(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_adresse_26(x_4);
if  (att_eval)      action_stds_26(x_4);
if  (att_eval)      action_isReturn_26(x_4);
if  (att_eval)      action_gen_26(x_4);
  }
  private void regle25() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_4 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_25(x_4);
    x_2.analyser(LEX_MOC.token_retour);
if  (att_eval)      action_lire_resultat_25(x_4);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_adresse_25(x_4);
if  (att_eval)      action_tds_25(x_4);
if  (att_eval)      action_verifReturn_25(x_4);
if  (att_eval)      action_isReturn_25(x_4);
if  (att_eval)      action_gen_25(x_4);
  }
  private void regle19() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_AFFX_MOC x_8 = new S_AFFX_MOC(scanner,att_eval) ;
    T_MOC x_9 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_19(x_2, x_3, x_8);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_tds_19(x_2, x_3, x_8);
if  (att_eval)      action_adresse_19(x_2, x_3, x_8);
if  (att_eval)      action_lire_resultat_19(x_2, x_3, x_8);
if  (att_eval)      action_code_gauche_19(x_2, x_3, x_8);
    x_8.analyser() ;
    x_9.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_verifCompatibilite_19(x_2, x_3, x_8);
if  (att_eval)      action_isReturn_19(x_2, x_3, x_8);
if  (att_eval)      action_gen_19(x_2, x_3, x_8);
if  (att_eval)      action_setInit_19(x_2, x_3, x_8);
  }
  private void regle22() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_E_MOC x_5 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_9 = new S_BLOC_MOC(scanner,att_eval) ;
    S_SIX_MOC x_10 = new S_SIX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_5, x_9, x_10);
    x_2.analyser(LEX_MOC.token_si);
    x_3.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_lire_resultat_22(x_5, x_9, x_10);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_tds_22(x_5, x_9, x_10);
if  (att_eval)      action_passeTypeRet_22(x_5, x_9, x_10);
    x_9.analyser() ;
    x_10.analyser() ;
if  (att_eval)      action_adresse_22(x_5, x_9, x_10);
if  (att_eval)      action_stds_22(x_5, x_9, x_10);
if  (att_eval)      action_isReturn_22(x_5, x_9, x_10);
if  (att_eval)      action_gen_22(x_5, x_9, x_10);
  }
  private void regle20() throws Exception {

    //declaration
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_20(x_3);
if  (att_eval)      action_lire_resultat_20(x_3);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_adresse_20(x_3);
if  (att_eval)      action_stds_20(x_3);
if  (att_eval)      action_isReturn_20(x_3);
if  (att_eval)      action_gen_20(x_3);
  }
  private void regle21() throws Exception {

    //declaration
    S_BLOC_MOC x_4 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_21(x_4);
if  (att_eval)      action_passeTypeRet_21(x_4);
if  (att_eval)      action_tds_21(x_4);
    x_4.analyser() ;
if  (att_eval)      action_adresse_21(x_4);
if  (att_eval)      action_stds_21(x_4);
if  (att_eval)      action_isReturn_21(x_4);
if  (att_eval)      action_gen_21(x_4);
  }
private void action_gen_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// locales
String loc_leCode;
// instructions
this.att_code=x_8.att_code+this.att_machine.genComment("fin de declaration de "+x_3.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_stds_20(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_stds_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_stds_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_lire_resultat_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
x_8.att_lire_resultat=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_auto_inh_20(S_E_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_3.att_tds=this.att_tds;
x_3.att_tds_fonction=this.att_tds_fonction;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_auto_inh_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tInt=this.att_tInt;
x_4.att_tChar=this.att_tChar;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tVoid=this.att_tVoid;
x_4.att_tString=this.att_tString;
x_4.att_regLB=this.att_regLB;
x_4.att_tds=this.att_tds;
x_4.att_tds_fonction=this.att_tds_fonction;
x_4.att_hadr=this.att_hadr;
x_4.att_htailleparams=this.att_htailleparams;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_adresse_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
glob_19_adresse=this.att_hadr+x_2.att_type.getTaille();
this.att_adr=glob_19_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_isReturn_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_verifCompatibilite_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// locales
boolean loc_compValue;
// instructions
if (x_8.att_type!=null){
loc_compValue=x_2.att_type.compareTo(x_8.att_type);
if (!(loc_compValue)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_04, MOCMessages.B_04,new Object[]{""+"affectation non compatible"});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifCompatibilite","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_auto_inh_25(S_E_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tInt=this.att_tInt;
x_4.att_tChar=this.att_tChar;
x_4.att_tPointeurNull=this.att_tPointeurNull;
x_4.att_tVoid=this.att_tVoid;
x_4.att_tString=this.att_tString;
x_4.att_regLB=this.att_regLB;
x_4.att_tds=this.att_tds;
x_4.att_tds_fonction=this.att_tds_fonction;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_stds_26(ASM x_4) throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#stds","INST -> asm #tds ASM #adresse #stds #isReturn #gen ;"});
}
  }
private void action_auto_inh_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_9.att_tInt=this.att_tInt;
x_10.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_9.att_tChar=this.att_tChar;
x_10.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_9.att_tPointeurNull=this.att_tPointeurNull;
x_10.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_9.att_tVoid=this.att_tVoid;
x_10.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_9.att_tString=this.att_tString;
x_10.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_9.att_regLB=this.att_regLB;
x_10.att_regLB=this.att_regLB;
x_5.att_tds=this.att_tds;
x_10.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_9.att_tds_fonction=this.att_tds_fonction;
x_10.att_tds_fonction=this.att_tds_fonction;
x_9.att_hadr=this.att_hadr;
x_10.att_hadr=this.att_hadr;
x_9.att_htailleparams=this.att_htailleparams;
x_10.att_htailleparams=this.att_htailleparams;
x_5.att_machine=this.att_machine;
x_9.att_machine=this.att_machine;
x_10.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_lire_resultat_20(S_E_MOC x_3) throws Exception {
try {
// instructions
x_3.att_lire_resultat=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_passeTypeRet_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
x_9.att_typeRet=this.att_typeRet;
x_10.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTypeRet","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_auto_inh_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_8.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_8.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_8.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_8.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_8.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_8.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
x_8.att_tds_fonction=this.att_tds_fonction;
x_8.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_passeTypeRet_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
x_4.att_typeRet=this.att_typeRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#passeTypeRet","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_tds_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
x_9.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_setInit_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
if (!(x_8.att_vide)){
if (glob_19_i instanceof INFOVAR ){
((INFOVAR)glob_19_i).setInitialiser();
}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#setInit","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_gen_26(ASM x_4) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCodeInLine(x_4.att_code_asm);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> asm #tds ASM #adresse #stds #isReturn #gen ;"});
}
  }
private void action_adresse_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_gen_25(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genRetour(this.att_htailleparams, x_4.att_type.getTaille(), x_4.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_tds_25(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_adresse_20(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_verifReturn_25(S_E_MOC x_4) throws Exception {
try {
// instructions
if (!(this.att_typeRet.compareTo(x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_21, MOCMessages.B_21,new Object[]{""+"faux retour"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifReturn","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_lire_resultat_25(S_E_MOC x_4) throws Exception {
try {
// instructions
x_4.att_lire_resultat=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_tds_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_lire_resultat_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
x_5.att_lire_resultat=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#lire_resultat","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_adresse_26(ASM x_4) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> asm #tds ASM #adresse #stds #isReturn #gen ;"});
}
  }
private void action_isReturn_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_isReturn_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
this.att_isRet=x_9.att_isRet&&x_10.att_isRet;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_tds_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
glob_19_i=this.att_tds.chercherLocalement(x_3.att_txt);
if ((glob_19_i!=null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_03, MOCMessages.B_03,new Object[]{""+"nom de variable deja utilise "});

}
else {
glob_19_empl= new Emplacement(this.att_hadr, this.att_regLB);
glob_19_i= new INFOVAR(x_2.att_type, glob_19_empl);
this.att_tds.inserer(x_3.att_txt, glob_19_i);
}
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_tds_26(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> asm #tds ASM #adresse #stds #isReturn #gen ;"});
}
  }
private void action_adresse_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_gen_20(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_gen_21(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> #passeTypeRet #tds BLOC #adresse #stds #isReturn #gen ;"});
}
  }
private void action_adresse_25(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_adr=this.att_hadr;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_gen_22(S_E_MOC x_5, S_BLOC_MOC x_9, S_SIX_MOC x_10) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIf(x_5.att_code, x_9.att_code, x_10.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> si paro #lire_resultat E parf #tds #passeTypeRet BLOC SIX #adresse #stds #isReturn #gen ;"});
}
  }
private void action_isReturn_20(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_isRet=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> #lire_resultat E pv #adresse #stds #isReturn #gen ;"});
}
  }
private void action_code_gauche_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_8) throws Exception {
try {
// instructions
x_8.att_code_gauche=this.att_machine.genDeclaration(x_3.att_txt, x_2.att_type.getTaille(), glob_19_empl);
x_8.att_hadresse=glob_19_empl;
x_8.att_hest_adresse=false;
x_8.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#code_gauche","INST -> TYPE ident #tds #adresse #lire_resultat #code_gauche AFFX pv #verifCompatibilite #isReturn #gen #setInit ;"});
}
  }
private void action_isReturn_25(S_E_MOC x_4) throws Exception {
try {
// instructions
this.att_isRet=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> retour #lire_resultat E pv #adresse #tds #verifReturn #isReturn #gen ;"});
}
  }
private void action_isReturn_26(ASM x_4) throws Exception {
try {
// instructions
this.att_isRet=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#isReturn","INST -> asm #tds ASM #adresse #stds #isReturn #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_void : // 41
        regle19 () ;
      break ;
      case LEX_MOC.token_int : // 43
        regle19 () ;
      break ;
      case LEX_MOC.token_char : // 44
        regle19 () ;
      break ;
      case LEX_MOC.token_entier : // 62
        regle20 () ;
      break ;
      case LEX_MOC.token_caractere : // 63
        regle20 () ;
      break ;
      case LEX_MOC.token_plus : // 54
        regle20 () ;
      break ;
      case LEX_MOC.token_moins : // 55
        regle20 () ;
      break ;
      case LEX_MOC.token_non : // 61
        regle20 () ;
      break ;
      case LEX_MOC.token_null : // 46
        regle20 () ;
      break ;
      case LEX_MOC.token_paro : // 32
        regle20 () ;
      break ;
      case LEX_MOC.token_ident : // 65
        regle20 () ;
      break ;
      case LEX_MOC.token_mult : // 57
        regle20 () ;
      break ;
      case LEX_MOC.token_aco : // 34
        regle21 () ;
      break ;
      case LEX_MOC.token_si : // 39
        regle22 () ;
      break ;
      case LEX_MOC.token_retour : // 45
        regle25 () ;
      break ;
      case LEX_MOC.token_asm : // 42
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
