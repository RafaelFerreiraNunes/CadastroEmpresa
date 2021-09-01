package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.CategoriaUsuario;
import com.empresa.CadastroEmpresa.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriausuario")
public class CategoriaUsuarioController {

        @Autowired
        CategoriaUsuarioService categoriaUsuarioService;

        @PostMapping
        public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
            return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
        }

        @PutMapping
        public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
            return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
        }

        @GetMapping
        public List<CategoriaUsuario> getCategoriaUsuarioList(){
            return categoriaUsuarioService.findAll();
        }


        @GetMapping("/{idcategoriausuario}")
        public ResponseEntity<CategoriaUsuario> getJornadaById(@PathVariable("idcategoriausuario") Long idcategoriausuario) throws Exception{
            return ResponseEntity.ok(categoriaUsuarioService.getById(idcategoriausuario).orElseThrow(() -> new Exception("categoria não encontrada.")));
        }

        @DeleteMapping("/{idcategoriausuario}")
        public ResponseEntity<CategoriaUsuario> deleteById(@PathVariable("idcategoriausuario") Long idcategoriausuario) throws Exception{
            try {
                categoriaUsuarioService.deleteCategoriaUsuario(idcategoriausuario);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
        }
}
