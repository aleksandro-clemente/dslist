package com.devsuperior.dslist.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.GameMinProjection;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.model.Game;
import com.devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> games = gameRepository.findAll();
		return games.stream().map((x) -> new GameMinDTO(x)).collect(Collectors.toList());
	}
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> gameList = gameRepository.searchByList(listId);
		return gameList.stream().map((x) -> new GameMinDTO(x)).collect(Collectors.toList());
	}
}
