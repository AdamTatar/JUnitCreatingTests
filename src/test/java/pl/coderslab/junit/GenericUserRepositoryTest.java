package pl.coderslab.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GenericUserRepositoryTest {

	private static UserRepository uR;

	@BeforeClass
	public static void beforeClass() {
		uR = new GenericUserRepository();
		uR.createUser(new User("Romek"));
		uR.createUser(new User("Czesiek"));
	}

	@Test
	public void testGetUser() {
		// given
		User user = new User("Zdzichu");
		long id = uR.createUser(user);
		// when
		User userFromRepository = uR.getUser(id);
		// then
		System.out.println("User id: " + userFromRepository.getId() + " name: " + userFromRepository.getName());
		assertNotNull(userFromRepository);
	}

	@Test
	public void testDeleteUser() {

		User user = new User("Tadek");
		long id = uR.createUser(user);
		uR.deleteUser(id);
		User userFromRepository = uR.getUser(id);

		assertNull(userFromRepository);
	}

	@Ignore
	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateUser() {

		User user = new User(1000L, "Zdzichu");
		long id = uR.createUser(user);
	}

	@Test
	public void shouldGetUsersMap(){
		//given
		Map<Long,User> users = uR.getUsers();
		System.out.println(users.toString());
		assertNotNull(users);
		
		UsersMapAssertObject usersMapAssertObject = new UsersMapAssertObject(users);	// tu używam obiektu w którym są asserty
		usersMapAssertObject.isUserMapNotNull().shouldGetUserWithIdEquals1();
		
	}
}
