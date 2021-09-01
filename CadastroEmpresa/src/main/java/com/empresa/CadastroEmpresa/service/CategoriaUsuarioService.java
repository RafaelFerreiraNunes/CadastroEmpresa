package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.CategoriaUsuario;
import com.empresa.CadastroEmpresa.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {return categoriaUsuarioRepository.findAll();}

    public Optional<CategoriaUsuario> getById(Long id){
        return categoriaUsuarioRepository.findById(id);
    }

    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void deleteCategoriaUsuario(Long id){
        categoriaUsuarioRepository.deleteById(id);
    }
}
