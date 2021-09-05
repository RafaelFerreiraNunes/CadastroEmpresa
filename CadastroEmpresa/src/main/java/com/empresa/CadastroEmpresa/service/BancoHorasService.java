package com.empresa.CadastroEmpresa.service;

import com.empresa.CadastroEmpresa.model.BancoHoras;
import com.empresa.CadastroEmpresa.model.BancoHoras.BancoHorasId;
import com.empresa.CadastroEmpresa.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoHoras saveBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {return bancoHorasRepository.findAll();}

    public Optional<BancoHoras> getById(BancoHorasId bancoHorasId){
        return bancoHorasRepository.findById(bancoHorasId);
    }

    public BancoHoras updateBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void deleteBancoHoras(BancoHorasId bancoHorasId){
        bancoHorasRepository.deleteById(bancoHorasId);
    }
}
