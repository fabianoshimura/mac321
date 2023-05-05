package ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

import org.junit.*;
import static org.junit.Assert.*;

public class Testes {
	Ex3 object1 = new Ex3(1, 1.1);
	Ex3 object2 = new Ex3(2, 2.2);
	Ex3 object3 = new Ex3(3, 3.3);
	
	// testes do ArrayList
	@Test	// teste de adicao do ArrayList
	public void ArrayListAdd() {
		ArrayList<Ex3> arrayListNum = new ArrayList();
		
		arrayListNum.add(object1);
		arrayListNum.add(object2);
		arrayListNum.add(object3);
		
		assertEquals(arrayListNum.get(0), object1);
		assertEquals(arrayListNum.get(1), object2);
		assertEquals(arrayListNum.get(2), object3);
	}
	@Test	// teste de remocao do ArrayList
	public void ArrayListRem() {
		ArrayList<Ex3> arrayListNum = new ArrayList();
		
		arrayListNum.add(object1);
		arrayListNum.add(object2);
		arrayListNum.add(object3);
		
		arrayListNum.remove(1);
		
		assertEquals(arrayListNum.get(0), object1);
		assertEquals(arrayListNum.get(1), object3);
	}
	@Test(expected = IndexOutOfBoundsException.class)	// teste de remocao do ArrayList
	public void ArrayListRemExc() throws IndexOutOfBoundsException{
		ArrayList<Ex3> arrayListNum = new ArrayList();
		
		arrayListNum.add(object1);
		arrayListNum.add(object2);
		arrayListNum.add(object3);
		
		arrayListNum.remove(31);
	}
	
	// testes do Set
	@Test	//
	public void SetAdd() {
		Set<Ex3> setNum = new HashSet<Ex3>();
		
		setNum.add(object1);
		setNum.add(object2);
		setNum.add(object3);
		
		assertTrue(setNum.contains(object1));
		assertTrue(setNum.contains(object2));
		assertTrue(setNum.contains(object3));
	}
	@Test	// teste de remocao no Set
	public void SetRem() {
		Set<Ex3> setNum = new HashSet<Ex3>();
		
		setNum.add(object1);
		setNum.add(object2);
		setNum.add(object3);
		
		setNum.remove(object2);
		
		assertFalse(setNum.contains(object2));
	}
	@Test	// teste de adicao de elemento repetido no Set
	public void SetAddRep() {
		Set<Ex3> setNum = new HashSet<Ex3>();
		
		setNum.add(object1);
		//os dois próximos adds não acrescentam nada no Set
		setNum.add(object1);
		setNum.add(object1);
		
		setNum.remove(object1);
		
		//verificação que só há um object1 no Set
		assertFalse(setNum.contains(object1));
	}
	
	// testes do LinkedList
	@Test	// teste de adicao no LinkedList
	public void LinkedListAdd() {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		linkedListNum.add(object3);
		
		assertEquals(linkedListNum.get(0), object1);
		assertEquals(linkedListNum.get(1), object2);
		assertEquals(linkedListNum.get(2), object3);
	}
	@Test	// teste de remocao no LinkedList
	public void LinkedListRem() {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		linkedListNum.add(object3);
		
		linkedListNum.remove(1);
		
		assertFalse(linkedListNum.contains(object2));
	}
	@Test(expected = IndexOutOfBoundsException.class)	// teste de excessao no LinkedList
	public void LinkedListExc() throws IndexOutOfBoundsException {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		linkedListNum.add(object3);
	
		linkedListNum.remove(3);
	}
	
	// testes do Stack
	@Test	// teste de adicao e remocao no Stack
	public void StacktAdd() {
		Stack<Ex3> stackNum = new Stack();
		
		stackNum.add(object1);
		stackNum.add(object2);
		stackNum.add(object3);
		
		assertEquals(stackNum.get(0), object1);
		assertEquals(stackNum.get(1), object2);
		assertEquals(stackNum.get(2), object3);
		assertEquals(stackNum.remove(2), object3);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)	// teste de excecao no Stack
	public void StackRem() throws ArrayIndexOutOfBoundsException{
		Stack<Ex3> stackNum = new Stack();
		
		stackNum.add(object1);
		stackNum.add(object2);
		stackNum.add(object3);
		
		stackNum.remove(3);
	}
	
	@Test	// teste de junção de estruturas
	public void StackLinkedList() {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		Stack<LinkedList<Ex3>> stackNum = new Stack();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		stackNum.add(linkedListNum);
		
		assertEquals(stackNum.get(0).get(0), object1);
		assertEquals(stackNum.get(0).get(1), object2);
	}
	@Test
	public void StackLinkedListRem() {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		Stack<LinkedList<Ex3>> stackNum = new Stack();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		stackNum.add(linkedListNum);
		
		//o código abaixo remove o object1 da linkedlist dentro da stack
		stackNum.get(0).remove(object1);
		
		assertEquals(stackNum.get(0).get(0), object2);
	}
	@Test
	public void StackLinkedListRem2() {
		LinkedList<Ex3> linkedListNum = new LinkedList();
		Stack<LinkedList<Ex3>> stackNum = new Stack();
		
		linkedListNum.add(object1);
		linkedListNum.add(object2);
		stackNum.add(linkedListNum);
		
		//a linha de código abaixo não faz nada, pois object1 não se encontra no stack
		stackNum.remove(object1);
		
		assertEquals(stackNum.get(0).get(0), object1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
