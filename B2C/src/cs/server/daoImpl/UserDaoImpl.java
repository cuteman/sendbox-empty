package cs.server.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cs.server.dao.UserDao;
import cs.server.model.User;


@Repository("UserDao")
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private SessionFactory b2cSessionFactory;

	@Override
	public User getUser(String acc, String pwd) {
		// TODO Auto-generated method stub
		String sql = String.format("select * from user where acc = %s and pwd= %s", acc, pwd);
		return (User)b2cSessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(User.class).uniqueResult();
	}

	@Override
	public int updateUserData(User user) {
		// TODO Auto-generated method stub
		int res = 0 ; 
		try {
			b2cSessionFactory.getCurrentSession().saveOrUpdate(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			res = 1; 
		}
		return res ;
	}

	@Override
	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	







	

}
