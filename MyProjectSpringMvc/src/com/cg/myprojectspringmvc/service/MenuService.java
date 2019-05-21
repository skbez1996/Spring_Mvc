/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuService Interface  shows the functionalities that will work
*/
package com.cg.myprojectspringmvc.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.myprojectspringmvc.dto.Item;
import com.cg.myprojectspringmvc.dto.Menu;
import com.cg.myprojectspringmvc.dto.Restaurant;
import com.cg.myprojectspringmvc.exception.RestaurantNotFoundException;

public interface MenuService {
	public Restaurant add(Restaurant restaurant);
	public Item addItem(Item item);
	public Restaurant searchByNameR(String restaurantName) throws RestaurantNotFoundException;
	//public Menu add(Menu menu);
	public List<Restaurant> showRestaurant();

	
	
	
}
   