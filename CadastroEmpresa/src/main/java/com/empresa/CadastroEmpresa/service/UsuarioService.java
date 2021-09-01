package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Usuario;
import com.empresa.CadastroEmpresa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {return usuarioRepository.findAll();}

    public Optional<Usuario> getById(Long id){
        return usuarioRepository.findById(id);
    }

    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
