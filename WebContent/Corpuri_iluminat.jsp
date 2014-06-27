<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href='style.css' type='text/css' rel='stylesheet' /> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="wrapper_corp">
	<div id="home">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>

    	
<h5>Afiseaza continutul tabelei Corpuri de iluminat</h5>
<s:form action="list_corp" method="post">
<input type="submit" value="Afiseaza"/>
</s:form>
 <div STYLE=" height: 233px; width:1800px; font-size: 14px; overflow: auto;"  >
  <table>
      <tr>
            <th>Producator</th>
            <th>Montaj</th>
            <th>Tip corp</th>
            <th>Tip Lampa</th>
            <th>Putere lampa</th>
            <th>Nr lampi</th>
            <th>Temp de culoare</th>
            <th>Indice redare culoare</th>
            <th>Flux_lampa</th>
            <th>Durata de funct</th>
            <th>Eficacitate luminoasa</th>
            <th>Luminanta</th>
            <th>Lungime corp</th>
            <th>Latime corp</th>
            <th>Diametru corp</th>
            <th>Inaltime suspendare</th>
            <th>Grad protectie</th>
            <th>Destinatii</th>
            <th>Delete</th>
       </tr>      
 <s:iterator value="corpuri_de_iluminat_list" var="corpuri_de_iluminat">
     
            <tr>
                 <td><s:property value="producator"/></td>
                 <td><s:property value="montaj"/></td>
                 <td><s:property value="tip_corp"/></td>
                 <td><s:property value="tip_lampa"/></td>
                 <td><s:property value="putere_lampa"/></td>
                 <td><s:property value="numar_lampi"/></td>
                 <td><s:property value="temperatura_de_culoare"/></td>
                 <td><s:property value="indice_redare_culoare"/>
                 <td><s:property value="flux_lampa"/></td>
                 <td><s:property value="durata_de_functionare"/></td>
                 <td><s:property value="eficacitate_luminoasa"/></td>
                 <td><s:property value="luminanta"/></td>
                 <td><s:property value="lungime_corp"/></td>
                 <td><s:property value="latime_corp"/></td>
                 <td><s:property value="diametru_corp"/></td>
                 <td><s:property value="inaltimea_de_suspendare"/></td>
                 <td><s:property value="grad_protectie"/></td>
                 <td><s:property value="destinatii"/></td>
                 <td><a href="delete_corp?id=<s:property value="id"/>">delete</a></td>
            </tr>
    </s:iterator>
</table>
  </div>   	
  <br/>
<h5>Adaugati noi corpuri</h5>
    <hr align="left" size="1" width="200">
<s:form action="add_corp" method="post">
	<s:textfield name="corpuri_de_iluminat.producator" label="Producator"/>
	<s:textfield name="corpuri_de_iluminat.montaj" label="Montaj"/>
	<s:textfield name="corpuri_de_iluminat.tip_corp" label="Tip corp"/>
	<s:textfield name="corpuri_de_iluminat.tip_lampa" label="Tip lampa"/>
	<s:textfield name="corpuri_de_iluminat.putere_lampa" label="Putere lampa"/>
	<s:textfield name="corpuri_de_iluminat.numar_lampi" label="Nr lampi"/>
	<s:textfield name="corpuri_de_iluminat.temperatura_de_culoare" label="Temperatura de culoare"/>
	<s:textfield name="corpuri_de_iluminat.indice_redare_culoare" label="Indice redare culoare"/>
	<s:textfield name="corpuri_de_iluminat.flux_lampa" label="Flux lampa"/>
	<s:textfield name="corpuri_de_iluminat.durata_de_functionare" label="Darata de funct"/>
	<s:textfield name="corpuri_de_iluminat.eficacitate_luminoasa" label="Eficacitate luminoasa"/>
	<s:textfield name="corpuri_de_iluminat.luminanta" label="Luminanta"/>
	<s:textfield name="corpuri_de_iluminat.lungime_corp" label="Lungime corp"/>
	<s:textfield name="corpuri_de_iluminat.latime_corp" label="Latime corp"/>
	<s:textfield name="corpuri_de_iluminat.diametru_corp" label="Diametru corp"/>
	<s:textfield name="corpuri_de_iluminat.inaltimea_de_suspendare" label="Inaltime de suspendare"/>
	<s:textfield name="corpuri_de_iluminat.grad_protectie" label="Grad protectie"/>
	<s:textfield name="corpuri_de_iluminat.destinatii" label="Destinatii"/>
	<s:submit value="Adauga" align="center"/>
</s:form>
   

	</div>
</div> 

</body>
</html>