package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Ocorrencia;
import com.empresa.CadastroEmpresa.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

        @Autowired
        OcorrenciaService ocorrenciaService;

        @PostMapping
        public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
            return ocorrenciaService.saveOcorrencia(ocorrencia);
        }

        @PutMapping
        public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
            return ocorrenciaService.updateOcorrencia(ocorrencia);
        }

        @GetMapping
        public List<Ocorrencia> getOcorrenciaList(){
            return ocorrenciaService.findAll();
        }


        @GetMapping("/{idocorrencia}")
        public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable("idocorrencia") Long idocorrencia) throws Exception{
            return ResponseEntity.ok(ocorrenciaService.getById(idocorrencia).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idocorrencia}")
        public ResponseEntity<Ocorrencia> deleteById(@PathVariable("idocorrencia") Long idocorrencia) throws Exception{
            try {
                ocorrenciaService.deleteOcorrencia(idocorrencia);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
        }
}
