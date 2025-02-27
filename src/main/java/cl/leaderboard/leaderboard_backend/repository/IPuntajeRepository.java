package cl.leaderboard.leaderboard_backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.leaderboard.leaderboard_backend.DTOs.BuscarPartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PuntajeModel;

@Repository
public interface IPuntajeRepository extends JpaRepository<PuntajeModel, Integer>{

    @Query(nativeQuery = true, value = "select pa.nombre_partida, us.username, pu.puntos \r\n" + //
                "from puntaje pu\r\n" + //
                "join usuario us on us.id = pu.idusuario\r\n" + //
                "join partida pa on pa.id = pu.idpartida\r\n" + //
                "where pa.id = ?1")
    public List<BuscarPartidasDTO> buscarPartidaPorId(Integer id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into puntaje(idusuario,idpartida,puntos,fechaCreacion) values (?1,?2,?3,?4)")
    public void guardarPartida(Integer idusuario, Integer idpartida, Integer puntos, Date fecha);
}
