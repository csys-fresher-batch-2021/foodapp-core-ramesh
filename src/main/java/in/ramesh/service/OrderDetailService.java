package in.ramesh.service;

import java.util.List;
import in.ramesh.dao.HotelDao;
import in.ramesh.exception.DBException;
import in.ramesh.model.Hotel;
import in.ramesh.validator.OrderValidation;



public class OrderDetailService {

	 public OrderDetailService() {
			super();
			// TODO Auto-generated construct
		}
		 
		 HotelDao orderDao = new HotelDao();
		/**
		 * This method is used to get the list of foods
		 * @return
		 * @throws DBException 
		 */
		public static List<Hotel> getFoodList()  {
			List <Hotel> foodList = null;
			try {
				foodList = HotelDao.findAllFood();

			} catch (DBException e) {
				System.out.println("Unable to Display Food");
			}
			return foodList;
		}
		
		
		
		/**
		 * This method is used to add food
		 * @param order
		 * @return
		 * @throws DBException 
		 */

		public static boolean addFood(Hotel order) throws DBException {
			boolean isAdded = false;
			HotelDao dao=new HotelDao();
			List<Hotel> foods=HotelDao.findAllFood();
			try {
			if (OrderValidation.isValidFood(order)) {
				for (Hotel existFood : foods) {
					if(existFood.getFoodName().equalsIgnoreCase(order.getFoodName()))
					{
						System.out.println(order.getFoodName());
						isAdded=true;
						break;				
				    }	
				}
				if(!isAdded) {
				dao.save(order);
				isAdded = true;
			    }
			}
			}
			catch(DBException e) {
				System.out.println(e);
			}
			return isAdded;
		}

	
}
