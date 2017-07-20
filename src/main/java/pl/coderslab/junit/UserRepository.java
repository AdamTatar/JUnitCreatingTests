package pl.coderslab.junit;

import java.util.Map;

public interface UserRepository {

	public User getUser(long id);

	void deleteUser(long id);

	void updateUser(final long id, final User user);

	public long createUser(final User user);

	public Map<Long, User> getUsers();
	
}

