<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="r" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>AdD Items </h3>
 <form action="additems" method="post">
 
<tr>
 <td>Item Id</td>
 <td><input type= name="item_id"  /></td>
</tr>

<tr>
 <td>Item name</td>
 <td><input type ="text" path="item_name" /></td>
 </tr>
 
 <tr>
 <td>Item Price</td>
 <td><input type ="text path="item_price" /></td>
 </tr>

  <tr>
 <td>Item description</td>
 <td><input type ="text path="item_description" /></td>
 </tr>
 
 <tr>
 <td><input type="submit" value="Add items"/></td>
 </tr>
 </form>
 
</body>
</html>