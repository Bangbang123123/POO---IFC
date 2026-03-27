package Exercicio_3;

public class Main {
    public static void main(String[] args) {

        Pedido<Alimento> pedido = new Pedido<>();

        pedido.adicionar(new Alimento("feijão", 10));
        pedido.adicionar(new Alimento("farinha", 8));

        pedido.mostrarProdutos();
    }
}
