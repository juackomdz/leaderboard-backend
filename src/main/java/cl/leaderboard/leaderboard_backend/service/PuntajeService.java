package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.model.PuntajeModel;

@Service
public interface PuntajeService{

    List<PuntajeModel> listarPuntajes();
}
