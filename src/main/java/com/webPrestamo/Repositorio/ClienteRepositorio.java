package com.webPrestamo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webPrestamo.Model.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
