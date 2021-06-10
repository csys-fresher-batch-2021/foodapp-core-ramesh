package in.ramesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.ramesh.exception.DBException;
import in.ramesh.model.Hotel;
import in.ramesh.util.ConnectionUtil;

public class HotelDao {

	/**
	 * This method is used to get all the hotel details from the database
	 * 
	 * @return
	 * @throws DBException 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	
	public static List<Hotel> findAllFood() throws DBException{
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		List<Hotel> foodList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from food_list";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String foodName = rs.getString("food_name");
				double price = rs.getDouble("price");
				String foodType = rs.getString("food_type");
				String hotelName = rs.getString("hotel_name");
				
				Hotel food = new Hotel(foodName, price, foodType,hotelName);
				foodList.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return foodList;
	}

	/**
	 * This method is used to add hotel in array list
	 * 
	 * @param args
	 * @throws DBException 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public void save(Hotel food) throws DBException{
		System.out.println(food);
		
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
	
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into food_list(food_name,price,food_type,hotel_name) values ( ?,?,?,? )";

			pst = connection.prepareStatement(sql);
			pst.setString(1, food.getFoodName());
			pst.setDouble(2, food.getPrice());
			pst.setString(3, food.getFoodType());
			pst.setString(4, food.getHotelName());
			int stat=pst.executeUpdate();
			System.out.println(stat);
		} catch (SQLException e) {
			throw new DBException("Food can't be added");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	
	
	
}
