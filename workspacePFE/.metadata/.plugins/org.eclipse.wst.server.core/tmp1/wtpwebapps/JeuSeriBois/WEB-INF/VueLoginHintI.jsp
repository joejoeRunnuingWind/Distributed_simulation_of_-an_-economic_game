<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login en cours</title>
<link rel="stylesheet" type="text/css" href="./css/style3.css">
</head>
<body>


	<div id="liens-utiles">
					<div class='inner'>
	  	<p><a href='accueil.jsp'>Home Page</a></p>
						<ul>
				<li><a href="accueil.jsp" >Remove to home page</a></li>
				<li><a href="accueil.jsp" >Remove to home page</a></li>

			</ul>
					</div>
		</div>


<% int flagClient = (int) session.getAttribute("flagI"); %>

<% switch(flagClient){
	case 0:
%>

<font size=0.1>-_-!!</font>
     <center><b><font size=6>Adresse Mail Inconnu!</font></b></center>
<%
	case 1:
%>
<font size=0.1>-_-!!</font>
	<center><b><font size=6>Mot de Passe Incorrect!</font></b></center>

<%
	case 2:
%>
<font size=0.1>-_-!!</font>
	<center><b><font size=6>Login en cours!</font></b></center>
<%	response.setHeader("refresh","2;url = CommerceInfoServlet"); %>
<%} %>

		<div id="footer" class="inner">
			<p>
				<a href="accueil.jsp" >Return to home page</a> | 
				<a href="accueil.jsp" >Return to home page</a>
			</p>
		</div>

</body>
</html>