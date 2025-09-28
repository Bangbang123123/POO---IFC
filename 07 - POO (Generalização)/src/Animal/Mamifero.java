package Animal;
public class Mamifero extends Animal{
	private float temperaturaCorporal;
	private final float MAX = 40;
	private final float MIN = 30;
	
	
	public void regularTemperatura() {
		if (temperaturaCorporal >= MAX) {
			temperaturaCorporal = MAX;
		}
		if (temperaturaCorporal <= MIN) {
			temperaturaCorporal = MIN;
		}
		
	}
}
