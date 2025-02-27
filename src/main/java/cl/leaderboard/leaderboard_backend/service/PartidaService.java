package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.CrearPartidaDTO;
import cl.leaderboard.leaderboard_backend.DTOs.PartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PartidaModel;

@Service
public interface PartidaService {

    List<PartidaModel> listarPartidas();
    List<PartidasDTO> listarPartidasJugadas();
    PartidaModel agregarPartida(CrearPartidaDTO partidaentity);
}
