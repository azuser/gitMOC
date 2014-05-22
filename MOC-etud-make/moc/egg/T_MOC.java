package moc.egg;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.lex.*;
public class T_MOC {
  LEX_MOC att_scanner;
  String att_txt;
  LEX_MOC scanner;
  private String txt;
  public String getTxt(){return txt;}
  public T_MOC(LEX_MOC scanner ) {
    this.scanner = scanner ;
    this.att_scanner = scanner ;
    }
  public void analyser(int t) throws EGGException {
    scanner.lit ( 1 ) ;
    txt = scanner.fenetre[0].getNom() ;
    att_txt = txt ;
    scanner.accepter_sucre ( t ) ;
    }
    }
