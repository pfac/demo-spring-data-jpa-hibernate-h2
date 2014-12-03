package com.iampfac.howto.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

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
}
