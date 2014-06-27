<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' /> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coeficienti reflexie</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
<h5>Afiseaza continutul tabelei Coeficienti de reflexie</h5>
<s:form action="list_admin" method="post">
<input type="submit" value="Afiseaza"/>
</s:form>
 <div STYLE=" height: 233px; width:400px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th width="200">Tipul Suparfetei</th>
            <th>Coeficient</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="coeficienti_reflexie_list" var="coeficienti_reflexie">
     
            <tr>
                 <td><s:property value="tipul_suprafetei"/></td>
                 <td><s:property value="coeficient"/></td>
                 <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
            </tr>
    </s:iterator>
</table>
  </div>   
 <br/>
<h5>Adaugati noi coeficienti</h5>
    <hr align="left" size="1" width="200">
<s:form action="add" method="post">
	<s:textfield name="coeficienti_reflexie.tipul_suprafetei" label="Tipul suprfetei"/>
	<s:textfield name="coeficienti_reflexie.coeficient" label="Coeficient"/>
	<s:submit value="Adauga" align="center"/>
</s:form>


	</div>
</div> 
</div>
</body>
</html>