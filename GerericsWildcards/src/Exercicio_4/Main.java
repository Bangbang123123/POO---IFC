package Exercicio_4;

public class Main {

	public static void main(String[] args) {
		
		Estrutura<Integer> estrutura = new Estrutura<>();

        System.out.println(estrutura.add("a", 10)); // true
        System.out.println(estrutura.add("a", 20)); // false (duplicado)

        Par<Integer> resultado = estrutura.buscar("a");

        if (resultado != null) {
            System.out.println("chave: " + resultado.getChave());
            System.out.println("valor: " + resultado.getValor());
        } else {
            System.out.println("não foi encontrado");
        }
	}

}
