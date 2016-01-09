package cs.server.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cs.server.dao.UserDao;
import cs.server.model.User;
import cs.server.serveice.UserService;

@Component("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(String acc, String pwd) {
		// TODO Auto-generated method stub
		return userDao.getUser(acc, pwd);
	}

	@Override
	public int updateUserData(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserData(user);
	}

	@Override
	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	
	
	
	

}
