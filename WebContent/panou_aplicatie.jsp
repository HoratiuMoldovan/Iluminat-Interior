<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iluminat Interior</title>
<link href='style.css' type='text/css' rel='stylesheet' /> 
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="index.jsp">iluminat interior</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
    	<br/>
    	<div class="half left">
    	<s:form action="citeste_incaperea" mehod="get">
    	<s:textfield name="lungime" label="Lungime"/>
    	<s:textfield name="latime" label="Latime"/>
		<s:textfield name="inaltime" label="Inaltime"/>
	    <s:textfield name="inaltime_plan_lucru" label="Inaltime plan lucru"/>
		<s:textfield name="tavan" label="Tavan"/>
    	<s:textfield name="pereti" label="Pereti"/>
		<s:submit value="Defineste"/>
    	</s:form>
    <s:form action="list_nivel_panou_aplicatie">
    <s:submit value="Afiseaza locatiile"/>
    </s:form>
    <div STYLE=" height: 233px; width:400px; font-size: 14px; overflow: auto;"  >
    <s:form>	
    	<table>
      <tr>
            <th width="200">Tipul Cladirii</th>
            <th>tipul incaperiit</th>
            <th>Alege</th>
       </tr>      
 <s:iterator value="nivel_iluminat_list" var="nivel_iluminat">
     
            <tr>
                 <td><s:property value="tipul_destinatie"/></td>
                 <td><s:property value="locatie"/></td>
                 <td><a href="selectbyId?id=<s:property value="id"/>">Alege</a></td>
            </tr>
    </s:iterator>
</table>
</s:form>       	
  </div>		        
		
		
    	</div>
    	
    	<div class="half right">
                         
    	<h5>Coeficienti de reflexie </h5> 
    	<hr align="left" size="1" width="300">
 
<s:form action="list" method="post">
<s:submit value="Afiseaza"/>
</s:form> 

  <div STYLE=" height: 150px; width: 300px; font-size: 12px; overflow: auto;"  >
  <table>
      <tr>
            <th width="200">Tipul Suparfetei</th>
            <th>Coeficient</th>
       </tr>      
 <s:iterator value="coeficienti_reflexie_list" var="coeficienti_reflexie">
     
            <tr>
                 <td><s:property value="tipul_suprafetei"/></td>
                 <td><s:property value="coeficient"/></td>
            </tr>
    </s:iterator>
</table>
</div>

</div>
</div>
</div> 
</div>
</body>
</html>