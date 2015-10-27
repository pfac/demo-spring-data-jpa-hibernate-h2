package com.iampfac.demo.core.user;

import org.apache.commons.lang3.StringUtils;

public class User {

	private int id;
	private String firstName;
	private String lastName;

	public User() {
	}

	public User(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getters

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	// setters

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// overrides

	public boolean equals(User user) {
		return getId() == user.getId() && StringUtils.equals(getFirstName(), user.getFirstName()) && StringUtils.equals(getLastName(), user.getLastName());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj instanceof User) {
			return equals((User) obj);
		}
		return false;
	}
}
