package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.TipoData;
import com.empresa.CadastroEmpresa.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {

        @Autowired
        TipoDataService tipoDataService;

        @PostMapping
        public TipoData createTipoData(@RequestBody TipoData tipoData){
            return tipoDataService.saveTipoData(tipoData);
        }

        @PutMapping
        public TipoData updateTipoData(@RequestBody TipoData tipoData){
            return tipoDataService.updateTipoData(tipoData);
        }

        @GetMapping
        public List<TipoData> getTipoDataList(){
            return tipoDataService.findAll();
        }


        @GetMapping("/{idtipodata}")
        public ResponseEntity<TipoData> getJornadaById(@PathVariable("idtipodata") Long idtipodata) throws Exception{
            return ResponseEntity.ok(tipoDataService.getById(idtipodata).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idtipodata}")
        public ResponseEntity<TipoData> deleteById(@PathVariable("idtipodata") Long idtipodata) throws Exception{
            try {
                tipoDataService.deleteTipoData(idtipodata);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<TipoData>) ResponseEntity.ok();
        }
}
