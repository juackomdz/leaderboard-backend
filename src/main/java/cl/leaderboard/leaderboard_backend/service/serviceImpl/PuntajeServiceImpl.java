package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.model.PuntajeModel;
import cl.leaderboard.leaderboard_backend.repository.IPuntajeRepository;
import cl.leaderboard.leaderboard_backend.service.PuntajeService;

@Service
public class PuntajeServiceImpl implements PuntajeService{

    @Autowired
    private IPuntajeRepository puntajeRepository;

    public List<PuntajeModel> listarPuntajes(){
        return puntajeRepository.findAll();
    }
}
