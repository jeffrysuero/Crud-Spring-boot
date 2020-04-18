package com.webPrestamo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webPrestamo.Model.Usuario;
import com.webPrestamo.Repositorio.UsuarioRepositorio;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	UsuarioRepositorio repositorio;
	
	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllUsuario() {
		List<Usuario> usuario=repositorio.findAll();
		return usuario;
	}

	@Override
	public Usuario saveUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
