package com.main;



@Controller
public class LoginController {
	
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
	{
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login.jsp");
		String msg="User name or password don't match.Please try again";
		if(userName.equals("aswathi") && password.equals("janvi"))
			msg="You are successfully logged in."
		mv.addObject("message",msg);
		return mv;
	}

}
