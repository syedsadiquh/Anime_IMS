package com.anime_ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.anime_ims.conn.DBConnect;
import com.anime_ims.model.Anime;
import com.anime_ims.utils.Constants;

public class AnimeDAO {
	
	public void createAnime(Anime anime) {
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.INSERT_ANIME)) {
			
			statement.setString(1, anime.getName());
			statement.setString(2, anime.getDesc());
			statement.setInt(3, anime.getEps());
			statement.setInt(4, anime.getDuration());
			statement.setFloat(5, anime.getRating());
			statement.setString(6, anime.getGenre());
			statement.setString(7, anime.getReleaseDate());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Anime getAnimeById(int id) {
		
		Anime anime = new Anime();
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.SELECT_ANIME_BY_ID)) {
			
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				anime.setId(resultSet.getInt("id"));
				anime.setName(resultSet.getString("name"));
				anime.setDesc(resultSet.getString("desc"));
				anime.setEps(resultSet.getInt("eps"));
				anime.setDuration(resultSet.getInt("duration"));
				anime.setRating(resultSet.getFloat("rating"));
				anime.setReleaseDate(resultSet.getString("releaseDate"));
				anime.setGenre(resultSet.getString("genre"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return anime;
	}
	
	public void deleteAnime(int id) {
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.DELETE_ANIME)) {
			
			statement.setInt(1, id);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateAnime(Anime anime) {
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_ANIME)) {
			
			statement.setString(1, anime.getName());
			statement.setString(2, anime.getDesc());
			statement.setInt(3, anime.getEps());
			statement.setInt(4, anime.getDuration());
			statement.setFloat(5, anime.getRating());
			statement.setString(6, anime.getReleaseDate());
			statement.setString(7, anime.getGenre());
			statement.setInt(8, anime.getId());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Anime> getAllAnime() {
		
		List<Anime> animes = new ArrayList<>();
		
		try(Connection connection = DBConnect.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constants.SELECT_ALL_ANIME);
				ResultSet resultSet = statement.executeQuery()) {
			
			while (resultSet.next()) {
				Anime anime = new Anime();
				anime.setId(resultSet.getInt("id"));
				anime.setName(resultSet.getString("name"));
				anime.setDesc(resultSet.getString("desc"));
				anime.setEps(resultSet.getInt("eps"));
				anime.setDuration(resultSet.getInt("duration"));
				anime.setRating(resultSet.getFloat("rating"));
				anime.setReleaseDate(resultSet.getString("releaseDate"));
				anime.setGenre(resultSet.getString("genre"));
				animes.add(anime);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return animes;
	}

}
