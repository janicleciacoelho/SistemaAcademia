package com.sistema.academia.internal.repository;

import com.sistema.academia.internal.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
