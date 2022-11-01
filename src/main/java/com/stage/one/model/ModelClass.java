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

	private String slackUsername = "\"Thiza\"";
	private boolean backend = true;
	private int age = 26;
	private String bio = "\"A tech-head that speaks fluent java,"
			+ "Im an easy-going guy with very strong work ethics.\"";
	
	
	
	public String showData() {
		return "\"slackUsername\":"+slackUsername+", \"backend\":"+backend+",\"age\":"+age
				+", \"bio\":"+bio;
	}
	
	
}
