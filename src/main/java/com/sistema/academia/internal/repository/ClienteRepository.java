package com.sistema.academia.internal.repository;

import com.sistema.academia.internal.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
