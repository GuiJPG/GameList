package br.com.gamelist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gamelist.dslist.entities.Game;

public interface GameRepositories extends JpaRepository<Game, Long> {


}
