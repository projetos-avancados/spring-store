package com.vinigui.loja.repository;

import com.vinigui.loja.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}