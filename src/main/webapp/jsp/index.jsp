<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<body>

<table>
<tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Address type</th>
    <th>Phone Number</th>
    <th>Address1</th>
    <th>Address2</th>
    <th>City</th>
    <th>State</th>
    <th>Postal Code</th>
    <th>Country</th>
    
  </tr>
  <c:forEach items="${contacts}" var="contact">
    <tr>
      <td>${contact.firstName}</td>
      <td>${contact.lastName}</td>
      <td>${contact.addressType}</td>
      <td>${contact.phoneNumber}</td>
   
      <c:forEach items="${contact.addresses}" var="address">
 	     <td>${address.addressLine1}</td>
 	     <td>${address.addressLine2}</td>
 	     <td>${address.city}</td>
   	     <td>${address.state}</td>
 	     <td>${address.postalCode}</td>
 	     <td>${address.country}</td>
     </c:forEach>
    </tr>
  </c:forEach>
</table>
<br>
<br>

<form action="homework1" method="POST"> <!--make sure your form action=servlet name-->
  <label for="fname">First name:</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="lname">Last name:</label>
  <input type="text" id="lname" name="lname"><br><br>
  <label for="addressType">Choose an address type:</label>
  <select name="addressType" id="addressType">
    <option value="home">Home</option>
    <option value="business">Business</option>
  </select>
  <br><br>

  <label for="address1">Address1:</label>
  <input type="text" id="address1" name="address1"><br><br>
  <label for="address2">Address2:</label>
  <input type="text" id="address2" name="address2"><br><br>
  <label for="city">City:</label>
  <input type="text" id="city" name="city"><br><br>
  <label for="state">State:</label>
  <input type="text" id="state" name="state"><br><br>
  <label for="postalCode">Postal Code:</label>
  <input type="text" id="postalCode" name="postalCode"><br><br>
<label for="country">Country:</label>
  <input type="text" id="country" name="country"><br><br>
<label for="phoneNumber">Phone Number:</label>
  <input type="text" id="phoneNumber" name="phoneNumber"><br><br>
  
  <input type="submit" value="Submit">
</form>
<br>
<!-- I can't get the error to print. Testing <c:out value = "${ContactServlet.error}"/>-->
<c:out value = "${errors}"/> 
<br>



</body>
</html>