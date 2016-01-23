package cs.server.handler;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;



@Component("UserHandler")
public class UserHandler {
	

	public String login(String acc , String pwd){
		
		Subject user = SecurityUtils.getSubject();
		
	    UsernamePasswordToken token = new UsernamePasswordToken(acc,pwd);
	    token.setRememberMe(true);
	    String  url  = "main";
        try {
        	  user.login(token);
		} catch (AuthenticationException  e) {
			// TODO: handle exception
			url = "error";
			token.clear(); 
			e.printStackTrace();
		}
        
		return url;
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
