
package in.ramesh;

import java.util.List;
import in.ramesh.exception.DBException;
import in.ramesh.model.Order;
import in.ramesh.service.OrderDetailService;

public class TestOrderDetailService {
	
	public static void main(String[] args) throws DBException {
		
		Order order1=new Order("chicken gravy",240.0,"non-veg","velan");
		Order order2=new Order("vada",30.0,"veg","aryas");
		Order order3=new Order("chicken 65",100.0,"non-veg","srkp");
		OrderDetailService.addFood(order1);
		OrderDetailService.addFood(order2);
		OrderDetailService.addFood(order3);
		
		
	}
		
	
	public static void listFoods() {
		List<Order> listFoods=OrderDetailService.getFoodList();
			for (Order food : listFoods) {
			
			System.out.println(food.getFoodName());
			
		    }
	}

}
