package Exercicio_1;

public class Data<T> {
    private T generic_data;

    public Data(T generic_data) {
        this.generic_data = generic_data;
    }

    public T getDado() {
        return generic_data;
    }
}
