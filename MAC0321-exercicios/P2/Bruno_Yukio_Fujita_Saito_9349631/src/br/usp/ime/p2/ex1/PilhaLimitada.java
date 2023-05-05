package br.usp.ime.p2.ex1;

import java.util.*;

public class PilhaLimitada extends Stack<Number> {
	private double inferior, superior;
	private Stack<Number> stack = new Stack<Number>();
	
	public PilhaLimitada (double inferior, double superior) {
		this.inferior = inferior;
		this.superior = superior;
	}
	
	public Number push(Number i) {
		stack.addElement(i); 
		
		if (total() < inferior || total() > superior) {
			stack.pop();
			
			return null;
		}
		
		return i;
	}
	
	public Number pop() {
		if (!stack.isEmpty())
			return stack.pop();
		else
			return null;
	}
	
	public double total() {
		Iterator<Number> iterator = stack.iterator();
		double somatorio;
		
		try {
			somatorio = iterator.next().doubleValue();
		}
		catch (NoSuchElementException e) {
			return 0;
		}
		
		while (iterator.hasNext()) {
			somatorio += iterator.next().longValue();
		}
		
		return somatorio;
	}
	
	/*
	public static void main(String[] args) {
		PilhaLimitada obj = new PilhaLimitada(-100, 100);
		
		obj.push(new Integer(101));
		obj.push(new Integer(11));
		System.out.println(obj.total());
		obj.pop();
		System.out.println(obj.total());
	}
	*/
	
}
