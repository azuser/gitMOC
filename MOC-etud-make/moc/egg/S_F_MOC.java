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
public class S_F_MOC {
LEX_MOC scanner;
  S_F_MOC() {
    }
  S_F_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_est_adresse;
  boolean att_affectable;
  Emplacement att_adresse;
  Register att_regLB;
  INFOVAR att_var;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds_fonction;
  DTYPE att_type;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  boolean att_initialiser;
  DTYPE att_tChar;
  TDS att_tds;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  DTYPE glob_62_type;
  INFOVAR glob_62_i;
  INFOFONCTION glob_61_i;
  private void regle62() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_gen_62(x_2);
if  (att_eval)      action_getType_62(x_2);
if  (att_eval)      action_testInit_62(x_2);
if  (att_eval)      action_estAffectable_62(x_2);
  }
  private void regle63() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_63(x_3);
    x_2.analyser(LEX_MOC.token_mult);
    x_3.analyser() ;
if  (att_eval)      action_getType_63(x_3);
if  (att_eval)      action_estAffectable_63(x_3);
if  (att_eval)      action_testInit_63(x_3);
if  (att_eval)      action_adresse_63(x_3);
  }
  private void regle60() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_TYPE_MOC x_3 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    S_F_MOC x_5 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_60(x_3, x_5);
    x_2.analyser(LEX_MOC.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_verifCast_60(x_3, x_5);
if  (att_eval)      action_getType_60(x_3, x_5);
if  (att_eval)      action_estAffectable_60(x_3, x_5);
if  (att_eval)      action_gen_60(x_3, x_5);
if  (att_eval)      action_testInit_60(x_3, x_5);
  }
  private void regle61() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_ARGS_MOC x_5 = new S_ARGS_MOC(scanner,att_eval) ;
    T_MOC x_6 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_61(x_2, x_5);
    x_2.analyser(LEX_MOC.token_ident);
    x_3.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_params_61(x_2, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_gen_61(x_2, x_5);
if  (att_eval)      action_getType_61(x_2, x_5);
if  (att_eval)      action_estAffectable_61(x_2, x_5);
if  (att_eval)      action_testInit_61(x_2, x_5);
  }
  private void regle58() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_null);
if  (att_eval)      action_getType_58();
if  (att_eval)      action_estAffectable_58();
if  (att_eval)      action_adresse_58();
if  (att_eval)      action_testInit_58();
if  (att_eval)      action_gen_58();
  }
  private void regle59() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_59(x_3);
    x_2.analyser(LEX_MOC.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_getType_59(x_3);
if  (att_eval)      action_estAffectable_59(x_3);
if  (att_eval)      action_adresse_59(x_3);
if  (att_eval)      action_gen_59(x_3);
if  (att_eval)      action_testInit_59(x_3);
  }
  private void regle54() throws Exception {

    //declaration
    S_OPUN_MOC x_2 = new S_OPUN_MOC(scanner,att_eval) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_54(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_verifType_54(x_2, x_3);
if  (att_eval)      action_getType_54(x_2, x_3);
if  (att_eval)      action_testInit_54(x_2, x_3);
if  (att_eval)      action_estAffectable_54(x_2, x_3);
if  (att_eval)      action_adresse_54(x_2, x_3);
if  (att_eval)      action_gen_54(x_2, x_3);
  }
  private void regle53() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_caractere);
if  (att_eval)      action_testInit_53(x_2);
if  (att_eval)      action_getType_53(x_2);
if  (att_eval)      action_estAffectable_53(x_2);
if  (att_eval)      action_gen_53(x_2);
  }
  private void regle52() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_entier);
if  (att_eval)      action_testInit_52(x_2);
if  (att_eval)      action_getType_52(x_2);
if  (att_eval)      action_estAffectable_52(x_2);
if  (att_eval)      action_gen_52(x_2);
  }
private void action_auto_inh_63(S_F_MOC x_3) throws Exception {
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
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> mult F1 #getType #estAffectable #testInit #adresse ;"});
}
  }
