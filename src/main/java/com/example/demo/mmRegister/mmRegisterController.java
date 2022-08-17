package com.example.demo.mmRegister;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.mmRegister.mmRegisterForm;

@Controller
public class mmRegisterController {
	
	@Autowired
	mmRegisterService mmRegisterService;
	
	@RequestMapping(path = "/designuser", method = RequestMethod.GET)
	String index(Model model) {
	    mmRegisterForm mmRegisterForm = new mmRegisterForm();
		model.addAttribute("design",mmRegisterForm);
	    return "mmRegister";
	}
}
