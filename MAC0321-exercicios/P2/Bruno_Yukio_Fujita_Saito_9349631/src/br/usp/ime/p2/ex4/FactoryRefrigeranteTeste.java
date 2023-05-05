package br.usp.ime.p2.ex4;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactoryRefrigeranteTeste {
	FactoryRefrigerante obj = new FactoryRefrigerante();
	
	
	@Test
	public void criouPepsiZero() {
		assertEquals(new PepsiZero().getClass(), obj.getRefrigerante("Pepsi", true).getClass());
	}
	
	@Test
	public void criouPepsiNormal() {
		assertEquals(new Pepsi().getClass(), obj.getRefrigerante("Pepsi", false).getClass());
	}
	
	@Test
	public void criouCocaColaZero() {
		assertEquals(new CocaColaZero().getClass(), obj.getRefrigerante("CocaCola", true).getClass());
	}
	
	@Test
	public void criouCocaColaNormal() {
		assertEquals(new CocaCola().getClass(), obj.getRefrigerante("CocaCola", false).getClass());
	}
}
