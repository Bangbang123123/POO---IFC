package singleton_problem;

public class Main {

	public static void main(String[] args) {
		Persistence p = new Persistence();
		
		Authentication auth = p.getAuth(1);
		
		
		System.out.println(
				"\nNome: "+ auth.getUsuario() +
				"\nSenha: "+ auth.getSenha() +
				"\nHost: "+ auth.getAnfitriao() +
				"\nPorta: "+ auth.getPorta()
		);
		
		Authentication auth2 = Authentication.getInstance();
		
		System.out.println(
				"\nNome: "+ auth.getUsuario() +
				"\nSenha: "+ auth.getSenha() +
				"\nHost: "+ auth.getAnfitriao() +
				"\nPorta: "+ auth.getPorta()
		);
	}

}
