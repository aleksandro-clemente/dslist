package com.devsuperior.dslist.dto;
import com.devsuperior.dslist.GameMinProjection;
import com.devsuperior.dslist.model.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;	
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}
	
	public GameMinDTO(Game game) {
		this.id = game.getId();
		this.title= game.getTitle();
		this.year = game.getYear();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();	
	}
	public GameMinDTO(GameMinProjection gameProjection) {
		this.id = gameProjection.getId();
		this.title= gameProjection.getTitle();
		this.year = gameProjection.getGameYear();
		this.imgUrl = gameProjection.getImgUrl();
		this.shortDescription = gameProjection.getShortDescription();	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
	
	
}
