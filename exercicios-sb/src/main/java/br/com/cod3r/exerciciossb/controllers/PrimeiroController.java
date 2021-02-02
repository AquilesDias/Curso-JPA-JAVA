package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//	@RequestMapping(method = RequestMethod.GET, path = "/olaMsg")
	@GetMapping(path= {"/ola"})
	public String ola() {
		return "Oláaa caraaai";
	}
	
	@PostMapping(path= {"/olaUrl"})
	public String saudacao() {
		return "Oláaa caraaai(POST)";
	}
}
