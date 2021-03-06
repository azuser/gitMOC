package moc.gc;

/**
 * Cette classe décrit un registre d'une machine
 * 
 * @author marcel
 */
public class Register {
	private String name;
	private int num;

	/**
	 * @param name
	 * @param num
	 */
	public Register(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", num=" + num + "]";
	}

}
