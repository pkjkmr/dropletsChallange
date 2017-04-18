package com.droplet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.droplet.beans.DistributionData;

@Controller
public class LoginController {
	
	DistributionData distributionData = new DistributionData();

	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	   public ModelAndView student(HttpServletRequest request , ModelMap modelMap) {
		 String userID = request.getParameter("userID");
		 modelMap.addAttribute("distributionData", distributionData.getDistributionList());
		 modelMap.addAttribute("distributionSizeList", distributionData.getDistributionSizeList());
		 modelMap.addAttribute("dataCenterList", distributionData.getDataCenterList());
		 return new ModelAndView("home", "userID", userID);
	   }

}
