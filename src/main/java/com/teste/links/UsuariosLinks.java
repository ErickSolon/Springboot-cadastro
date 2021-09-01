package com.teste.links;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosLinks {

	@GetMapping(path = "/")
	public String getMethodIndex() {
		return "index";
	}
}
