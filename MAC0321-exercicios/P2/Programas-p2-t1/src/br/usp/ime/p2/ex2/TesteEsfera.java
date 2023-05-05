package br.usp.ime.p2.ex2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEsfera {
	final double precisao = 0.01;
	
	@Test
	public void area() {
		Esfera esfera = new Esfera(4.5);
		assertEquals(254.47, esfera.area(), precisao);
		
		esfera = new Esfera(3.0);
		assertEquals(113.10, esfera.area(), precisao);
	}
	
	@Test
	public void volume() {
		Esfera esfera = new Esfera(4.5);
		assertEquals(381.70, esfera.volume(), precisao);
		
		esfera = new Esfera(3.0);
		assertEquals(113.10, esfera.volume(), precisao);
	}
}
