<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
<h5>Afiseaza continutul tabelei Users</h5>

<s:form action="list_user" method="post">
<input type="submit" value="Afiseaza"/>
</s:form>

 <br/>
 <div class="half left">
  <div STYLE=" height: 233px; width:1200px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th>User name</th>
            <th>User type</th>
            <th>User pass</th>
            <th>User e_mail</th>
            <th>User nume</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="users_list" var="users">
     
            <tr>
                 <td><s:property value="userName"/></td>
                 <td><s:property value="userType"/></td>
                 <td><s:property value="UserPass"/></td>
                 <td><s:property value="e_mail"/></td>
                 <td><s:property value="nume"/></td>
                 <td><a href="delete_user?id=<s:property value="id"/>">delete</a></td>
           </tr>
    </s:iterator>
</table>
  </div>
  </div>   	
  
 <div class="half right" align="right">
<h5 align="right">Adaugati noi useri</h5>
    <hr align="right" size="1" width="200">
<s:form action="add_user" method="post" >
	<s:textfield name="users.userName" label="User name"/>
	<s:textfield name="users.userType" label="User type"/>
	<s:textfield name="users.userPass" label="User pass"/>
	<s:textfield name="users.e_mail" label="User e_mail"/>
	<s:textfield name="users.nume" label="User nume"/>
	<s:submit value="Adauga" align="center"/>
</s:form>
 </div>

</div>
</div> 
</div>
</body>
</html>