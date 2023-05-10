package com.devsuperior.dslist.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.model.GameList;
import com.devsuperior.dslist.repository.GameListRepository;

@Service
public class GameListService {
		
	@Autowired
	private GameListRepository repository;
	
	public List<GameListDTO> findAll() {	
		List<GameList> gameList = repository.findAll();
		List<GameListDTO> dto = gameList.stream().map((x) -> new GameListDTO(x)).collect(Collectors.toList());
		return dto;
	}
}
