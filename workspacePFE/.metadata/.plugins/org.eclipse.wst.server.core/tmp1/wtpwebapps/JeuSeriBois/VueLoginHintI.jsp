<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login en cours</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>

<% int flagI = (int) session.getAttribute("flagI"); %>
<div id="outer">
	<div id="wrapper">
		<div id="nav">
		  <div id="nav-left">
		    <div id="nav-right">
    			<ul>
    			  <li><a href=>ABOUT US</a></li>
    			  <li><a href=>PRODUCTS</a></li>
    			  <li><a href=>SERVICES</a></li>
    			  <li><a href=>SHOPPING CART</a></li>
    			  <li><a href=>NEW GADGETS</a></li>
    			  <li><a href=>REGISTER</a></li>
    			</ul>
		    </div>
		  </div>
			<div class="clear"></div>
		</div>
		<div id="head">
			<div id="head-left"></div>
			<div id="head-right"> </div>			
			<h1><span class="logo"><span class="top">top</span><span class="gadgets">Filière Bois</span></span></h1>
			<div id="navb">
			  <ul>
				  <li><a href="Index.jsp">HOME</a></li>
				  <li><a href="">CONTACT</a></li>
				</ul>
			</div>
		</div>
		<% switch(flagI){
			case 0:
		%>
		<font size=0.1>-_-!!</font>
     <center><font size=6>Adresse Mail Inconnu!</font></center>
     <%break; 

	case 1:
	%>
	<font size=0.1>-_-!!</font>

		<center><font size=6>Mot de Passe Incorrect!</font></center>
	<%break; 

	case 2:
	%>
		<font size=0.1>-_-!!</font>
	<center><font size=6>Login en cours!</font></center>
	<%	response.setHeader("Refresh","2;URL=EspaceInduServlet"); %>
	<%break; 
} %>
		
</div>

</body>
</html>