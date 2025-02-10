package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.model.TableroModel;
import cl.leaderboard.leaderboard_backend.service.TableroService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/tablero")
public class TableroController {

    @Autowired
    private TableroService tableroService;

    @GetMapping("")
    public List<TableroModel> ver_tablero() {
        return this.tableroService.tablero();
    }
    
}
