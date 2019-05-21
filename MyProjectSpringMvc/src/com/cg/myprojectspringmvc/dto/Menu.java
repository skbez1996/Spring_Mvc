/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the Menu class which contains a list of items 
*/
package com.cg.myprojectspringmvc.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Entity
@Table(name="Menu_mvc")

public class Menu {
	@Id
	@Column(name="menu_id")
	private Integer menuId;
	
	public Menu(Integer menuId, String menuName, List<Item> itemName) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.itemName = itemName;
	}
	@Column(name="Menu_name")
	private String menuName;
	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "menu_id")
	private List <Item> itemName  ;
	
	public Menu() {
	}
	
	


	public Integer getMenuId() {
		return menuId;
	}




	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}




	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public List<Item> getItemName() {
		return itemName;
	}
	public void setItemName(List<Item> itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", itemName=" + itemName + "]";
	}
	

	
	

}
