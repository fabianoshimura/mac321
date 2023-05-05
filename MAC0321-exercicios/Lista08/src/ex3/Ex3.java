package ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Stack;

public class Ex3 {
	private int num1;
	private double num2;
	
	public Ex3(int num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void imprimirArray(ArrayList<Ex3> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Indice " + i + " -> atributos num1 = " + array.get(i).num1 + " e num2 = " + array.get(i).num2);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Ex3 object1 = new Ex3(1, 1.1);
		Ex3 object2 = new Ex3(2, 2.2);
		Ex3 object3 = new Ex3(3, 3.3);
		
		LinkedList<Ex3> linkedListNum = new LinkedList();
		Stack<LinkedList<Ex3>> stackNum = new Stack();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		stackNum.add(linkedListNum);
		
		stackNum.remove(object2);
		
		
	}
}
