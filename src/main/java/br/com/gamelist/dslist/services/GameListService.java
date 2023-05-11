package br.com.gamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamelist.dslist.DTO.GameListDTO;
import br.com.gamelist.dslist.entities.GameList;
import br.com.gamelist.dslist.repositories.GameListRepositories;

@Service
public class GameListService {

    @Autowired
    private GameListRepositories gameListRepositories;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepositories.findAll();
       List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
    
}
