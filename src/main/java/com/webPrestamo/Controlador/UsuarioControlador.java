package com.webPrestamo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webPrestamo.Model.Usuario;
import com.webPrestamo.Service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

	@Autowired
	UsuarioService servicio;
	
	@GetMapping("/getAllusuario")
	public List<Usuario>getAllCliente(){
		return servicio.findAllUsuario();
	}
}
