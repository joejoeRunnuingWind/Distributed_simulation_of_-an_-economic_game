<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Out</title>
</head>
<body>
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
			<h1><span class="logo"><span class="top">top</span><span class="gadgets">Fili�re Bois</span></span></h1>
			<div id="navb">
			  <ul>
				  <li><a href="Index.jsp">HOME</a></li>
				  <li><a href="">CONTACT</a></li>
				</ul>
			</div>
		</div>
		<% session.invalidate(); %>
		<center><font size=6>Log out</font></center>
		<div id="login">
			<div id="login-bot">
				<div id="login-box">
					
						<div id="login-username">
						<div><a href="Index.jsp" >Log In</a></div>
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
</div>

</body>
</html>
