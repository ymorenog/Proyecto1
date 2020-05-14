import static org.junit.Assert.*;

import org.junit.Test;
/**
 * clase de pruebas de la clase 1
 * @author ymoga
 *
 */
public class clase1Test {
	/**
	 * primer test dela clase 1
	 */
	@Test
	public void test() {
		int[] num = { 3, 8, 23, 50, 90};
		int a = clase1.Contar(num);
		assertEquals(2,a);
	}

}
