package com.empresa.CadastroEmpresa.controller;

import com.empresa.CadastroEmpresa.model.Usuario;
import com.empresa.CadastroEmpresa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

        @Autowired
        UsuarioService usuarioService;

        @PostMapping
        public Usuario createUsuario(@RequestBody Usuario usuario){
            return usuarioService.saveUsuario(usuario);
        }

        @PutMapping
        public Usuario updateUsuario(@RequestBody Usuario usuario){
            return usuarioService.updateUsuario(usuario);
        }

        @GetMapping
        public List<Usuario> getUsuarioList(){
            return usuarioService.findAll();
        }


        @GetMapping("/{idusuario}")
        public ResponseEntity<Usuario> getJornadaById(@PathVariable("idusuario") Long idusuario) throws Exception{
            return ResponseEntity.ok(usuarioService.getById(idusuario).orElseThrow(() -> new Exception("jornada não encontrada.")));
        }

        @DeleteMapping("/{idusuario}")
        public ResponseEntity<Usuario> deleteById(@PathVariable("idusuario") Long idusuario) throws Exception{
            try {
                usuarioService.deleteUsuario(idusuario);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Usuario>) ResponseEntity.ok();
        }
}
