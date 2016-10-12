package com.Facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.DAO.CarDAO;
import com.VO.CarVO;

public class CarFacade {
	
	private CarDAO carDAO;
	
	/**
	 * @return the carDAO
	 */
	public CarDAO getCarDAO() {
		return carDAO;
	}
	/**
	 * @param carDAO the carDAO to set
	 */
	@Required
	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}
	public void addCar(CarVO carVO){
		carDAO.addCar(carVO);
	}
	public void updateCar(CarVO carVO){
		carDAO.updateCar(carVO);
	}
	
	public List < CarVO > getAllCars() {
		return carDAO.getAllCars();
	}
}
