package singleton_problem;

public class AuthenticationDTO {
	// Attributes
	private String usuario;
	private String senha;
	private String anfitriao;
	private int porta;
	
	// Constructor
	public AuthenticationDTO(String usuario, String senha, String anfitriao, int porta) {
		this.usuario = usuario;
		this.senha = senha;
		this.anfitriao = anfitriao;
		this.porta = porta;
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
