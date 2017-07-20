package pl.coderslab.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BookTest {

	@Test
	public void test() {

		//Given
		Book book = new Book(1000L, "Tytutl 1000L");
		
		//when
		
		//then
		assertNotNull(book);
//		assertNull("Jednak nie jest nullem", book);
	}

	
	public void newTest(){
		Book book = new Book(1, "aaa");
		
		
		
		
	}

}
