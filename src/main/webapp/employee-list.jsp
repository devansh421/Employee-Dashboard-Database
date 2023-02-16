<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <body>
  <div style='width:90%;margin:auto;margin-top:20px;margin-bottom:5px'>
    <a href='add' style='font-size:23px'>Add Employee</a>
  </div>
  <div style='border:2px outset black;width:90%;margin:auto'>
  <c:if test="${elist=='[]'}">  
  <div style='margin-top:50px;text-align: center'>
   <h2 style='color:red'>Employee dash board has no employee yet</h2>
  </div>
  </c:if>
  <c:if test="${elist!='[]'}">
  <table border='1' style='margin:auto;border-collapse:collapse;width:97%;margin-top:10px;margin-bottom:10px;font-size:20px' cellpadding='5px'>
  	<tr style="background-color:orange;color:white">
  	 <th colspan="8" align="center" style='font-size:22px'>Employee Dashboard</th>
  	</tr>
  	<tr>
  	 <th align="left">Eid</th><th align="left">First name</th><th align="left">Last name</th><th align="left">Department</th><th align="left">Phone</th>
  	 <th align="left">Email</th><th align="left">Salary</th><th align="left" style='color:magenta'>Action</th>
  	</tr>
  	<c:forEach var="emp" items="${elist}">
  	 <tr>
  	  <td>${emp.eid}</td>
  	  <td>${emp.firstname}</td>
  	  <td>${emp.lastname}</td>
  	  <td>${emp.department}</td>
  	  <td>${emp.phone}</td>
  	  <td>${emp.email}</td>
  	  <td>&#8377;${emp.salary}</td>
  	  <td>
  	   <a href='edit?eid=${emp.eid}'>Edit |</a>
  	   <a href='delete?eid=${emp.eid}' onclick="return confirm('Are you sure to remove this record?')">Remove</a>
  	  </td>
  	 </tr>
  	</c:forEach>
  </table>
  </c:if>
  </div>
 </body>
</html>