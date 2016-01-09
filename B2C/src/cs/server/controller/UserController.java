package cs.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cs.server.handler.UserHandler;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserHandler userHandler;

	@RequestMapping("/login")
	public ModelAndView login (HttpServletRequest req, String acc, String pwd ) {
		System.out.println("1");
		ModelAndView modelView = new ModelAndView();
		if (acc.isEmpty() || pwd.isEmpty())
		{
			System.out.println("2");
			modelView.setViewName("error");
			return modelView;
			
		}else
		{
			System.out.println("asas");
			//userHandler.login(session, acc, pwd)
		}
	//	modelView.setViewName("weight");
		System.out.println("3");
		return modelView;
	}

	
	
	@RequestMapping(params = "weight")
	public ModelAndView login(String w  ) {

		System.out.println(w);
		
		//System.out.println("weight Method begin :"+j);
		
		ModelAndView modelView = new ModelAndView();	
		/*if(weight == 0.0f)
		{
			modelView.setViewName("weight");
			return  modelView;
		}
		User _user  = (User)session.getAttribute("user");
		_user.setWeight(weight);
		userService.updateUserData(_user);
		modelView.setViewName("login");*/
		return modelView;
	}
}
