package cs.server.dao;

import java.util.List;

import cs.server.model.User;

public interface UserDao {


	public User getUser(String acc);
	
	public User getUser(String acc, String pwd);
	
	public  
	
	public int updateUserData (User user);
	
	public <T> List<T> findAll();
	
	
}
