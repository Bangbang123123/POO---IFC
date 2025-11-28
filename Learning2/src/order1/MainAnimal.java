package order1;

public class MainAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		Pato pato = new Pato();
		
		Animal[] animais = {animal,gato,cachorro,pato};
		
		for (Animal a : animais) {
			System.out.print(a.falar() +"\n");
		}
	}
}
