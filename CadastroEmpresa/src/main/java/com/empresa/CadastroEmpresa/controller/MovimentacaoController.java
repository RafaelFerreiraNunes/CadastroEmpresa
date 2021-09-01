package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Movimentacao;
import com.empresa.CadastroEmpresa.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

        @Autowired
        MovimentacaoService movimentacaoService;

        @PostMapping
        public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
            return movimentacaoService.saveMovimentacao(movimentacao);
        }

        @PutMapping
        public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
            return movimentacaoService.updateMovimentacao(movimentacao);
        }

        @GetMapping
        public List<Movimentacao> getMovimentacaoList(){
            return movimentacaoService.findAll();
        }


        @GetMapping("/{idmovimentacao}")
        public ResponseEntity<Movimentacao> getJornadaById(@PathVariable("idmovimentacao") Long idmovimentacao) throws Exception{
            return ResponseEntity.ok(movimentacaoService.getById(idmovimentacao).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idmovimentacao}")
        public ResponseEntity<Movimentacao> deleteById(@PathVariable("idmovimentacao") Long idmovimentacao) throws Exception{
            try {
                movimentacaoService.deleteMovimentacao(idmovimentacao);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
        }
}
