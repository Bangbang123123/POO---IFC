import junit.framework.TestCase;

public class JUnitTest extends TestCase{
	Operacao op = new Operacao();
	
	public void testAll() {
		testAdicao1();
		testAdicao2();
		testAdicao3();
		testSubtracao1();
		testSubtracao2();
		testSubtracao3();
		testMultiplicacao1();
		testMultiplicacao2();
		testMultiplicacao3();
		testDivisao1();
		testDivisao2();
		testDivisao3();
	}
	
	public void testAdicao1() {
		assertEquals(4.0, op.adicao(2, 2));
	}
	public void testAdicao2() {
		assertEquals(2.0, op.adicao(1, 1));
	}
	public void testAdicao3() {
		assertEquals(6.0, op.adicao(2, 4));
	}

	
	public void testSubtracao1() {
		assertEquals(1.0, op.subtracao(2, 1));
	}
	public void testSubtracao2() {
		assertEquals(1.0, op.subtracao(3, 1));
	}
	public void testSubtracao3() {
		assertEquals(-2.0, op.subtracao(2, 4));
	}

	
	public void testMultiplicacao1() {
		assertEquals(2.0, op.multiplicacao(2, 1));
	}
	public void testMultiplicacao2() {
		assertEquals(6.0, op.multiplicacao(3, 2));
	}
	public void testMultiplicacao3() {
		assertEquals(-8.0, op.multiplicacao(2, -4));
	}

	
	public void testDivisao1() {
		assertEquals(2.0, op.divisao(4, 1));
	}
	public void testDivisao2() {
		assertEquals(3.0, op.divisao(6, 2));
	}
	public void testDivisao3() {
		assertEquals(5.0, op.divisao(12, 6));
	}
}
