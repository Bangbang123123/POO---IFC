import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a base, o número de início e fim de uma tabuada: ");
		int base = input.nextInt();
		int begin = input.nextInt();
		int end = input.nextInt();
		
		if (begin >= end) {
			System.out.println("Valores de início e fim invertidos");
			int buffer = end;
			end = begin;
			begin = buffer;
		}
		
		for (int i = begin; i <= end; i++) {
			System.out.println(base +" * "+ i +" = "+ (base*i));
		}
		
		input.close();
	}

}
