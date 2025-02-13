package cl.leaderboard.leaderboard_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.leaderboard.leaderboard_backend.DTOs.PartidasDTO;
import cl.leaderboard.leaderboard_backend.model.PartidaModel;

@Repository
public interface IPartidaRepository extends JpaRepository<PartidaModel, Integer>{

    @Query(nativeQuery = true , value = "select u.username,u.email, p.puntos,pa.nombre_partida,pa.descripcion\r\n" + //
                "from usuario u\r\n" + //
                "join puntaje p on u.id = p.idusuario\r\n" + //
                "join partida pa on pa.id = p.idpartida\r\n")
    public List<PartidasDTO> obtener_partidas();
}
