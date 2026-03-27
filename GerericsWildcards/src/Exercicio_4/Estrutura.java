package Exercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Estrutura<T> {
    private List<Par<T>> lista = new ArrayList<>();

    public boolean add(String chave, T valor) {

        for (Par<T> p : lista) {
            if (p.getChave().equals(chave)) {
                return false;
            }
        }

        lista.add(new Par<>(chave, valor));
        return true;
    }

    public Par<T> buscar(String chave) {
        for (Par<T> p : lista) {
            if (p.getChave().equals(chave)) {
                return p;
            }
        }
        return null;
    }
}