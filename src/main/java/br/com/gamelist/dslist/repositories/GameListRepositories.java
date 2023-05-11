package br.com.gamelist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gamelist.dslist.entities.GameList;

public interface GameListRepositories extends JpaRepository<GameList, Long> {


}