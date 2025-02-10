package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.model.TableroModel;
import cl.leaderboard.leaderboard_backend.repository.ITableroRepository;
import cl.leaderboard.leaderboard_backend.service.TableroService;

@Service
public class TableroServiceImpl implements TableroService{

    @Autowired
    private ITableroRepository tableroRepository;

    public List<TableroModel> tablero(){
        return tableroRepository.findAll();
    }
}
