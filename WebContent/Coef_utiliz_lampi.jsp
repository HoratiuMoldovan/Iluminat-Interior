<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' /> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coeficienti lampi flourescente</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
<h5>Afiseaza continutul tabelei Coeficienti lampi flourescente</h5>
<s:form action="list_coef_lampi" method="post">
<input type="submit" value="Afiseaza"/>
</s:form>
 <br/>
 <div class="half left">
  <div STYLE=" height: 233px; width:1200px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th>Coeficient</th>
            <th>Indice</th>
            <th>Perete</th>
            <th>Tavan</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="coef_utiliz_lampi_flourescente_list" var="coef_utiliz_lampi_flourescente">
     
            <tr>
                 <td><s:property value="coeficient_lampi"/></td>
                 <td><s:property value="indice"/></td>
                 <td><s:property value="perete"/></td>
                 <td><s:property value="tavan"/></td>
                 <td><a href="delete_user?id=<s:property value="id"/>">delete</a></td>
           </tr>
    </s:iterator>
</table>
  </div>
  </div>   	
  
 <div class="half right">
<h5>Adaugati Indici</h5>
    <hr align="left" size="1" width="200">
<s:form action="add_coef_lampi" method="post">
	<s:textfield name="coef_utiliz_lampi_flourescente.coeficient_lampi" label="User name"/>
	<s:textfield name="coef_utiliz_lampi_flourescente.indice" label="Indice"/>
	<s:textfield name="coef_utiliz_lampi_flourescente.perete" label="Perete"/>
	<s:textfield name="coef_utiliz_lampi_flourescente.tavan" label="Tavan"/>
	<s:submit value="Adauga" align="center"/>
</s:form>
 </div>

</div>
</div> 
</div>
</body>
</html>