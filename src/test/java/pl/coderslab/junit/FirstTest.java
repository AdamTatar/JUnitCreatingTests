package pl.coderslab.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest {

	private final String CONCATENATED_STRING = "abcxyz";
	private final String STRING_A = "abc";
	private final String STRING_B = "xyz";

	private static First FIRST_OBJECT; // tworzę statyczną referencję do obiektu

	@BeforeClass
	public static void beforeClass() {
		FIRST_OBJECT = new First();
	}

	@Test
	public void testConcatString() {

		First first = new First();
		assertEquals(CONCATENATED_STRING, FIRST_OBJECT.concatString(STRING_A, STRING_B));
	}

	// @Ignore
	@Test(timeout = 2001)
	public void testMultiply() throws InterruptedException {

		FIRST_OBJECT.multiply(10, 23);

	}

	public void sholudGetCorrectValue() throws DivideException {
		assertEquals(2, FIRST_OBJECT.divide(10.5, 0.1));

	}

	@Test(expected = DivideException.class)
	public void sholudGetException() throws DivideException {
		FIRST_OBJECT.divide(10.5, 0.0);

	}

	@Test
	public void simpleTestAssertThat() {
		Integer factorial = 6;
		assertThat(factorial, is(6));
		assertThat(factorial, is(not(12)));
	}

}
