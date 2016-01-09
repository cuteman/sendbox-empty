package cs.server.serveice;

import java.util.List;

import cs.server.model.User;

public interface UserService {

	public User getUser(String acc, String pwd);
	
	public int updateUserData (User user);
	
	public <T> List<T> findAll();
	
}
