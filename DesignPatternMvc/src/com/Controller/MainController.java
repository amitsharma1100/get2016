package com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Amit
 *This is the dispatcher servlet of the spring-mvc
 */
@Controller

public class MainController {
	
	/**
	 * 
	 * @return-the index view
	 */
	@RequestMapping(value="/")
	public String landingPage()
	{
		return "index";
	}
	
	/**
	 * 
	 * @return-the create new car view
	 */
	@RequestMapping(value="/create")
	public String createPage(HttpServletRequest request){
		request.setAttribute("action","create");
		return "forward:/CarDekhoServlet";	
	}
	
	/**
	 * 
	 * @return-the list cars view
	 */
	@RequestMapping(value="/list")
	public String listPage(){
		return "forward:/ListServlet";
	}
	
	@RequestMapping(value="/addCar")
	public String addCar(HttpServletRequest request){
		return "forward:/CreateCarServlet";
	}
	
	@RequestMapping("/details")
	public String getDetails(HttpServletRequest request){
		return "details";
	}
	
	@RequestMapping("/PreEditCar")
	public String preEdit(HttpServletRequest request)
	{
	return "forward:/PreEditCarServlet";	
	}

}
