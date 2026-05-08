package factory_2;

public class Conexao {
	private int host;
	private int porta;
	private String user;
	private String pass;
	
	public Conexao host(int host) {
		this.host = host;
		return this;
	}
	
	public Conexao porta(int porta) {
		this.porta = porta;
		return this;
	}
	public Conexao user(String user) {
		this.user = user;
		return this;
	}
	public Conexao pass(String pass) {
		this.pass = pass;
		return this;
	}

	public int getHost() {
		return host;
	}

	public int getPorta() {
		return porta;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public void setHost(int host) {
		this.host = host;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
