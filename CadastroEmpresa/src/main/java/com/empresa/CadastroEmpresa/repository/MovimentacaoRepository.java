package com.empresa.CadastroEmpresa.repository;

import com.empresa.CadastroEmpresa.model.Movimentacao;
import com.empresa.CadastroEmpresa.model.Movimentacao.MovimentacaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, MovimentacaoId> {
}
