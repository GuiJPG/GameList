package br.com.gamelist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamelist.dslist.DTO.GameDTO;
import br.com.gamelist.dslist.DTO.GameMinDTO;
import br.com.gamelist.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;

    }
    
}
