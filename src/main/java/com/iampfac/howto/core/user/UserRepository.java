package com.iampfac.howto.core.user;

import java.util.List;

public interface UserRepository {

	public User save(User user);

	public List<User> all();
}
