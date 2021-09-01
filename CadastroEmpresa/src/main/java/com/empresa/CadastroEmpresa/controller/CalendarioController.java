package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Calendario;
import com.empresa.CadastroEmpresa.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

        @Autowired
        CalendarioService calendarioService;

        @PostMapping
        public Calendario createCalendario(@RequestBody Calendario calendario){
            return calendarioService.saveCalendario(calendario);
        }

        @PutMapping
        public Calendario updateCalendario(@RequestBody Calendario calendario){
            return calendarioService.updateCalendario(calendario);
        }

        @GetMapping
        public List<Calendario> getCalendarioList(){
            return calendarioService.findAll();
        }


        @GetMapping("/{idcalendario}")
        public ResponseEntity<Calendario> getCalendarioById(@PathVariable("idcalendario") Long idcalendario) throws Exception{
            return ResponseEntity.ok(calendarioService.getById(idcalendario).orElseThrow(() -> new Exception("calendario não encontrada.")));
        }

        @DeleteMapping("/{idcalendario}")
        public ResponseEntity<Calendario> deleteById(@PathVariable("idcalendario") Long idcalendario) throws Exception{
            try {
                calendarioService.deleteCalendario(idcalendario);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Calendario>) ResponseEntity.ok();
        }
}
