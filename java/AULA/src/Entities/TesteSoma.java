package Entities;

import junit.framework.TestCase;

public class TesteSoma extends TestCase {
	 void checaSoma() {
		Soma exemplo1 = new Soma();
		int soma = exemplo1.somar(-1,1);
		assertEquals(0, soma);	
	}
}
