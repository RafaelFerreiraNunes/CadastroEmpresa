package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.JornadaTrabalho;
import com.empresa.CadastroEmpresa.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService{

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
       return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idjornada) {
        return jornadaTrabalhoRepository.findById(idjornada);
    }
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }
    public void deleteJornada(Long idjornada) {
        jornadaTrabalhoRepository.deleteById(idjornada);
    }

}
