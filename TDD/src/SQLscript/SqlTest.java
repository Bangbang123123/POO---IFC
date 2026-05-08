package SQLscript;

public class SqlTest {
	
	public boolean validate(String script) {
		switch (script) {
		case "'codigo' INT NOT NULL AUTO_INCREMENT":
			return true;
		case "'codigo' INT AUTO_INCREMENT":
			return true;
		case "'codigo' INT NOT NULL":
			return true;
		case "'codigo' INT":
			return true;
		default:
			return false;
		}
	}
}
