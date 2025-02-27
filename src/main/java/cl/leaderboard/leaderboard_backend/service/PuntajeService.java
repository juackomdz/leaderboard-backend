package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.AgregarPartidaDTO;
import cl.leaderboard.leaderboard_backend.DTOs.BuscarPartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PuntajeModel;

@Service
public interface PuntajeService{

    List<PuntajeModel> listarPuntajes();
    List<BuscarPartidasDTO> buscarPorId(Integer id);
    void guardarPartida(List<PuntajeModel> listaPuntaje);
    void guardarPartida2(List<AgregarPartidaDTO> partidas);
}
