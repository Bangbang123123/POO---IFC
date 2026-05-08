package Statistics;

import junit.framework.TestCase;

public class StatTest extends TestCase{
	estatisticas stat = new estatisticas();
	
	public void test1() {
		double[] dados = {0.0,1.0,2.0,3.0};
		testMedia(1.5,dados);
		testMediana(1.5,dados);
		testModa(0.0,dados);
		testVariancia(1.25,dados);
		testDesvioPadrao(Math.sqrt(1.25),dados);
	}
	public void test2() {
		double[] dados = {5.0,10.0,10.0,35.0,42.6};
		testMedia(20.52,dados);
		testMediana(10.0,dados);
		testModa(10.0,dados);
		testVariancia(231.8816,dados);
		testDesvioPadrao(Math.sqrt(231.8816),dados);
	}
	
	public void testMedia(double result,double[] dados) {
		assertEquals(result,stat.media(dados));
	}
	public void testMediana(double result,double[] dados) {
		assertEquals(result,stat.mediana(dados));
	}
	public void testModa(double result,double[] dados) {
		assertEquals(result,stat.moda(dados));
	}
	public void testVariancia(double result,double[] dados) {
		assertEquals(result,stat.variancia(dados));
	}
	public void testDesvioPadrao(double result,double[] dados) {
		assertEquals(result,stat.desvio_padrao(dados));
	}
}
