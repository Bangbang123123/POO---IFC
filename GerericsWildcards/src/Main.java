import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		List<Banana> list = new ArrayList<Banana>();
		Uva u = new Uva("Verde");
		
		list.add(u);
		
		Banana b1 = (Banana) list.get(0);
		System.out.print(b1.toString());
		
		Pair<Integer,String> p1 = new Pair<>(1,"Apple");
		Pair<Integer,String> p2 = new Pair<>(1,"Apple");
		
		boolean same = Util.<Integer,String>compare(p1, p2);
		
		System.out.print(same);
		
		
		Double[] lista = new Double[10];
		
		for (int i = 0; i < 10; i++) {
			lista[i] = Double.valueOf(i);
		}
		
		Double valor = 3d;
		
		System.out.println(Comp. <Double> maior(lista, valor));
		
		String[] array2 = {"a","ab","abc","abcd"};
		String valor2 = "abaaaaa";
		
		System.out.println(Comp. <String> maior(array2, valor2));
		*/
		
		Cat[] cats = new Cat[2];
		Animal[] animals = cats;
		animals[0] = new Dog();
		
		
	}

}
