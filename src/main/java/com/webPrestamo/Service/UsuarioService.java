package com.webPrestamo.Service;

import java.util.List;

import com.webPrestamo.Model.Usuario;

public interface UsuarioService {

	Usuario findById(int id);
	Usuario findByNombre(String nombre);
	List<Usuario>findAllUsuario();
	Usuario saveUsuario(Usuario u);
	void Delete(int id);
	
}
