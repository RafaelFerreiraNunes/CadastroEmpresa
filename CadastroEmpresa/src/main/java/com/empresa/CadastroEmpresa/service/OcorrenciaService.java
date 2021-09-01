package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Ocorrencia;
import com.empresa.CadastroEmpresa.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll() {return ocorrenciaRepository.findAll();}

    public Optional<Ocorrencia> getById(Long id){
        return ocorrenciaRepository.findById(id);
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void deleteOcorrencia(Long id){
        ocorrenciaRepository.deleteById(id);
    }
}
