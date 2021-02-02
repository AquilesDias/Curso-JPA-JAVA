package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//	@RequestMapping(method = RequestMethod.GET, path = "/olaMsg")
	@GetMapping(path= {"/ola", "/olaUrl"})
	public String ola() {
		return "Oláaa caraaai";
	}
}
