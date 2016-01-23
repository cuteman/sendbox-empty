package cs.server.serveice;

import java.util.List;
import java.util.Set;

import cs.server.model.User;

public interface UserService {

	public User getUser(String acc, String pwd);
	
	public User getUser(String acc);
	
	public int updateUserData (User user);
	

	  /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String acc);
    
    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String acc);
	
	
	public <T> List<T> findAll();
	
}
