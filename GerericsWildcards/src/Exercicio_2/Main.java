package Exercicio_2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

        Produto<Integer> p1 = new Produto<>(1, 5, new Date(), new Date());
        System.out.println("Id integer: " + p1.getId());

        Produto<String> p2 = new Produto<>("00000-aa", 10, new Date(), new Date());
        System.out.println("Id string: " + p2.getId());
    }
}
