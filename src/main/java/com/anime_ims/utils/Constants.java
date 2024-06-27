package com.anime_ims.utils;

public class Constants {
	public static String url = "jdbc:mysql://localhost:3306/anime_ims";
	public static final String user = "root";
	public static final String pass = "1234";
	
	public static final String INSERT_ANIME = "INSERT INTO anime (name, description, eps, duration, rating, releaseDate, genre) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ANIME_BY_ID = "SELECT id, name, description, eps, duration, rating, releaseDate, genre FROM anime WHERE id = ?";
    public static final String SELECT_ALL_ANIME = "SELECT id, name, description, eps, duration, rating, releaseDate, genre FROM anime";
    public static final String DELETE_ANIME = "DELETE FROM anime WHERE id = ?";
    public static final String UPDATE_ANIME = "UPDATE anime SET name = ?, description = ?, eps = ?, duration = ?, rating = ?, releaseDate = ?, genre = ? WHERE id = ?";
}
