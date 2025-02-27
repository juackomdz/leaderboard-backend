package cl.leaderboard.leaderboard_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.leaderboard.leaderboard_backend.DTOs.AgregarPartidaDTO;
import cl.leaderboard.leaderboard_backend.DTOs.BuscarPartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PuntajeModel;
import cl.leaderboard.leaderboard_backend.service.PuntajeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/puntaje")
public class PuntajeController {

    @Autowired
    private PuntajeService puntajeService;

    @GetMapping("")
    public List<PuntajeModel> listar_puntaje() {
        return this.puntajeService.listarPuntajes();
    }
    
    @GetMapping("/{id}")
    public List<BuscarPartidasDTO> buscar_por_id(@PathVariable Integer id) {
        return this.puntajeService.buscarPorId(id);
    }

    @PostMapping("")
    public String agregar_puntajes(@RequestBody List<AgregarPartidaDTO> entity) {
        this.puntajeService.guardarPartida2(entity);
        
        return "guardado con exito";
    }
    
}
