
package in.ramesh;

import java.util.List;
import in.ramesh.exception.DBException;
import in.ramesh.model.Hotel;
import in.ramesh.service.OrderDetailService;

public class TestOrderDetailService {
	
	public static void main(String[] args) throws DBException {
		
		Hotel order1=new Hotel("chicken gravy",240.0,"non-veg","velan");
		Hotel order2=new Hotel("vada",30.0,"veg","aryas");
		Hotel order3=new Hotel("chicken 65",100.0,"non-veg","srkp");
		OrderDetailService.addFood(order1);
		OrderDetailService.addFood(order2);
		OrderDetailService.addFood(order3);
		
		
	}
		
	
	public static void listFoods() {
		List<Hotel> listFoods=OrderDetailService.getFoodList();
			for (Hotel food : listFoods) {
			
			System.out.println(food.getFoodName());
			
		    }
	}

}
