package com.esib.esib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esib.esib.modelo.Departamento;

public interface DepartamentoRepository extends JpaRepository <Departamento, Long> {
    
}