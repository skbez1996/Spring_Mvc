/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepository interface used to specify the methods
* 
*/
package com.cg.myprojectspringmvc.dao;

import java.util.List;

import com.cg.myprojectspringmvc.dto.Item;
import com.cg.myprojectspringmvc.dto.Restaurant;

public interface MenuRepository {
	
	public Restaurant save(Restaurant restaurant);

	public Item saveItem(Item item);
	public Restaurant findByName(String name);
	public List<Restaurant> getRestaurant();
	

}