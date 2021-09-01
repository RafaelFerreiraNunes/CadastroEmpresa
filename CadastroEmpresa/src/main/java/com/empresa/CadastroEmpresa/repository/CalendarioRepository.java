package com.empresa.CadastroEmpresa.repository;

import com.empresa.CadastroEmpresa.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
