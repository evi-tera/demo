package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserInfo {
	@Id
	private String id;
	private String name;
	private String age;
	private String gender;
	public UserInfo() {
	}
	public UserInfo(String id, String name, String age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
