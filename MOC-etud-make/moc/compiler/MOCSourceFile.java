package moc.compiler;

import mg.egg.eggc.runtime.libjava.SourceUnit;
import moc.gc.AbstractMachine;
import moc.gc.MTAM;

/**
 * Decrit une unite de compilation MOC
 * @author marcel
 *
 */
public class MOCSourceFile extends SourceUnit {
	// obligatoire pour un SourceUnit : le nom du fichier
	private String fileName;
	// la machine cible
	private AbstractMachine machine;
	private String machName;

	public MOCSourceFile(String[] args) throws MOCException {
		super(args[0]);
		// d'autres arguments ?
		analyze(args);
	}

	/**
	 * Affiche les options disponibles
	 * 
	 * @param a
	 * @throws MOCException
	 */
	private void usage(String a) throws MOCException {
		throw new MOCException("Option incorrecte : " + a + ". "
				+ Messages.getString("MOC.usage"));
	}

	/**
	 * Analyse les arguments supplementaires du compilateur
	 * 
	 * @param args
	 * @throws MOCException
	 */
	public void analyze(String[] args) throws MOCException {
		int argc = args.length;
		// nom du fichier
		fileName = args[0];
		// machine cible ?
		if (argc == 1) {
			// machine tam par defaut
			setMachine("tam");
		} else {
			// nom de la machine ?
			for (int i = 1; i < argc; i++) {
				String a = args[i];
				if ("-m".equals(a)) { //$NON-NLS-1$
					if (i + 1 < argc) {
						i++;
						setMachine(args[i]);
					} else
						usage(a);
				} else {
					usage(a);
				}
			}
		}
	}

	/**
	 * Fixe et CREE la machine cible
	 * 
	 * @param mach
	 */
	private void setMachine(String mach) {
		// System.err.println("mach " + mach);
		machName = mach;
		if ("tam".equals(mach)) {
			machine = new MTAM();
		} else {
			// TODO si la machine n'est pas tam
			// machine = new ???();
		}
	}

	public AbstractMachine getMachine() {
		return machine;
	}

	public String getMachName() {
		return machName;
	}

	public String getFileName() {
		return fileName;
	}

}
