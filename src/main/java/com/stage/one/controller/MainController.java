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
		
		model.addAttribute("view",modelClass);
		
		return modelClass.showData();
	}

}
