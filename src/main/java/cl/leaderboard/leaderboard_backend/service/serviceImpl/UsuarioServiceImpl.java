package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.ActualizarUsuarioDTO;
import cl.leaderboard.leaderboard_backend.DTOs.CrearUsuarioDTO;
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

    public UsuarioModel guardarUsuario(CrearUsuarioDTO usuario){
        // código para guardar usuario
        UsuarioModel userResponse = new UsuarioModel();
        userResponse.setUsername(usuario.getUsername());
        userResponse.setEmail(usuario.getEmail());
        userResponse.setPass(usuario.getPass());

        userResponse.setFechaCreacion(new Date());
        userResponse.setFechaModificacion(null);
        return this.usuarioRepository.save(userResponse);
    }

    public UsuarioModel buscarUsuario(Integer id){
        Optional<UsuarioModel> opt = this.usuarioRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    public UsuarioModel actualizarUsuario(Integer id, ActualizarUsuarioDTO usuario){
       
        Optional<UsuarioModel> opt = this.usuarioRepository.findById(id);
        if (opt.isPresent()) {
            opt.get().setUsername(usuario.getUsername());
            opt.get().setEmail(usuario.getEmail());
            opt.get().setPass(usuario.getPass());
            opt.get().setFechaModificacion(new Date());
            return this.usuarioRepository.save(opt.get());
        }
        return null;
    }
}
