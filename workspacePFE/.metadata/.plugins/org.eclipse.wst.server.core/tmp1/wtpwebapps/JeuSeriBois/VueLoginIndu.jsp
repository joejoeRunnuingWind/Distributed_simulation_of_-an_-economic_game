<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Login Industriel</title>
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
			<div id="head-1"> <img src="images\bg.jpeg" alt=""></div>
			
			<h1><span class="logo"><span class="top">Top</span><span class="gadgets">Filière Bois</span></span></h1>
			<div id="navb">
			  <ul>
				  <li><a href="Index.jsp">HOME</a></li>
				  <li><a href="">CONTACT</a></li>
				</ul>
			</div>
		</div>
		<div id="head-2"></div>
		<div id="login">
			<div id="login-bot">
				<div id="login-box">
					<form name="client" method="post" action="LoginIServlet"> >
						<div id="login-username">
							<div><label for="username">Adresse Mail</label>: <input name="adresseM"type="text" /></div>
							<div><label for="password">password</label>: <input name="cle"type="text" /></div>
						</div>
						<div id="login-button">
							<input type="image" src="images/btn_login.gif" name="l" value="h" id="l" />
						</div>
					</form>
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
