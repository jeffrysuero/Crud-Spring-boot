package com.webPrestamo.Service;

import java.util.List;


import com.webPrestamo.Model.Cliente;

public interface ClienteService {

	Cliente findById(int id);
	Cliente findByNombre(String nombre);
	List<Cliente>findAllCliente();
	Cliente saveCliente(Cliente c);
	Cliente editCliente(Cliente c);
	void Delete(int id);
	
}
