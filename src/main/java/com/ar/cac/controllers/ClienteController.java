package com.ar.cac.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ar.cac.models.User;
import com.ar.cac.services.UserService;

@Controller
@RequestMapping("/layout")
public class ClienteController {
	
	private UserService userService;
	
	@GetMapping("/")
	@ResponseStatus(code = HttpStatus.OK)
	public String listarClientes(Model model) {
		List<User> listadoClientes= (List<User>) userService.findAll();
		model.addAttribute("titulo", "Lista de Clientes");
		model.addAttribute("clientes", listadoClientes);
		return "/layout/clientes";
	}
	
	// Este metodo no esta bien porque el servicio retorna un valor nulo y nose porque , por lo tanto la vista 
	//bajo la URL localhost:8080/layout/clientes ,NO SE VE TIRA ERROR 500
}

