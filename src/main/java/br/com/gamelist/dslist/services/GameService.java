package br.com.gamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamelist.dslist.DTO.GameMinDTO;
import br.com.gamelist.dslist.entities.Game;
import br.com.gamelist.dslist.repositories.GameRepositories;

@Service
public class GameService{

    @Autowired
    private GameRepositories gameRepositories;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepositories.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}