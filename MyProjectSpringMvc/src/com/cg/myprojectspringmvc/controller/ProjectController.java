package com.cg.myprojectspringmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.myprojectspringmvc.dto.Item;
import com.cg.myprojectspringmvc.dto.Menu;
import com.cg.myprojectspringmvc.dto.Restaurant;
import com.cg.myprojectspringmvc.service.MenuService;

@Controller
public class ProjectController {
	   @Autowired
	   MenuService menuservice;
	   Menu meu;
	   Restaurant resto;
	   
		@GetMapping("welcome")
		public String welcome() {
			return "Welcome";
		}
		@GetMapping("addpage")
		public ModelAndView getRestaurant(@ModelAttribute("rest") Restaurant rest) {
			
			return new ModelAndView("addrestaurant");
		}
		
		@PostMapping("addrestaurant")
		public ModelAndView addRestaurant(@ModelAttribute("rest") Restaurant rest) {
			this.resto=rest;
			//Restaurant resto=menuservice.add(rest);
			return new ModelAndView("additems");
		}
		
		@PostMapping("additems")
		public ModelAndView addItem(@RequestParam("item_id") int item_id,@RequestParam("name") String name, 
				@RequestParam("price") double price,
				@RequestParam("description") String description) {
			
			Item itm= new Item();
			itm.setItem_id(item_id);
			itm.setName(name);
			itm.setPrice(price);
			List<Item> itmList = new ArrayList<>();
			itmList.add(itm);
			
			
			Restaurant rest=new Restaurant();
			rest.setName(resto.getName());
			rest.setAddress(resto.getAddress());
			rest.setPhone(resto.getPhone());
			rest.setMenu(resto.getMenu());
			
			Restaurant restone=menuservice.add(rest);
			
			 
			/*Item item1 = menuservice.addItem(itm);*/
			return new ModelAndView("Welcome","addV",itm);
		}
		@PostMapping("additems")
		public ModelAndView addItems(@ModelAttribute("item") Item itm) {
			
			Item item1 = menuservice.addItem(itm);
			return new ModelAndView("Welcome","addV",item1);
		}

		
		
		
}
