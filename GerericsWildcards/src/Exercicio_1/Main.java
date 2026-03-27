package Exercicio_1;

public class Main {

	public static void main(String[] args) {
        Data<Double> d1 = new Data<Double>(0.25);
        Data<String> d2 = new Data<String>("abab");
        Data<Item> d3 = new Data<Item>(new Item("sword","does damage"));
        
        System.out.print(d1.getDado() +"\n"+ d2.getDado() +"\n"+ d3.getDado().getName());

	}

}
