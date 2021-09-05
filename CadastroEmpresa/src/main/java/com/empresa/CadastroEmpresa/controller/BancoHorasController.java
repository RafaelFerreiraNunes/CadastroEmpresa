package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.BancoHoras;
import com.empresa.CadastroEmpresa.model.BancoHoras.BancoHorasId;
import com.empresa.CadastroEmpresa.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

        @Autowired
        BancoHorasService bancoHorasService;

        @PostMapping
        public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
            return bancoHorasService.saveBancoHoras(bancoHoras);
        }

        @PutMapping
        public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
            return bancoHorasService.updateBancoHoras(bancoHoras);
        }

        @GetMapping
        public List<BancoHoras> getBancoHorasList(){
            return bancoHorasService.findAll();
        }


        @GetMapping("/{idbancohoras}")
        public ResponseEntity<BancoHoras> getBancoHorasById(@PathVariable("idbancohoras") BancoHorasId bancoHorasId) throws Exception{
            return ResponseEntity.ok(bancoHorasService.getById(bancoHorasId).orElseThrow(() -> new Exception("banco não encontrado.")));
        }

        @DeleteMapping("/{idbancohoras}")
        public ResponseEntity<BancoHoras> deleteById(@PathVariable("idbancohoras") BancoHorasId bancoHorasId) throws Exception{
            try {
                bancoHorasService.deleteBancoHoras(bancoHorasId);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
        }
}
