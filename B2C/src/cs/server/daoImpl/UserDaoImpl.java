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
	
	



	public User findUserByuserid(String userid) {
		// TODO Auto-generated method stub
		
		return (User)b2cSessionFactory.getCurrentSession().createSQLQuery("select * from user").addEntity(User.class).uniqueResult();
	}


	public int updateUserData(User user) {
		// TODO Auto-generated method stub
		b2cSessionFactory.getCurrentSession().saveOrUpdate(user);
		System.out.println("updateUserData : "+user.getId());
		return 0;
	}



	public   boolean  isUserRegistered (String id){
		// TODO Auto-generated method stub
		return false;
	}


	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}





	

}
