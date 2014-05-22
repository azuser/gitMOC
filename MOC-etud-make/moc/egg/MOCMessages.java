package moc.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.runtime.libjava.messages.NLS;
public class MOCMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "moc.MOC";
  private MOCMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, moc.egg.MOCMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String Interne_adresse;
  public static  String B_55;
  public static  String B_100;
  public static  String B_22;
  public static  String B_21;
  public static  String B_51;
  public static  String B_20;
  public static  String B_50;
  public static  String MOC_unexpected_token;
  public static  String MOC_expected_token;
  public static  String B_04;
  public static  String B_03;
  public static  String B_02;
  public static  String B_01;
  public static  String B_6;
  public static  String NO_MAIN;
  public static  String NO_MACH;
  public static  String MOC_expected_eof;
  public static  String B_18;
  public static  String B_17;
  public static  String B_16;
  public static  String B_15;
  public static  String B_14;
  public static  String B_13;
  public static  String NonAffectable;
  }
