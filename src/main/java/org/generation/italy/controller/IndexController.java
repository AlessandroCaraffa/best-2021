package org.generation.italy.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	
	public String index(Model model) {
		
		String name = "Alessandro";
		model.addAttribute("namee", name);
		return "index";
	}
	
	
	@GetMapping("/movies")
	public String movies(Model model) {

		model.addAttribute("movies", Arrays.asList("Don't look up", "Free guy", "Army of the dead"));
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs (Model model) {
		
		model.addAttribute("songs", Arrays.asList("La mente vola- Alphataurus", "Straight Outta Compton- N.W.A.", "Yr body is nothing - Boy Harsher"));
		return "songs";
	}


}


