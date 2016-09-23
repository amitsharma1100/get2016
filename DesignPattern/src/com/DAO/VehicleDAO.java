package com.DAO;

import com.VO.CarVO;
/**
 * 
 * @author Amit
 *
 */
public interface VehicleDAO {

	/**
	 * calculates the on road price of the car 
	 * this method is to be overridden
	 * @param carVO
	 * @return
	 */
	public int calculateOnRoadPrice(CarVO carVO);

	
}
