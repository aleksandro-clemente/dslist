package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.model.GameList;

public class GameListDTO {
	private Long id;
	private String name;

	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList gameList) {
		this.id = gameList.getId();
		this.name = gameList.getName();
	}
	public GameListDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
