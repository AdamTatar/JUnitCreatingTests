package pl.coderslab.junit;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

public class UsersMapAssertObject {

	private Map<Long, User> users;

	public UsersMapAssertObject(final Map<Long, User> users) {
		this.users = users;
	}

	public UsersMapAssertObject isUserMapNotNull() {
		assertNotNull(users);
		return this;
	}

	public UsersMapAssertObject shouldGetUserWithIdEquals1() {

		assertNotNull(users.get(1L).getName());
		return this;
	}

}
// tu generalnie chcemy zebrać asserty w jeden obiekt i go uzywać do testów