package com.geberson.cursomc.repositories;

import com.geberson.cursomc.domain.Categoria;
import com.geberson.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
