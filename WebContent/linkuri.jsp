<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Linkuri</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
<h5>Afiseaza continutul tabelei Linkuri</h5>

<s:form action="list_likuri">
<input type="submit" value="Afiseaza"/>
</s:form>
 <br/>
 
 <div class="half left">
  <div STYLE=" height: 233px; width:1200px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th>Link</th>
            <th>Descriere</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="linkuri_list" var="linkuri">
     
            <tr>
                 <td><s:property value="link"/></td>
                 <td><s:property value="descriere"/></td>
                 <td><a href="delete_linkuri?id=<s:property value="id"/>">delete</a></td>
           </tr>
    </s:iterator>
</table>
  </div>
   	
  
 
<h5>Adaugati noi link-uri</h5>
    <hr align="left" size="1" width="200">
<s:form action="add_linkuri" method="post">
	<s:textfield name="linkuri.link" label="Link"/>
	<s:textfield name="linkuri.descriere" label="Descriere"/>
	<s:submit value="Adauga" align="center"/>
</s:form>
 
 </div> 
</div>
</div> 
</div>
</body>
</html>