<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<link href='style.css' type='text/css' rel='stylesheet' /> 
<title>Upload</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
    	<div id="site_title"><h6><a href="panou_admin.jsp">Back</a></h6></div>
    </div>
<div id="content"> 
    	<div id="home">
     <form action="upload" method="post" enctype="multipart/form-data">
      <label for="myFile">Selectati fisierul</label>
      <input type="file" name="myFile" />
      <input type="submit" value="Upload"/>
   </form>
   <br/>
   <form action="delete_up" method="post" enctype="multipart/form-data">
      <label for="myFile">Selectati fisierul</label>
      <input type="file" name="myFile" />
      <input type="submit" value="Delete"/>
   </form>
   
</div>
</div> 
</div>


</body>
</html>