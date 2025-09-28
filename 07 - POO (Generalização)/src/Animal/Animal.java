package Animal;

public class Animal {
	private double x;
	private double y;

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

	public void mover(int x,int y) {
		setX(x);
		setY(y);
	}
}
