package cl.leaderboard.leaderboard_backend.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.leaderboard.leaderboard_backend.DTOs.AgregarPartidaDTO;
import cl.leaderboard.leaderboard_backend.DTOs.BuscarPartidasDTO;
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

    public List<BuscarPartidasDTO> buscarPorId(Integer id){
        return puntajeRepository.buscarPartidaPorId(id);
    }

    public void guardarPartida(List<PuntajeModel> listaPuntaje){
        /* 
        listaPuntaje.forEach(puntaje -> {
            PuntajeModel puntajeModel = new PuntajeModel();

            puntajeModel.setPuntos(puntaje.getPuntos());
            puntajeModel.setPartidaId(puntaje.);
            puntajeModel.setUsuarioId(puntaje.getIdUsuario());
            puntajeRepository.save(puntajeModel);
            });
            */
        this.puntajeRepository.saveAll(listaPuntaje);
    }


    public void guardarPartida2(List<AgregarPartidaDTO> partidas){
       /*------ciclo for-----------*/
        
       for (int i = 0; i < partidas.size(); i++) {
            System.out.println("ite="+partidas.size());
            System.out.println("datos="+partidas.get(i).getIdUsuario()+","+ partidas.get(i).getIdPartida()+","+ partidas.get(i).getPuntos());
            this.puntajeRepository.guardarPartida(partidas.get(i).getIdUsuario(), partidas.get(i).getIdPartida(), partidas.get(i).getPuntos(), new Date());
       }
        /* -----ciclo foreach------
         * ---------------------
        
        partidas.forEach(puntajes -> {
            System.out.println("dato="+puntajes.getIdUsuario()+","+puntajes.getIdPartida()+","+puntajes.getPuntos());
            System.out.println("fecha="+new Date());
            this.puntajeRepository.guardarPartida(puntajes.getIdUsuario(),puntajes.getIdPartida(),puntajes.getPuntos(),new Date());
        });
        */
    }
}
