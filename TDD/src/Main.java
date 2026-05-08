
import Statistics.StatTest;

public class Main {

	public static void main(String[] args) {
		IFC ifc = new IFC();
		
		ifc.setCurso("Ciência da Computação");
		
		StatTest stat_test = new StatTest();
		stat_test.test1();
	}
}
