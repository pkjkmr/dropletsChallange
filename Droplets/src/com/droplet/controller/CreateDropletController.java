package com.droplet.controller;

import java.util.ArrayList;
import java.util.Date;
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
public class CreateDropletController {

	@Autowired
	 DistributionData  dd ;

	@RequestMapping(value = "/createDroplet", method = RequestMethod.POST)
	   public ModelAndView student(HttpServletRequest request , ModelMap modelMap) {
		 String userID = request.getParameter("userId");
		 String os = request.getParameter("os");
		 String version =  request.getParameter(os+"version");
		 String sizePrize = request.getParameter("sizePrize");
		 String dataCenter = request.getParameter("dataCenter");
		 String pn = request.getParameter("pn")!=null ?request.getParameter("pn"):"off";
		 String bkp = request.getParameter("bkp")!=null ?request.getParameter("bkp"):"off";
		 String ipv6 = request.getParameter("ipv6")!=null ?request.getParameter("ipv6"):"off";
		 String mo = request.getParameter("mo")!=null ?request.getParameter("mo"):"off";
		 String[] hostNames =  request.getParameterValues("hostName[]");
		 for(String hostName : hostNames){
			 Droplet d = new Droplet(userID, os, version, sizePrize, dataCenter, pn, bkp, ipv6, mo, hostName, new Date());
			 dd.addDroplets(d);
			 
		 }
		 List<Droplet> dl= dd.getDroplets();
		 List<Droplet> userDropletList = new ArrayList<Droplet>();
		 for(Droplet userDroplet : dl){
			 if(userID.equalsIgnoreCase(userDroplet.getUser())){
				 userDropletList.add(userDroplet);
			 }
		 }
		 return new ModelAndView("userDroplets", "userDropletList", userDropletList);
	   }
}
