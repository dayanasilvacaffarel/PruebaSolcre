package com.sistemavotacion.demo.controller;

import com.sistemavotacion.demo.model.Candidato;
import com.sistemavotacion.demo.model.Usuario;
import com.sistemavotacion.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        List<Usuario> listaUsuarios = new ArrayList<>();


        Usuario u1 = new Usuario();
        u1.setNombre("Oscar");
        u1.setApellido("Martinez");
        u1.setDocumento("0000");
        u1.setEmail("oscar@dundermifflin.com");
        u1.setClave("123456789");

        listaUsuarios.add(u1);

        return listaUsuarios;
    }

    @PostMapping("/usuario")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        usuarioService.guardar(usuario);
        return usuario;
    }

    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarTodos();
    }
}
