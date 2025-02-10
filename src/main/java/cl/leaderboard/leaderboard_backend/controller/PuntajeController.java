package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.model.PuntajeModel;
import cl.leaderboard.leaderboard_backend.service.PuntajeService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/puntaje")
public class PuntajeController {

    @Autowired
    private PuntajeService puntajeService;

    @GetMapping("")
    public List<PuntajeModel> listar_puntaje() {
        return this.puntajeService.listarPuntajes();
    }
    
}
