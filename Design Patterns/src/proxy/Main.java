package proxy;

public class Main {

	public static void main(String[] args) {
		Servico proxyAdmin = new ProxyControleAcesso("admin");
		proxyAdmin.executar();
		proxyAdmin = new ProxyControleAcesso("lil bro");
		proxyAdmin.executar();

	}

}
