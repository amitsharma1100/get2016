package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Facade.CarFacade;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CarFacade carFacade;
       
    /**
	 * @return the carFacade
	 */
	public CarFacade getCarFacade() {
		return carFacade;
	}

	/**
	 * @param carFacade the carFacade to set
	 */
	@Required
	public void setCarFacade(CarFacade carFacade) {
		this.carFacade = carFacade;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	      HttpSession session=request.getSession();
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  carFacade=(CarFacade)context.getBean("carFacade");
	      session.setAttribute("carList",carFacade.getAllCars());

	        //after getting a car,redirect the user to the list page
	        request.getRequestDispatcher("WEB-INF/view/list.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
