package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.DTOs.ActualizarUsuarioDTO;
import cl.leaderboard.leaderboard_backend.DTOs.CrearUsuarioDTO;
import cl.leaderboard.leaderboard_backend.model.UsuarioModel;
import cl.leaderboard.leaderboard_backend.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public List<UsuarioModel> getUsuarios() {
        return this.usuarioService.listarUsuarios();
    }
    
    @PostMapping("")
    public UsuarioModel registrar_usuario(@RequestBody CrearUsuarioDTO entity) {
        return this.usuarioService.guardarUsuario(entity);
    }
    
    @GetMapping("/{id}")
    public UsuarioModel buscar_usuario_id(@PathVariable Integer id) {
        return this.usuarioService.buscarUsuario(id);
    }
    
    @PutMapping("/{id}")
    public UsuarioModel actualizar_usuario(@PathVariable Integer id, @RequestBody ActualizarUsuarioDTO entity) {
        return this.usuarioService.actualizarUsuario(id, entity);
    }
}
