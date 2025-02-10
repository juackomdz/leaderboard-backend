package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.CrearUsuarioDTO;
import cl.leaderboard.leaderboard_backend.model.UsuarioModel;

@Service
public interface UsuarioService{

    List<UsuarioModel> listarUsuarios();
    UsuarioModel guardarUsuario(CrearUsuarioDTO usuario);
}
