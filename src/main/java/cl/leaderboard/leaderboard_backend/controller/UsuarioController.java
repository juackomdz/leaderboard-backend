package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.DTOs.ActualizarUsuarioDTO;
import cl.leaderboard.leaderboard_backend.DTOs.CrearUsuarioDTO;
import cl.leaderboard.leaderboard_backend.model.UsuarioModel;
import cl.leaderboard.leaderboard_backend.service.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
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
    public ResponseEntity<List<UsuarioModel>> getUsuarios() {
        
        return ResponseEntity.ok(this.usuarioService.listarUsuarios());
    }
    
    @PostMapping("")
    public ResponseEntity<String> registrar_usuario(@RequestBody CrearUsuarioDTO entity) {
        UsuarioModel user = usuarioService.guardarUsuario(entity);
        if (user!=null) {
            return ResponseEntity.ok("Creado con exito");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el usuario");
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscar_usuario_id(@PathVariable Integer id) {
        if (this.usuarioService.buscarUsuario(id)!=null) {
            return ResponseEntity.ok(this.usuarioService.buscarUsuario(id));
        } else{
            return ResponseEntity.badRequest().body("No se encontro nada");
        }
        
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Object> actualizar_usuario(@PathVariable Integer id, @RequestBody ActualizarUsuarioDTO entity) {
        UsuarioModel user = usuarioService.actualizarUsuario(id, entity);
        if (user!=null) {
            return ResponseEntity.ok(user);
        } else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar");
        }
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar_usuario(@PathVariable Integer id) {
        if (usuarioService.borrarUsuario(id)) {
            return ResponseEntity.ok("Eliminado con exito");
            } else{
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar");
            }
    }
}
