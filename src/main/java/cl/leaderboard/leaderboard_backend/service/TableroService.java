package cl.leaderboard.leaderboard_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.model.TableroModel;

@Service
public interface TableroService {

    List<TableroModel> tablero();
}
