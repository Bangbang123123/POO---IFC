package exceptions;

public class Teste1 {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			System.out.println("Ayo");
			try {
				float n = 1/0;
			} catch (ArithmeticException e){
				e.printStackTrace();
				System.out.println("// oops");
			}
		}
	}

}