private void action_params_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_hparams= new PARAMETRES();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_testInit_58() throws Exception {
try {
// instructions
this.att_initialiser=true;
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> null #getType #estAffectable #adresse #testInit #gen ;"});
}
  }
private void action_testInit_59(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_initialiser=x_3.att_initialiser;
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_verifCast_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
if (!(x_5.att_type.castableTo(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_13, MOCMessages.B_13,new Object[]{""+"Impossible de caster"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifCast","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_gen_62(T_MOC x_2) throws Exception {
try {
// locales
TDS loc_t;
INFO loc_iTemp;
// instructions
loc_t=this.att_tds;
loc_iTemp=loc_t.chercherGlobalement(x_2.att_txt);
if ((loc_iTemp==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_16, MOCMessages.B_16,new Object[]{""+"la variable n existe pas :"+x_2.att_txt});

}
else {
if (loc_iTemp instanceof INFOVAR ){
glob_62_i=((INFOVAR)loc_iTemp);
glob_62_type=glob_62_i.getType();
this.att_code=this.att_machine.genComment("acces a "+x_2.att_txt);
this.att_adresse=glob_62_i.getEmpl();
this.att_est_adresse=false;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une variable ca"});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> ident #gen #getType #testInit #estAffectable ;"});
}
  }
private void action_gen_59(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_gen_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// locales
INFO loc_in;
PARAMETRES loc_p;
// instructions
loc_in=this.att_tds_fonction.chercherLocalement(x_2.att_txt);
if ((loc_in==null)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_14, MOCMessages.B_14,new Object[]{""+"la fonction appelee n existe pas "});

}
else {
if (loc_in instanceof INFOFONCTION ){
glob_61_i=((INFOFONCTION)loc_in);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_17, MOCMessages.B_17,new Object[]{""+" c est pas une fonction"});


}
loc_p=glob_61_i.getParametres();
if ((!(loc_p.compareTo(x_5.att_params)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_15, MOCMessages.B_15,new Object[]{""+" parametres d'appel erronés"});

}
else {
this.att_code=this.att_machine.genComment("empilement des parametres")+x_5.att_code+this.att_machine.genCall(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_gen_58() throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("pointeur null");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> null #getType #estAffectable #adresse #testInit #gen ;"});
}
  }
private void action_auto_inh_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
x_5.att_tInt=this.att_tInt;
x_5.att_tChar=this.att_tChar;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tVoid=this.att_tVoid;
x_5.att_tString=this.att_tString;
x_5.att_regLB=this.att_regLB;
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_gen_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genComment("cast en "+x_3.att_type.getNom()+"de -- ")+x_5.att_code+this.att_machine.genComment("-- : valeur castee");
this.att_est_adresse=x_5.att_est_adresse;
this.att_adresse=x_5.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_adresse_63(S_F_MOC x_3) throws Exception {
try {
// locales
Emplacement loc_adr_du_pointeur;
String loc_leCode;
// instructions
loc_leCode=this.att_machine.genComment("adresse d'affectation inexistante 6");
loc_adr_du_pointeur=x_3.att_adresse;
if (!(x_3.att_est_adresse)){
if (loc_adr_du_pointeur!=null){
loc_leCode=x_3.att_code+this.att_machine.genPushAdresse(loc_adr_du_pointeur);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_Interne_adresse, MOCMessages.Interne_adresse,new Object[]{""+"adresse d'affectation inexistante 5"});

}
}
else {
loc_leCode=x_3.att_code+this.att_machine.genReadIndirectMem(x_3.att_type.getTaille());
}
this.att_code=loc_leCode;
this.att_est_adresse=true;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> mult F1 #getType #estAffectable #testInit #adresse ;"});
}
  }
private void action_auto_inh_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
x_3.att_tInt=this.att_tInt;
x_5.att_tInt=this.att_tInt;
x_3.att_tChar=this.att_tChar;
x_5.att_tChar=this.att_tChar;
x_3.att_tPointeurNull=this.att_tPointeurNull;
x_5.att_tPointeurNull=this.att_tPointeurNull;
x_3.att_tVoid=this.att_tVoid;
x_5.att_tVoid=this.att_tVoid;
x_3.att_tString=this.att_tString;
x_5.att_tString=this.att_tString;
x_3.att_regLB=this.att_regLB;
x_5.att_regLB=this.att_regLB;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_tds_fonction=this.att_tds_fonction;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_gen_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// locales
Emplacement loc_adr_droite;
String loc_codedroit;
// instructions
loc_adr_droite=x_3.att_adresse;
if (loc_adr_droite==null){
loc_codedroit=x_3.att_code;
}
else {
loc_codedroit=x_3.att_code+this.att_machine.genReadMem(loc_adr_droite, x_3.att_type.getTaille());
}
if (x_2.att_code==""){
this.att_code=loc_codedroit;
}
else {
this.att_code=this.att_machine.genOpUnaire(x_2.att_code, loc_codedroit);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_63(S_F_MOC x_3) throws Exception {
try {
// instructions
if (x_3.att_type instanceof POINTEUR ){
this.att_type=((POINTEUR)x_3.att_type).getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_18, MOCMessages.B_18,new Object[]{""+" c est pas un pointeur"});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> mult F1 #getType #estAffectable #testInit #adresse ;"});
}
  }
private void action_gen_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genEntier(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> entier #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_gen_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCaractere(x_2.att_txt);
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","F -> caractere #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_getType_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
this.att_type=glob_61_i.getRetour();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_testInit_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
if (!(x_5.att_initialiser)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_51, MOCMessages.B_51,new Object[]{""+" pas possible de caster une valeur non init"});

this.att_initialiser=false;
}
else {
this.att_initialiser=true;
}
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_getType_62(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=glob_62_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> ident #gen #getType #testInit #estAffectable ;"});
}
  }
private void action_estAffectable_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_affectable=x_5.att_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_estAffectable_63(S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_affectable=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> mult F1 #getType #estAffectable #testInit #adresse ;"});
}
  }
private void action_estAffectable_62(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> ident #gen #getType #testInit #estAffectable ;"});
}
  }
private void action_getType_60(S_TYPE_MOC x_3, S_F_MOC x_5) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> paro TYPE parf F1 #verifCast #getType #estAffectable #gen #testInit ;"});
}
  }
private void action_testInit_63(S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_var=x_3.att_var;
this.att_initialiser=x_3.att_initialiser;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> mult F1 #getType #estAffectable #testInit #adresse ;"});
}
  }
