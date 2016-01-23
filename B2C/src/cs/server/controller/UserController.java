package cs.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cs.server.handler.UserHandler;

@Controller
public class UserController {

	@Autowired
	private UserHandler userHandler;

	@RequestMapping(value="/login")
	public ModelAndView login (HttpServletRequest req, String acc, String pwd ) {
		
	   ModelAndView mav = new ModelAndView();
	   String url =  userHandler.login(acc, pwd);
	   mav.setViewName(url);
       return mav;
	}

	
	

}
