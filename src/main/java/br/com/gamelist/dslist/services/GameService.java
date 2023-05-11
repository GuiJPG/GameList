package br.com.gamelist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamelist.dslist.DTO.GameDTO;
import br.com.gamelist.dslist.DTO.GameMinDTO;
import br.com.gamelist.dslist.entities.Game;
import br.com.gamelist.dslist.projections.GameMinProjection;
import br.com.gamelist.dslist.repositories.GameRepositories;

@Service
public class GameService{

    @Autowired
    private GameRepositories gameRepositories;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepositories.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepositories.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
       List<GameMinProjection> result = gameRepositories.searchByList(listId);
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }



}