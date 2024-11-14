package com.gameslist.gameslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gameslist.gameslist.dto.GameminDTO;
import com.gameslist.gameslist.entities.Game;
import com.gameslist.gameslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameminDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameminDTO> dto = result.stream().map(x -> new GameminDTO(x)).toList();
		return dto;
	}
	
}
