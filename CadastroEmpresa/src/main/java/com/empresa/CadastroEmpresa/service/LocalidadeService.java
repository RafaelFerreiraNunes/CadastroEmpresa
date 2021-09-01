package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Localidade;
import com.empresa.CadastroEmpresa.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade saveLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll() {return localidadeRepository.findAll();}

    public Optional<Localidade> getById(Long id){
        return localidadeRepository.findById(id);
    }

    public Localidade updateLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void deleteLocalidade(Long id){
        localidadeRepository.deleteById(id);
    }
}
