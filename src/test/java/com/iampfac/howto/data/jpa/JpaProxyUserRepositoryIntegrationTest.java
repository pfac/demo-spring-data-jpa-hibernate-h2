package com.iampfac.howto.data.jpa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iampfac.howto.config.ApplicationConfiguration;
import com.iampfac.howto.core.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class JpaProxyUserRepositoryIntegrationTest {

	@Autowired
	private JpaProxyUserRepository repository;

	@Test
	public void sampleTestCase() {
		User dave = new User("Dave", "Mathews");
		dave = repository.save(dave);

		User carter = new User("Carter", "Beauford");
		carter = repository.save(carter);

		List<User> users = repository.all();
		assertThat(users.size(), is(2));
		assertThat(users, hasItem(dave));
		assertThat(users, hasItem(carter));
	}

}
