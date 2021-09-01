package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Movimentacao;
import com.empresa.CadastroEmpresa.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao saveMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAll() {return movimentacaoRepository.findAll();}

    public Optional<Movimentacao> getById(Long id){
        return movimentacaoRepository.findById(id);
    }

    public Movimentacao updateMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public void deleteMovimentacao(Long id){
        movimentacaoRepository.deleteById(id);
    }
}