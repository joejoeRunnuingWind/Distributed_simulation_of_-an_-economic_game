<%@page import="model.Commerce" %>

<%@page import="java.util.Vector"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bours Bois</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>

<% Vector<Commerce> commerceVector = (Vector<Commerce>) session.getAttribute("LCommerce");%>
<% String nomI = (String)session.getAttribute("adresseMI"); %>

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
			<h1><span class="logo"><span class="top">Votre Espace producteur</span><span class="gadgets">Filière Bois</span></span></h1>
			<div id="navb">
			  <ul>
				  <li><a href="Index.jsp">HOME</a></li>
				  <li><a href="">CONTACT</a></li>
				</ul>
			</div>
		</div>
	<div>
		<form id="myForm" method="get" action="CommerceIndoServlet">
			<table border="0.3px" style="margin: 0px auto;">
				<tr >
					<th>IdCommerce</th>
					<th>Nom Bois</th>
					<th>Prix</th>
					<th>Date disponible</th>
					<th>Temps Dure</th>
					<th>Nom producteur</th>
					<th>Vendu</th>
				</tr>

		<%
	
		if(commerceVector!=null)
			for(int i=0;i<commerceVector.size();i++){
		
			out.print("<tr>");
		
			out.print("<td>"+ commerceVector.get(i).getId() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getNomB() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getPrice() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getDate() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getDure() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getNomP() +"</td>");
			out.print("<td>"+ commerceVector.get(i).getVendu() +"</td>");
			if(commerceVector.get(i).getVendu().equals("non")){
			%>
			<td><a href="CommerceInfoServlet?nomI=<%out.print(nomI);%>&idC=<%out.print(commerceVector.get(i).getId());%>">buy</a></td>
		<% 
			}
		out.print("</tr>");
		
	}
	%>

	</table>
</form>
	</div>
		<div id="login">
			<div id="login-bot">
				<div id="login-box">
					
						<div id="login-username">
						<div><a href="EspaceInduServlet" >Retourner à votre espace</a></div>
						<div><a href="VueLoginOut.jsp" >Log Out</a></div>
						</div>
						
				</div>
				<div id="login-welcome">
					<div>
						<h2>Bienvenue sur FILIERE BOIS</h2>
						<p>Ce website est maintenu par FILIERE BOIS;
							et a &eacute;t&eacute; d&eacute;velopp&eacute; par FILIERE BOIS 
						</p>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		
</div>

</body>
</html>
