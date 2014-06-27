<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' /> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nivel iluminat</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
<h5>Afiseaza continutul tabelei Nivel iluminat</h5>
<s:form action="list_nivel" method="post">
<input type="submit" value="Afiseaza"/>
</s:form>
 <div STYLE=" height: 233px; width:780px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th>Destinatia cladirii</th>
            <th>Tipul Incaperii</th>
            <th>Indice Orbire</th>
            <th>Iluminare medie</th>
            <th>Indice redare culoare</th>
            <th>Inaltimea plan lucru</th>
            <th>Obs</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="nivel_iluminat_list" var="nivel_iluminat">
     
            <tr>
                 <td><s:property value="tipul_destinatie"/></td>
                 <td><s:property value="locatie"/></td>
                 <td><s:property value="indice_orbire"/></td>
                 <td><s:property value="iluminare_medie"/></td>
                 <td><s:property value="indice_redare_culoare"/></td>
                 <td><s:property value="inaltime_plan_lucru"/></td>
                 <td><s:property value="observatii"/></td>
                 <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
            </tr>
    </s:iterator>
</table>
  </div>   	
  <br/>
<h5>Adaugati noi coeficienti</h5>
    <hr align="left" size="1" width="200">
<s:form action="add" method="post">
	<s:textfield name="nivel_iluminat.tipul_destinatie" label="Destinatia cladirii"/>
	<s:textfield name="nivel_iluminat.locatie" label="Tipul Incaperii"/>
	<s:submit value="Adauga" align="center"/>
</s:form>


	</div>
</div> 
</div>
</body>
</html>