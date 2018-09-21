package trng.samp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import trng.samp.dao.LoginDaoImpl;
import trng.samp.pojo.LoginVerify;
import trng.samp.services.LoginServiceImpl;

@Controller
public class LoginController {

	@RequestMapping("/index.htm")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("verify") LoginVerify lv) {
		ModelAndView mv = new ModelAndView("index");
		System.out.println("Hello!");
		return mv;
	}

	@RequestMapping(value = "/indexSubmit.htm", method = RequestMethod.POST)
	public ModelAndView loginVerify(@ModelAttribute("verify") LoginVerify lv) {
		
		System.out.println(lv.getUsername());
		LoginServiceImpl lsi = new LoginServiceImpl();

		if (lsi.verifyLogin(lv)==true) {
			return new ModelAndView("success");
		} else {
			return new ModelAndView("failure");
		}
	}

}
