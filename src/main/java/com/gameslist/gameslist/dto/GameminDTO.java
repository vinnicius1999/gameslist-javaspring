package com.gameslist.gameslist.dto;

import com.gameslist.gameslist.entities.Game;

public class GameminDTO {


	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameminDTO() {
	
	}

	public GameminDTO(Game entities) {
		id = entities.getId();
		title = entities.getTitle();
		year = entities.getYear();
		imgUrl = entities.getImgUrl();
		shortDescription = entities.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

	










}
