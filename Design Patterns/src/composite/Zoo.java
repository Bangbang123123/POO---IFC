package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Animal{
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public boolean removeAnimal(Animal animal) {
		if (!animais.contains(animal)) {
			return false;
		}
		animais.remove(animal);
		return true;
	}
	
	public boolean addAnimal(Animal animal) {
		if (!animais.contains(animal)) {
			return false;
		}
		animais.add(animal);
		return true;
	}

	@Override
	public void nome() {
		animais.forEach(Animal::nome);
	}

	@Override
	public void descricao() {
		animais.forEach(Animal::descricao);
	}
	
	public void execucao() {
		nome();
		descricao();
	}
	
	public boolean isEmpty() {
		return animais.isEmpty();
	}
	
	public Iterator<Animal> iterator() {
		return animais.iterator();
	}

}
