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
public class S_PARF_MOC {
LEX_MOC scanner;
  S_PARF_MOC() {
    }
  S_PARF_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  int att_adr;
  Register att_regLB;
  boolean att_eval;
  PARAMETRES att_hparams;
  PARAMETRES att_params;
  IMachine att_machine;
  DTYPE att_tInt;
  DTYPE att_tString;
  DTYPE att_tVoid;
  int att_hadr;
  TDS att_htdspar;
  DTYPE att_tChar;
  TDS att_tdspar;
  LEX_MOC att_scanner;
  DTYPE att_tPointeurNull;
  TDS att_tds;
  private void regle9() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
if  (att_eval)      action_params_9(x_2, x_3);
if  (att_eval)      action_adresse_9(x_2, x_3);
  }
private void action_adresse_9(S_TYPE_MOC x_2, T_MOC x_3) throws Exception {
try {
// locales
int loc_taille;
// instructions
loc_taille=x_2.att_type.getTaille();
this.att_adr=this.att_hadr-loc_taille;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#adresse","PARF -> TYPE ident #params #adresse ;"});
}
  }
private void action_auto_inh_9(S_TYPE_MOC x_2, T_MOC x_3) throws Exception {
try {
// instructions
x_2.att_tInt=this.att_tInt;
x_2.att_tChar=this.att_tChar;
x_2.att_tPointeurNull=this.att_tPointeurNull;
x_2.att_tVoid=this.att_tVoid;
x_2.att_tString=this.att_tString;
x_2.att_regLB=this.att_regLB;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","PARF -> TYPE ident #params #adresse ;"});
}
  }
private void action_params_9(S_TYPE_MOC x_2, T_MOC x_3) throws Exception {
try {
// locales
PARAMETRES loc_p;
INFOVAR loc_i;
TDS loc_t;
// instructions
loc_i= new INFOVAR(x_2.att_type,  new Emplacement(this.att_hadr, this.att_regLB));
loc_i.setInitialiser();
loc_p=this.att_hparams;
loc_p.inserer(x_2.att_type);
this.att_params=loc_p;
loc_t=this.att_htdspar;
if ((loc_t.chercherLocalement(x_3.att_txt)==null)){
loc_t.inserer(x_3.att_txt, loc_i);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_02, MOCMessages.B_02,new Object[]{""+"nom de parametre deja existant "});

}
this.att_tdspar=loc_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#params","PARF -> TYPE ident #params #adresse ;"});
}
  }
  public void analyser () throws Exception {
    regle9 () ;
  }
  }
