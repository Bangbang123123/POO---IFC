import java.util.Scanner;

public class outro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Informe um valor par: ");
			num = input.nextInt();
			if (num % 2 != 0) {
				System.out.println("O valor não é par, tente de novo");
			}
		} while(num % 2 != 0);
		System.out.print("Número par colocado: "+ num);
		
		input.close();

	}

}
