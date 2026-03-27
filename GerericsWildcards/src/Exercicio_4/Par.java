package Exercicio_4;

public class Par<T> {
    private String chave;
    private T valor;

    public Par(String chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public String getChave() {
        return chave;
    }
    public T getValor() {
        return valor;
    }
}
