package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.ActualizarUsuarioDTO;
import cl.leaderboard.leaderboard_backend.DTOs.CrearUsuarioDTO;
import cl.leaderboard.leaderboard_backend.model.UsuarioModel;

@Service
public interface UsuarioService{

    List<UsuarioModel> listarUsuarios();
    UsuarioModel guardarUsuario(CrearUsuarioDTO usuario);
    UsuarioModel buscarUsuario(Integer id);
    UsuarioModel actualizarUsuario(Integer id, ActualizarUsuarioDTO usuario);
    boolean borrarUsuario(Integer id);
}
