package pl.jaceksysiak.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

	@RequestMapping("/")
	public String showHome(Model model){
		
		model.addAttribute("name", "Karol");
		
		return "home";
	}

}



































