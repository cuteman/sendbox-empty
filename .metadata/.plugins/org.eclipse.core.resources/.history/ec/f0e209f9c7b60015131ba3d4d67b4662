package cs.server.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cs.server.dao.UserDao;
import cs.server.model.User;
import cs.server.serveice.UserService;

@Component("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	
	@Transactional
	public User findUserByuserid(String userid) {
		// TODO Auto-generated method stub
		return userDao.findUserByuserid(userid);
	}

	@Transactional
	public int updateUserData(User user) {
		// TODO Auto-generated method stub
		userDao.updateUserData(user);
		return 0;
	}
	
	public boolean isUserRegistered(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
