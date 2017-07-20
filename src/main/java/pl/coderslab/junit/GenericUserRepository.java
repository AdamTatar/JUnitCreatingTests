package pl.coderslab.junit;

import java.util.HashMap;
import java.util.Map;

public class GenericUserRepository implements UserRepository {

	private Map<Long, User> users;

	private long autoIn = 0L;

	GenericUserRepository() {
		users = new HashMap<>();
	}

	@Override
	public User getUser(final long id) {

		User user = users.get(id);

		return user;
	}

	@Override
	public void deleteUser(long id) {

		users.remove(id);
	}

	@Override
	public void updateUser(long id, User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public long createUser(User user) {
		long id = getNextId();
		user.setId(id);
		users.put(id, user);
		return id;
	}

	private long getNextId() {
		return autoIn++;
	}

	@Override
	public Map<Long, User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}
}
