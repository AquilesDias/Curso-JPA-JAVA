package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;


@RequestMapping(path="/clientes")
@RestController
public class ClienteController {

	@GetMapping(path="/dados")
	public Cliente obterCliente() {
		return new Cliente(2, "Aquiles", "541.215.454-00");
	}
}