private void action_testInit_62(T_MOC x_2) throws Exception {
try {
// instructions
System.out.print(""+("je passe : "+x_2.att_txt+"\n"));
if (glob_62_i==null){
System.out.print(""+("je suis null \n "));
}
else {
System.out.print(""+("je ne suis pas  null \n "));
}
this.att_var=glob_62_i;
this.att_initialiser=glob_62_i.getInitialiser();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> ident #gen #getType #testInit #estAffectable ;"});
}
  }
private void action_testInit_61(T_MOC x_2, S_ARGS_MOC x_5) throws Exception {
try {
// instructions
this.att_var=null;
this.att_initialiser=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> ident paro #params ARGS parf #gen #getType #estAffectable #testInit ;"});
}
  }
private void action_auto_inh_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
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
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_verifType_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
if (!(x_3.att_type.isOperable())){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_20, MOCMessages.B_20,new Object[]{""+"Les operations ne peuvent etre faites que sur les entiers"});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#verifType","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_adresse_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_est_adresse=x_3.att_est_adresse;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_getType_59(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_getType_58() throws Exception {
try {
// instructions
this.att_type=this.att_tPointeurNull;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> null #getType #estAffectable #adresse #testInit #gen ;"});
}
  }
private void action_getType_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=this.att_tInt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> entier #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_getType_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_type=this.att_tChar;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> caractere #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_adresse_59(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_est_adresse=x_3.att_est_adresse;
this.att_adresse=x_3.att_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_getType_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#getType","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> entier #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_adresse_58() throws Exception {
try {
// instructions
this.att_est_adresse=false;
this.att_adresse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","F -> null #getType #estAffectable #adresse #testInit #gen ;"});
}
  }
