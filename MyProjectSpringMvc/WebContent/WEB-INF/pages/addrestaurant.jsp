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
<h1>Add Restaurant Details</h1>
<r:form action="addrestaurant" method="post" modelAttribute="rest">
 <table>
 <tr>
 <td>restaurant Phone</td>
 <td><r:input path="phone" required="true"/></td>
 </tr>
 <tr>
 <td>restaurant name</td>
 <td><r:input path="name" required="true"/></td>
 </tr>
 <tr>
 <td>Restaurant Address</td>
 <td><r:input path="address" required="true"/></td>
 </tr>
 <tr>
  <td>menu id</td>
 <td><r:input path="menu.menuId" required="true"/></td>
 </tr> 
 <tr>
 <td>menu name</td>
 <td><r:input path="menu.menuName" required="true"/></td>
 </tr>

<%--  
 <tr>
 <td>Item Id</td>
 <td><r:input path="item.item_id" required="true"/></td>
 </tr>

 <tr>
 <td>Item name</td>
 <td><r:input path="item.name" required="true"/></td>
 </tr>
 
 <tr>
 <td>Item Price</td>
 <td><r:input path="item.price" required="true"/></td>
 </tr>

  <tr>
 <td>Item description</td>
 <td><r:input path="item.description" required="true"/></td>
 </tr>
  --%>
 
 <tr>
 <td><input type="submit" value="Add iTEMS"/></td>
 </tr>
 </table>
</r:form>
</body>
</html>