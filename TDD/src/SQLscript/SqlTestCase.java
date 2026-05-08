package SQLscript;

import junit.framework.TestCase;

public class SqlTestCase extends TestCase{
	SqlTest sql_test = new SqlTest();
	
	public void testAll() {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}
	
	public void test1() {
		assertEquals(true,sql_test.validate("'codigo' INT NOT NULL AUTO_INCREMENT"));
	}
	public void test2() {
		assertEquals(true,sql_test.validate("'codigo' INT NOT NULL"));
	}
	public void test3() {
		assertEquals(true,sql_test.validate("'codigo' INT AUTO_INCREMENT"));
	}
	public void test4() {
		assertEquals(true,sql_test.validate("'codigo' INT"));
	}
	public void test5() {
		assertEquals(true,sql_test.validate("'codigo INT NOT NULL AUTO_INCREMENT"));
	}
	public void test6() {
		assertEquals(true,sql_test.validate("codigo INT NOT NULL"));
	}
}
