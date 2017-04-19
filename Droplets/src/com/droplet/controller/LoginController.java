package com.droplet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.droplet.beans.Droplet;
import com.droplet.service.DistributionData;

@Controller
public class LoginController {
	
	@Autowired
	DistributionData distributionData;

	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	   public ModelAndView login(HttpServletRequest request , ModelMap modelMap) {
		 String userID = request.getParameter("userID");
		 modelMap.addAttribute("distributionData", distributionData.getDistributionList());
		 modelMap.addAttribute("distributionSizeList", distributionData.getDistributionSizeList());
		 modelMap.addAttribute("dataCenterList", distributionData.getDataCenterList());
		 return new ModelAndView("home", "userID", userID);
	   }

	@RequestMapping(value = "/adminData", method = RequestMethod.GET)
	   public ModelAndView student(HttpServletRequest request , ModelMap modelMap) {

		 List<Droplet> dl= distributionData.getDroplets();
		 
		 return new ModelAndView("adminData", "dropletList", dl);
	   }
}
