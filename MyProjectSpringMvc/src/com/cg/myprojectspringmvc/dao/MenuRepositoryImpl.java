package com.cg.myprojectspringmvc.dao;
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepositoryImpl class which implements the logic 
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.myprojectspringmvc.DBUtil.DBUtil;
import com.cg.myprojectspringmvc.dto.Item;
import com.cg.myprojectspringmvc.dto.Restaurant;
@Repository("repo")//creates a bean for this class as repo
public class MenuRepositoryImpl implements MenuRepository {

	@PersistenceContext
EntityManager entitymanager;

	public MenuRepositoryImpl() {
		
	}
	
	
	@Override
	public Restaurant save(Restaurant restaurant) {
		System.out.println("hiiiii"+restaurant);
		entitymanager.persist(restaurant);
		entitymanager.flush();
		return restaurant;
	}

	@Override
	public Restaurant findByName(String name) {
		List<Restaurant> restaurantList = DBUtil.restaurants;
		for (Restaurant restaurant : restaurantList) {
			if(restaurant.getName().equalsIgnoreCase(name)) {
			 return restaurant;
			 
			}
		}
		return null;
	}
	

	@Override
	public List<Restaurant> getRestaurant() {
		return DBUtil.restaurants;
	}


	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		System.out.println("hiiiii"+item);
		entitymanager.persist(item);
		entitymanager.flush();
		return item;
	}

	
	
	
}
