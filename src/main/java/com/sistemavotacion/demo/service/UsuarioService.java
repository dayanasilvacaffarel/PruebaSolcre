package com.sistemavotacion.demo.service;

import com.sistemavotacion.demo.model.Usuario;
import com.sistemavotacion.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void guardar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }
}
