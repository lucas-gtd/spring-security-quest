package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
	
	@GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }
	
	@GetMapping("/avengers/assemble")
	public String avengersAssemble() {
	    return "Avengers... Assemble";
	}
	
	@GetMapping("/secret-bases")
	public List<String> directeur() {
		List<String> list = new ArrayList<String>();
		list.add("Biarritz");
		list.add("Bordeaux");
		list.add("La Loupe");
		list.add("Lille");
		list.add("Lyon");
		list.add("Marseille");
		list.add("Nantes");
		list.add("Orléans");
		list.add("Paris");
		list.add("Reims");
		list.add("Saintes");
		list.add("Strasbourg");
		list.add("Toulouse");
		list.add("Tours");
		list.add("Europe");
		list.add("Amsterdam");
		list.add("Barcelone");
		list.add("Berlin");
		list.add("Bruxelles");
		list.add("Bucarest");
		list.add("Lisbonne");
		list.add("Londres");
		list.add("Madrid");
		return list;
	}
	
}
