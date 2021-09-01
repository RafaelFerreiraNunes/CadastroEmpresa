package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.JornadaTrabalho;
import com.empresa.CadastroEmpresa.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }


    @GetMapping("/{idjornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idjornada") Long idjornada) throws Exception{
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idjornada).orElseThrow(() -> new Exception("jornada não encontrada.")));
    }

    @DeleteMapping("/{idjornada}")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("idjornada") Long idjornada) throws Exception{
       try {
           jornadaTrabalhoService.deleteJornada(idjornada);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
