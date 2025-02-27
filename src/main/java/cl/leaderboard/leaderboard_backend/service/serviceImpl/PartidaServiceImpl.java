package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.CrearPartidaDTO;
import cl.leaderboard.leaderboard_backend.DTOs.PartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PartidaModel;
import cl.leaderboard.leaderboard_backend.repository.IPartidaRepository;
import cl.leaderboard.leaderboard_backend.service.PartidaService;

@Service
public class PartidaServiceImpl implements PartidaService {

    @Autowired
    private IPartidaRepository partidaRepository;

    public List<PartidaModel> listarPartidas(){
        return partidaRepository.findAll();
    }

    public List<PartidasDTO> listarPartidasJugadas(){
        return partidaRepository.obtener_partidas();
    }

    public PartidaModel agregarPartida(CrearPartidaDTO partidaentity){
        
        PartidaModel partida = new PartidaModel();
        partida.setNombrePartida(partidaentity.getNombrePartida());
        partida.setDescripcion(partidaentity.getDescripcion());

        partida.setFechaCreacion(new Date());
        
        return partidaRepository.save(partida);
    } 
    
}
