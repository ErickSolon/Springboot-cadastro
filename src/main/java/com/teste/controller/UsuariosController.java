package com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teste.Model.UsuariosModel;
import com.teste.repository.UsuariosRepository;

@RestController
public class UsuariosController {

	@Autowired
	UsuariosRepository usuariosRepository;

	@GetMapping(path = "/adm")
	public List<UsuariosModel> getAllUsuarios() {
		return usuariosRepository.findAll();
	}

	@PostMapping(path = "/", produces = "application/json")
	@ResponseBody
	public void insertUsuarios(UsuariosModel usuariosModel) {
		usuariosRepository.save(usuariosModel);
	}
	
}
