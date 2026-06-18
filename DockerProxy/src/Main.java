
public class Main {

	public static void main(String[] args) {
		Proxy proxy = new Proxy("admin");
		System.out.println(proxy.request(1));
		System.out.println(proxy.request(2));
	}

}
