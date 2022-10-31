/**
 * 
 */
package com.stage.one.model;

import org.springframework.stereotype.Repository;

/**
 * @author thabo
 *
 */
@Repository
public class ModelClass {

	private String slackUsername;// = "Thabo";
	private boolean backend;// = true;
	private int age;// = 26;
	private String bio;// = "A tech-head that speaks fluent java,"
			//+ "Im an easy-going guy with very strong work ethics.";
	
	
	public String getSlackUsername() {
		return slackUsername;
	}


	public void setSlackUsername(String slackUsername) {
		this.slackUsername = slackUsername;
	}


	public boolean isBackend() {
		return backend;
	}


	public void setBackend(boolean backend) {
		this.backend = backend;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}

	
	/*

	@Override
	public String toString() {
		return "{" +"slackUsername=" + slackUsername + ", backend=" + backend + ", age=" + age + ", bio=" + bio
				+ "}";
	}
	*/
	
	
}
