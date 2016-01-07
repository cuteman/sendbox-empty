package cs.server.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cs.server.model.User;
import cs.server.serveice.UserService;
import cs.server.util.NewDate;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private NewDate newDate;

	@RequestMapping(params = "login")
	public ModelAndView login(String uid, String cname ,HttpSession session) {


		System.out.println("loginMethod begin : "+ uid + "  " + cname);
		ModelAndView modelView = new ModelAndView();
		if (uid == null && cname == null) {
			modelView.setViewName("error");
			return modelView;
		}

		String nowdate = newDate.getDate();
		User _user = userService.findUserByuserid(uid);
		if (_user == null) {
			_user = new User();
			_user.setUserid(uid);
			_user.setCname(cname);
			_user.setReg_date(nowdate);
			_user.setLogin_date(nowdate);
			session.setAttribute("user", _user);

		} else {
			_user.setLogin_date(nowdate);
		}
		userService.updateUserData(_user);
		modelView.setViewName("weight");
		System.out.println("loginMethod over :"+ uid + ",came:" +cname);
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