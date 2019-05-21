/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuServiceIMPl class which implements the logic of the functionalities
*/
package com.cg.myprojectspringmvc.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.myprojectspringmvc.dao.MenuRepository;
import com.cg.myprojectspringmvc.dao.MenuRepositoryImpl;
import com.cg.myprojectspringmvc.dto.Item;
import com.cg.myprojectspringmvc.dto.Menu;
import com.cg.myprojectspringmvc.dto.Restaurant;
import com.cg.myprojectspringmvc.exception.RestaurantNotFoundException;
@Service("menuservice")
@Transactional
public class MenuServiceImpl implements MenuService{
	@ Autowired
	MenuRepositoryImpl repo ;

	@Override
	public Restaurant add(Restaurant restaurant) {
		System.out.println("services "+restaurant);
		return repo.save(restaurant);
	}

	@Override
	public Restaurant searchByNameR(String restaurantName) throws RestaurantNotFoundException{
		
		Restaurant rest = repo.findByName(restaurantName);
		if(rest == null)
			throw new RestaurantNotFoundException("Restaurant not found");
		return rest;
		
	}
/*
//	@Override
//	public Menu add(Menu menu) {
//		// TODO Auto-generated method stub
//		return null;
//	}
*/

	@Override
	public List<Restaurant> showRestaurant() {
		return repo.getRestaurant();
	}

	@Override
	public Item addItem(Item item) {
		System.out.println("services "+item);
		return repo.saveItem(item);
		
	}

	

	
	
	
}
