package com.viewControllerStory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viewControllerStory.model.storyModelInput;

@Controller
@RequestMapping({"/","/home"})

public class HomeController {
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("fullStory", new storyModelInput());
		return "index";
		}
	
	@GetMapping("/beginning")
	public String beginning() {
		return "beginning";
	}
	
	@GetMapping("/middle")
	public String middle() {
		return "middle";
	}
	
	@GetMapping("/end")
	public String end() {
		return "end";
		
	}
	
	
	
	@PostMapping("/fullStory")
    public String fullStory(@ModelAttribute storyModelInput fullStory) {
        return "fullStory";
    }

}
