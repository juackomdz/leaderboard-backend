package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.model.UsuarioModel;
import cl.leaderboard.leaderboard_backend.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public List<UsuarioModel> getUsuarios() {
        return this.usuarioService.listarUsuarios();
    }
    
}
