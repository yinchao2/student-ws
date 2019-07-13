package com.javaguest.studentws.domain;

public class StudentDO {

	private Integer id;
	private String firstName;
	private String lastName;

	public StudentDO() {

	}

	public StudentDO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentDO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
