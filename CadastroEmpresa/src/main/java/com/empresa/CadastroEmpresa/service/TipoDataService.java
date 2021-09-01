package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.TipoData;
import com.empresa.CadastroEmpresa.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll() {return tipoDataRepository.findAll();}

    public Optional<TipoData> getById(Long id){
        return tipoDataRepository.findById(id);
    }

    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void deleteTipoData(Long id){
        tipoDataRepository.deleteById(id);
    }
}