private void action_testInit_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_initialiser=x_3.att_initialiser;
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_estAffectable_54(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> OPUN F1 #verifType #getType #testInit #estAffectable #adresse #gen ;"});
}
  }
private void action_auto_inh_59(S_E_MOC x_3) throws Exception {
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
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_estAffectable_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> caractere #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_59(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_affectable=x_3.att_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> paro E parf #getType #estAffectable #adresse #gen #testInit ;"});
}
  }
private void action_testInit_53(T_MOC x_2) throws Exception {
try {
// instructions
this.att_initialiser=true;
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> caractere #testInit #getType #estAffectable #gen ;"});
}
  }
private void action_estAffectable_58() throws Exception {
try {
// instructions
this.att_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#estAffectable","F -> null #getType #estAffectable #adresse #testInit #gen ;"});
}
  }
private void action_testInit_52(T_MOC x_2) throws Exception {
try {
// instructions
this.att_initialiser=true;
this.att_var=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#testInit","F -> entier #testInit #getType #estAffectable #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_entier : // 62
        regle52 () ;
      break ;
      case LEX_MOC.token_caractere : // 63
        regle53 () ;
      break ;
      case LEX_MOC.token_plus : // 54
        regle54 () ;
      break ;
      case LEX_MOC.token_moins : // 55
        regle54 () ;
      break ;
      case LEX_MOC.token_non : // 61
        regle54 () ;
      break ;
      case LEX_MOC.token_null : // 46
        regle58 () ;
      break ;
      case LEX_MOC.token_paro : // 32
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_entier : // 62
            regle59 () ;
          break ;
          case LEX_MOC.token_caractere : // 63
            regle59 () ;
          break ;
          case LEX_MOC.token_plus : // 54
            regle59 () ;
          break ;
          case LEX_MOC.token_moins : // 55
            regle59 () ;
          break ;
          case LEX_MOC.token_non : // 61
            regle59 () ;
          break ;
          case LEX_MOC.token_null : // 46
            regle59 () ;
          break ;
          case LEX_MOC.token_paro : // 32
            regle59 () ;
          break ;
          case LEX_MOC.token_ident : // 65
            regle59 () ;
          break ;
          case LEX_MOC.token_mult : // 57
            regle59 () ;
          break ;
          case LEX_MOC.token_void : // 41
            regle60 () ;
          break ;
          case LEX_MOC.token_int : // 43
            regle60 () ;
          break ;
          case LEX_MOC.token_char : // 44
            regle60 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_paro);
        }
      break ;
      case LEX_MOC.token_ident : // 65
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_paro : // 32
            regle61 () ;
          break ;
          case LEX_MOC.token_mult : // 57
            regle62 () ;
          break ;
          case LEX_MOC.token_div : // 58
            regle62 () ;
          break ;
          case LEX_MOC.token_mod : // 59
            regle62 () ;
          break ;
          case LEX_MOC.token_et : // 60
            regle62 () ;
          break ;
          case LEX_MOC.token_plus : // 54
            regle62 () ;
          break ;
          case LEX_MOC.token_moins : // 55
            regle62 () ;
          break ;
          case LEX_MOC.token_ou : // 56
            regle62 () ;
          break ;
          case LEX_MOC.token_inf : // 48
            regle62 () ;
          break ;
          case LEX_MOC.token_sup : // 50
            regle62 () ;
          break ;
          case LEX_MOC.token_infeg : // 49
            regle62 () ;
          break ;
          case LEX_MOC.token_supeg : // 51
            regle62 () ;
          break ;
          case LEX_MOC.token_eg : // 52
            regle62 () ;
          break ;
          case LEX_MOC.token_neg : // 53
            regle62 () ;
          break ;
          case LEX_MOC.token_affect : // 38
            regle62 () ;
          break ;
          case LEX_MOC.token_virg : // 36
            regle62 () ;
          break ;
          case LEX_MOC.token_parf : // 33
            regle62 () ;
          break ;
          case LEX_MOC.token_pv : // 37
            regle62 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_ident);
        }
      break ;
      case LEX_MOC.token_mult : // 57
        regle63 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
