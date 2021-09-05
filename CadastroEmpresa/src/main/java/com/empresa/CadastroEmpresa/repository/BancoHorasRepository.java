package com.empresa.CadastroEmpresa.repository;

import com.empresa.CadastroEmpresa.model.BancoHoras;
import com.empresa.CadastroEmpresa.model.BancoHoras.BancoHorasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHorasId> {
}
