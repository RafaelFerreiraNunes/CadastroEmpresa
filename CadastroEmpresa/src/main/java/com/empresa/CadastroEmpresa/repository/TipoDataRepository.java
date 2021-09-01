package com.empresa.CadastroEmpresa.repository;

import com.empresa.CadastroEmpresa.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
