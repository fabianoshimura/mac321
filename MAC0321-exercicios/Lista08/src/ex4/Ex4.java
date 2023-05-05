package ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedList;
import java.util.Stack;

public class Ex4 {
	private int num1;
	private double num2;
	
	public Ex4(int num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// mÃ©todos para testar o ArrayList
	public static void imprimirArray(ArrayList<Ex4> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Indice " + i + " -> atributos num1 = " + array.get(i).num1 + " e num2 = " + array.get(i).num2);
		}
		System.out.println();
	}
	
	// mÃ©todos para testar o ArrayList
	public static void imprimirSet(Set<Ex4> array) {
		System.out.println(array.toString());
	}
	
	
	public static void main(String args[]) {
		Ex4 object1 = new Ex4(1, 1.1);
		Ex4 object2 = new Ex4(2, 2.2);
		Ex4 object3 = new Ex4(3, 3.3);
		Ex4 e;
		
		ArrayList<Ex4> arrayListNum = new ArrayList();
		Set<Ex4> setNum = new HashSet<Ex4>();
		
		// funcionamento do ArrayList
		arrayListNum.add(object1);
		arrayListNum.add(object2);
		arrayListNum.add(object3);
		
		Iterator<Ex4> arrayIterator = arrayListNum.iterator();
		
		if(arrayIterator.hasNext()){
			arrayIterator.next();
			arrayIterator.remove();
		}
		imprimirArray(arrayListNum);
		
		/*
		 * 
		 */
		
		// funcionamento do Set
		setNum.add(object1);
		setNum.add(object1);
		setNum.add(object1);
		
		Iterator<Ex4> setIterator = setNum.iterator();
		
		if(setIterator.hasNext()){
			setIterator.next();
			setIterator.remove();
		}
		imprimirSet(setNum);
		
		/*
		 * 
		 */
	}
}

