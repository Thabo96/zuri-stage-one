/**
 * 
 */
package com.stage.one.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.one.model.ModelClass;

/**
 * @author thabo
 *
 */
@RestController
public class MainController {
	
	private ModelClass modelClass = new ModelClass();
	
	
		
	/**
	 * @param modelClass
	 */
	public MainController(ModelClass modelClass) {
		
		this.modelClass = modelClass;
	}




	@GetMapping
	@ResponseBody
	public  String showModel(Model model) {
		
		modelClass.setAge(26);
		modelClass.setSlackUsername("Thiza");
		modelClass.setBackend(true);
		modelClass.setBio("\"A tech-head that speaks fluent java,\"\n"
				+ "			+ \"Im an easy-going guy with very strong work ethics.\"");
		
		model.addAttribute("view",modelClass);
		
		return "slackUsername:"+modelClass.getSlackUsername()+","+"backend:"+modelClass.isBackend()+
				","+ "age:"+modelClass.getAge()+","+"bio:"+modelClass.getBio();
	}

}
