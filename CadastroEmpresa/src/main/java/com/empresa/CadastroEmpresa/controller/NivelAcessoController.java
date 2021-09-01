package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.NivelAcesso;
import com.empresa.CadastroEmpresa.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {

        @Autowired
        NivelAcessoService nivelAcessoService;

        @PostMapping
        public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
            return nivelAcessoService.saveNivelAcesso(nivelAcesso);
        }

        @PutMapping
        public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
            return nivelAcessoService.updateNivelAcesso(nivelAcesso);
        }

        @GetMapping
        public List<NivelAcesso> getNivelAcessoList(){
            return nivelAcessoService.findAll();
        }


        @GetMapping("/{idnivelacesso}")
        public ResponseEntity<NivelAcesso> getJornadaById(@PathVariable("idnivelacesso") Long idnivelacesso) throws Exception{
            return ResponseEntity.ok(nivelAcessoService.getById(idnivelacesso).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idnivelacesso}")
        public ResponseEntity<NivelAcesso> deleteById(@PathVariable("idnivelacesso") Long idnivelacesso) throws Exception{
            try {
                nivelAcessoService.deleteNivelAcesso(idnivelacesso);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
        }
}
