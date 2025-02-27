package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.DTOs.CrearPartidaDTO;
import cl.leaderboard.leaderboard_backend.model.PartidaModel;
import cl.leaderboard.leaderboard_backend.service.PartidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping("")
    public List<PartidaModel> listar_partidas() {
        return this.partidaService.listarPartidas();
    }
    
    @PostMapping("")
    public PartidaModel agregar_partida(@RequestBody CrearPartidaDTO entity) {
        return this.partidaService.agregarPartida(entity);
    }
    
}
