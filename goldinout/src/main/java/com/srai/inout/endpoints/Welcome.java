package com.srai.inout.endpoints;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping("/")
	public String welcome(HttpServletRequest  request, Model data) {
		LocalDate dateNow = LocalDate.now();
		data.addAttribute("message", dateNow.toString());
		
		return UITemplates.WELCOME;
	}
}
