import static org.junit.Assert.*;
import org.junit.Test;

public class TesteFibonacci {
	
	/* Para esse exercício, caso seja passado um número negativo o
	 * método de vocês tem que retornar -1, para indicar um erro.
	 */
	@Test
	public void numeroNegativo() {
		assertEquals(-1, Fibonacci.fibonacci(-1));
		assertEquals(-1, Fibonacci.fibonacci(-2));
		assertEquals(-1, Fibonacci.fibonacci(-3));
		assertEquals(-1, Fibonacci.fibonacci(-5));
		assertEquals(-1, Fibonacci.fibonacci(-10));
	}
	
	/* Alguns números para testar */
	@Test
	public void fibonacci() {
		assertEquals(1, Fibonacci.fibonacci(1));
		assertEquals(3, Fibonacci.fibonacci(4));
		assertEquals(21, Fibonacci.fibonacci(8));
		assertEquals(144, Fibonacci.fibonacci(12));
		assertEquals(987, Fibonacci.fibonacci(16));
		assertEquals(6765, Fibonacci.fibonacci(20));
		assertEquals(46368, Fibonacci.fibonacci(24));
		assertEquals(832040, Fibonacci.fibonacci(30));
	}
}