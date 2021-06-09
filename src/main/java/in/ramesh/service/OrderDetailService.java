package in.ramesh.service;

import java.util.List;
import in.ramesh.dao.OrderDao;
import in.ramesh.exception.DBException;
import in.ramesh.model.Order;
import in.ramesh.validator.OrderValidation;



public class OrderDetailService {

	 public OrderDetailService() {
			super();
			// TODO Auto-generated construct
		}
		 
		 OrderDao orderDao = new OrderDao();
		/**
		 * This method is used to get the list of foods
		 * 
		 * @return
		 * @throws DBException 
		 */
		public static List<Order> getFoodList()  {
			List <Order> foodList = null;
			try {
				foodList = OrderDao.findAllFood();

			} catch (DBException e) {
				System.out.println("Unable to Display Food");
			}
			return foodList;
		}
		
		
		
		/**
		 * This method is used to add food
		 * 
		 * @param order
		 * @return
		 * @throws DBException 
		 */

		public static boolean addFood(Order order) throws DBException {
			boolean isAdded = false;
			OrderDao dao=new OrderDao();
			List<Order> foods=OrderDao.findAllFood();
			try {
			if (OrderValidation.isValidFood(order)) {
				for (Order existFood : foods) {
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
