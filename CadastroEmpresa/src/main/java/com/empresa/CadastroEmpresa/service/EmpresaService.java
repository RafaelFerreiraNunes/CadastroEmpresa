package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Empresa;
import com.empresa.CadastroEmpresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {return empresaRepository.findAll();}

    public Optional<Empresa> getById(Long id){
        return empresaRepository.findById(id);
    }

    public Empresa updateEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Long id){
        empresaRepository.deleteById(id);
    }
}
