package cs.server.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cs.server.dao.RoleDao;
import cs.server.dao.UserDao;
import cs.server.model.Role;
import cs.server.model.User;
import cs.server.serveice.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	
	@Transactional("b2cHibernateTransactionManager")
	public User getUser(String acc, String pwd) {
		// TODO Auto-generated method stub
		return userDao.getUser(acc, pwd);
	}

	@Transactional("b2cHibernateTransactionManager")
	public int updateUserData(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUserData(user);
	}


	@Transactional("b2cHibernateTransactionManager")
	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Transactional("b2cHibernateTransactionManager")
	public User getUser(String acc) {
		// TODO Auto-generated method stub
		return userDao.getUser(acc);
	}

	
	@Transactional("b2cHibernateTransactionManager")
	public Set<String> findRoles(String acc) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		User user = getUser(acc);
		if(user == null)
			return null;
		else
		{
			JSONArray jarray = JSONArray.fromObject(user.getRole_id());
			for(int i = 0 ; i < jarray.size() ; i++)
			{
				Role role =  roleDao.findOne(jarray.getString(i));
				set.add(role.getRole());
			}
		}
		return set;
	}

	@Transactional("b2cHibernateTransactionManager")
	public Set<String> findPermissions(String acc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
