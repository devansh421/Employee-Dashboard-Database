<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<body>
 <form action="update" method="post">
  <table style='border:2px solid blue;margin:auto;margin-top:30px;font-size:20px' cellpadding='10px'>
   <tr>
    <td>Employee id</td>
    <td>${emp.eid}<input type='hidden' value="${emp.eid}" name='eid'></td>
   </tr>
   <tr>
    <td>Edit employee first name</td>
    <td><input type='text' value="${emp.firstname}" name='firstname' style='font-size:19px' required></td>
   </tr>
   <tr>
    <td>Edit employee last name</td>
    <td><input type='text' value="${emp.lastname}" name='lastname' style='font-size:19px' required></td>
   </tr>
   <tr>
    <td>Select employee department</td>
    <td>
      <select name='department' style='font-size:19px;width:250px'>
       <c:if test="${emp.department=='Marketing'}"><option selected>Marketing</option></c:if>
       <c:if test="${emp.department!='Marketing'}"><option>Marketing</option></c:if>
       <c:if test="${emp.department=='Accounts'}"><option selected>Accounts</option></c:if>
       <c:if test="${emp.department!='Accounts'}"><option>Accounts</option></c:if>
       <c:if test="${emp.department=='Training'}"><option selected>Training</option></c:if>
       <c:if test="${emp.department!='Training'}"><option>Training</option></c:if>
       <c:if test="${emp.department=='Sales'}"><option selected>Sales</option></c:if>
       <c:if test="${emp.department!='Sales'}"><option>Sales</option></c:if>
       <c:if test="${emp.department=='HR'}"><option selected>HR</option></c:if>
       <c:if test="${emp.department!='HR'}"><option>HR</option></c:if>
      </select>
    </td>
   </tr>
   <tr>
    <td>Edit employee phone</td>
    <td><input type='text' value="${emp.phone}" name='phone' style='font-size:19px' required></td>
   </tr>
   <tr>
    <td>Edit employee email</td>
    <td><input type='text' value="${emp.email}" name='email' style='font-size:19px' required></td>
   </tr>
   <tr>
    <td>Edit employee salary</td>
    <td><input type='text' value="${emp.salary}" name='salary' style='font-size:19px' required></td>
   </tr>
   <tr>
    <td colspan="2" align="right">
    	<input style='font-size:18px;' type='submit' value="Update Record">
    </td>
   </tr>
  </table>
  </form>
  <div style='text-align: center;margin-top:10px'>
    <input type='button' value='Back' style='font-size:19px' onclick='history.back()'>   
  </div>
</body>
</html>
