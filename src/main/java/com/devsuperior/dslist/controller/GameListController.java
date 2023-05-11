package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameListService;
import com.devsuperior.dslist.service.GameService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll() {
		List<GameListDTO> dto = gameListService.findAll();
		return ResponseEntity.ok().body(dto);
	}
	@GetMapping(value="/{listId}/games")
	public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId){
		 List<GameMinDTO> listGame = gameService.findByList(listId);
		 return ResponseEntity.ok().body(listGame);
	}
}
