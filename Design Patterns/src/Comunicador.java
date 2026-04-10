
public class Comunicador {
	
	private	static Comunicador instancia;
	
	private Comunicador() { }
	
	public static Comunicador getInstance() {
		if (instancia != null) {
			return instancia;
		}
		return new Comunicador();
	}
	
	public String does_things() {
		return "abab";
	}
	
}
