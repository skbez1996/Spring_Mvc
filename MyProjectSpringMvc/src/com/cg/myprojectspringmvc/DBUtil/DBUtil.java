  
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item DBUTIL class to store the details
* 
*/
package com.cg.myprojectspringmvc.DBUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.myprojectspringmvc.dto.Restaurant;

public interface DBUtil {

	public static List<Restaurant> restaurants = new ArrayList<Restaurant>() ;

	
}
