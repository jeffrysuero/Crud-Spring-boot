package com.webPrestamo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webPrestamo.Model.Cliente;
import com.webPrestamo.Repositorio.ClienteRepositorio;

@Service
public class ClienteServiceImp implements ClienteService {
 
	
	@Autowired
	ClienteRepositorio repositorio;

	@Override
	public Cliente findById(int id) {
		Optional<Cliente> opt=repositorio.findById(id);
		Cliente cliente=opt.get();
		return cliente;
	}

	@Override
	public Cliente findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAllCliente() {
		List<Cliente> cliente=repositorio.findAll();
		return cliente;
	}

	@Override
	public Cliente saveCliente(Cliente c) {
	   Cliente cliente=repositorio.save(c);
		return cliente;
	}

	@Override
	public Cliente editCliente(Cliente c) {
		  Cliente cliente=repositorio.save(c);
			return cliente;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}
	


	

}
