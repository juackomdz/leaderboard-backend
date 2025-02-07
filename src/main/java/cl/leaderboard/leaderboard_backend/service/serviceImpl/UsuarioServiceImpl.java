package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.model.UsuarioModel;
import cl.leaderboard.leaderboard_backend.repository.IUsuarioRepository;
import cl.leaderboard.leaderboard_backend.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public List<UsuarioModel> listarUsuarios(){
        // código para listar usuarios
        return this.usuarioRepository.findAll();
    }
}
