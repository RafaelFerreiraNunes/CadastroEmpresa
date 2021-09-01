package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Empresa;
import com.empresa.CadastroEmpresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

        @Autowired
        EmpresaService empresaService;

        @PostMapping
        public Empresa createEmpresa(@RequestBody Empresa empresa){
            return empresaService.saveEmpresa(empresa);
        }

        @PutMapping
        public Empresa updateEmpresa(@RequestBody Empresa empresa){
            return empresaService.updateEmpresa(empresa);
        }

        @GetMapping
        public List<Empresa> getEmpresaList(){
            return empresaService.findAll();
        }


        @GetMapping("/{idempresa}")
        public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idempresa") Long idempresa) throws Exception{
            return ResponseEntity.ok(empresaService.getById(idempresa).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idempresa}")
        public ResponseEntity<Empresa> deleteById(@PathVariable("idempresa") Long idempresa) throws Exception{
            try {
                empresaService.deleteEmpresa(idempresa);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Empresa>) ResponseEntity.ok();
        }
}
