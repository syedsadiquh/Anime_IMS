package com.anime_ims.model;

public class Anime {
	
	private int id;
	private String name;
	private String desc;
	private int eps;
	private int duration;
	private float rating;
	private String releaseDate;
	private String genre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getEps() {
		return eps;
	}
	public void setEps(int eps) {
		this.eps = eps;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Anime(int id, String name, String desc, int eps, int duration, float rating, String releaseDate,
			String genre) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.eps = eps;
		this.duration = duration;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}
	public Anime(String name, String desc, int eps, int duration, float rating, String releaseDate, String genre) {
		super();
		this.name = name;
		this.desc = desc;
		this.eps = eps;
		this.duration = duration;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}
	public Anime() {
		super();
	}
	
	

}
