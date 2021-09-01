package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.Calendario;
import com.empresa.CadastroEmpresa.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;

    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll() {return calendarioRepository.findAll();}

    public Optional<Calendario> getById(Long id){
        return calendarioRepository.findById(id);
    }

    public Calendario updateCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void deleteCalendario(Long id){
        calendarioRepository.deleteById(id);
    }
}
