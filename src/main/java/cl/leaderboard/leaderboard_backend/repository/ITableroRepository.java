package cl.leaderboard.leaderboard_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.leaderboard.leaderboard_backend.model.TableroModel;

@Repository
public interface ITableroRepository extends JpaRepository<TableroModel, Integer>{

}
