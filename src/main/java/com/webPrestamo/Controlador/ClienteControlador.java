package com.webPrestamo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webPrestamo.Model.Cliente;
import com.webPrestamo.Service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

	@Autowired
	ClienteService servicio;
	
	@GetMapping("/getAllCliente")
	public List<Cliente>getAllCliente(){
		return servicio.findAllCliente();
	}
	
	@PostMapping("/saveCliente")
	public Cliente SaveCliente(@RequestBody Cliente c) {
		return servicio.saveCliente(c);
	}
	
	@PutMapping("/updateCliente")
	public Cliente updateCliente(@RequestBody Cliente c) {
		return servicio.saveCliente(c);
	}
	
	@GetMapping("/searchById/{id}")
	public Cliente GetClienteId(@PathVariable int id) {
		return servicio.findById(id);
	}
}
