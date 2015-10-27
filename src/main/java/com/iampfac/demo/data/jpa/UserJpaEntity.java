package com.iampfac.demo.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.iampfac.demo.core.user.User;

@Entity
public class UserJpaEntity {

	@Id
	@GeneratedValue
	private int		id;
	private String	firstname;
	private String	lastname;

	public UserJpaEntity() {
	}

	public UserJpaEntity(final String firstname, final String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public UserJpaEntity(final User user) {
		this.id = user.getId();
		this.firstname = user.getFirstName();
		this.lastname = user.getLastName();
	}

	// getters

	public String getFirstname() {
		return firstname;
	}

	public int getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	// setters

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	// overrides

	public boolean equals(UserJpaEntity user) {
		return getId() == user.getId()
				&& StringUtils.equals(getFirstname(), user.getFirstname())
				&& StringUtils.equals(getLastname(), user.getLastname());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj instanceof UserJpaEntity) {
			return equals((UserJpaEntity) obj);
		}
		return false;
	}
	
	// type conversion
	
	public User toUser() {
		User user = new User();
		user.setId(id);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		return user;
	}
}
