package cs.server.handler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cs.server.model.User;
import cs.server.serveice.UserService;

@Component("UserHandler")
public class UserHandler {
	
	@Autowired
	private UserService userService;
	
	public int login(String acc , String pwd){
		int res = 0 ;
		User user = userService.getUser(acc, pwd);
		if(user == null)
		{
			res = 1; 
		}
		
		
		return res;
	}

	
	public int modifyPWD(String acc){
		
		int res = 0 ;
		
		return res;
		
		
	}
	
	public int register(String acc ,String  pwd){
		
		int res = 0 ;
		
		return res;
	}

	
	public int  checkAcc(){
		
		
		int res = 0 ;
		
		return res;
		
	}
}
