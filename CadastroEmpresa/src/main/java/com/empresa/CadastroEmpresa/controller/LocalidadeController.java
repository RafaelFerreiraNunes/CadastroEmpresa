package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Localidade;
import com.empresa.CadastroEmpresa.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

        @Autowired
        LocalidadeService localidadeService;

        @PostMapping
        public Localidade createLocalidade(@RequestBody Localidade localidade){
            return localidadeService.saveLocalidade(localidade);
        }

        @PutMapping
        public Localidade updateLocalidade(@RequestBody Localidade localidade){
            return localidadeService.updateLocalidade(localidade);
        }

        @GetMapping
        public List<Localidade> getLocalidadeList(){
            return localidadeService.findAll();
        }


        @GetMapping("/{idlocalidade}")
        public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("idlocalidade") Long idlocalidade) throws Exception{
            return ResponseEntity.ok(localidadeService.getById(idlocalidade).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idlocalidade}")
        public ResponseEntity<Localidade> deleteById(@PathVariable("idlocalidade") Long idlocalidade) throws Exception{
            try {
                localidadeService.deleteLocalidade(idlocalidade);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Localidade>) ResponseEntity.ok();
        }
}
