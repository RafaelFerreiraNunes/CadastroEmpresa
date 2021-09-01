package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.NivelAcesso;
import com.empresa.CadastroEmpresa.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {return nivelAcessoRepository.findAll();}

    public Optional<NivelAcesso> getById(Long id){
        return nivelAcessoRepository.findById(id);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteNivelAcesso(Long id){
        nivelAcessoRepository.deleteById(id);
    }
}
