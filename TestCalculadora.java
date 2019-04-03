package calculadora;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {

	private Calculadora cal1= new Calculadora();

	@Before
	public void setUp(){
		cal1.setA(10);
		cal1.setB(5);
	}
	
	@Test
	public void testSumar() {
		System.out.println(cal1.sumar());
		assertEquals(15,cal1.sumar());
	}

	@Test
	public void testRestar() {
		System.out.println(cal1.restar());
		assertEquals(5,cal1.restar());
	}

	@Test
	public void testMultiplicar() {
		System.out.println(cal1.multiplicar());
		assertEquals(50,cal1.multiplicar());
	}

	@Test
	public void testDivir() {
		System.out.println(cal1.divir());
		assertEquals(2,cal1.divir());
	}

}
