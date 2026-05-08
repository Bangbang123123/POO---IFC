package singleton_problem;

public class Authentication {
	// Attributes
	private static Authentication instance;
	
	private String usuario;
	private String senha;
	private String anfitriao;
	private int porta;
	
	// Construction
	private Authentication() {}
	public static Authentication getInstance() {
		if (instance == null) {
			instance = new Authentication();
		}
		return instance;
	}
	
	// Getters
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public String getAnfitriao() {
		return anfitriao;
	}
	public int getPorta() {
		return porta;
	}
	
	// Setters
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setAnfitriao(String anfitriao) {
		this.anfitriao = anfitriao;
	}
	public void setPorta(int porta) {
		this.porta = porta;
	}
}
