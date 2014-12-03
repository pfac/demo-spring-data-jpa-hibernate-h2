package com.iampfac.howto.data.jpa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iampfac.howto.config.ApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class UserRepositoryIntegrationTest {

	@Autowired
	private UserRepository	repository;

	@Test
	public void sampleTestCase() {
		User dave = new User("Dave", "Mathews");
		dave = repository.save(dave);

		User carter = new User("Carter", "Beauford");
		carter = repository.save(carter);

		List<User> users = repository.findAll();
		assertThat(users.size(), is(2));
		assertThat(users, hasItem(dave));
		assertThat(users, hasItem(carter));
	}

}
