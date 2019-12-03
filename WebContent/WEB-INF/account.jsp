<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicons -->
<link rel="icon" type="image/png" href="/workflow/assets/images/favicon.png" />

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Roboto:100,300,400,500,700|Philosopher:400,400i,700,700i"
	rel="stylesheet">

<!-- Bootstrap css -->
<!-- <link rel="stylesheet" href="css/bootstrap.css"> -->
<link href="/workflow/assets/index/bootstrap.min.css" rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="/workflow/assets/index/font-awesome.min.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="/workflow/assets/index/style.css" rel="stylesheet">
</head>
<body>
	
	<header id="header" class="header header-hide">
		<div class="container">

			<div id="logo" class="pull-left">
				<h1>
					<a href="#body" class="scrollto"><span>W</span>orkFlow</a>
				</h1>
				<!-- Uncomment below if you prefer to use an image logo -->
				<!-- <a href="#body"><img src="img/logo.png" alt="" title="" /></a>-->
			</div>

			<nav id="nav-menu-container">
				<ul class="nav-menu">
					<li class="menu-active"><a href="#hero">Home</a></li>
					<li><a href="#about-us">About</a></li>
					<li><a href="#team">Team</a></li>
					<li><a href="#contact">Contact</a></li>
					<li><a href="#login">Login</a></li>
					<li><a href="auth/account">Register</a></li>
				</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</header>
	
		 <div class="hero-container">
			
		<img src="/workflow/assets/images/hero-img.png" alt="Hero Imgs" style="float:left;padding-top:10%;">
		</div>
		
	<!--========================= Create Account Form ==========================-->
		
	
		<section id="contact" class="padd-section wow fadeInUp" style="padding-left: 30%;float:top;" >

		<div class="container">
			<div class="section-title text-center">
				<h2><b>Create Account</b></h2>
		
			</div>
		</div>

		<div class="container">
			<div class="row justify-content-center">

			<!-- 	<div class="col-lg-3 col-md-4">
					
				</div>
-->
	<div class="col-lg-5 col-md-8">
		<div class="form">
			<div id="sendmessage">Account Created </div>
			<div id="errormessage"></div>
				<form action="/workflow/auth/account" method="post" role="form" class="contactForm">
				<div class="form-group">
					<input type="text" name="companyName" class="form-control" id="companyName"
					placeholder="Company Name" data-rule="minlen:4"
					data-msg="Please enter at least 4 chars" />
				<div class="validation"></div>
				</div>
				<div class="form-group">
					<input type="email" class="form-control" name="primaryAdminEmail" 
					id="primaryAdminEmail" placeholder="Primary Admin Email" data-rule="email"
					data-msg="Please enter a valid email" />
				<div class="validation"></div>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="password" 
					id="password" placeholder="Password" data-rule="password"
					data-msg="Please enter a valid password" />
				<div class="validation"></div>
				</div>
				<!-- <div class="form-group">
					<input type="file" name="CompanyLogo" id="file"/> 
					<input type="text" class="form-control" name="subject"
					id="subject" placeholder="Subject" data-rule="minlen:4"
					data-msg="Please enter at least 8 chars of subject" />
					<div class="validation"></div>
				</div> -->
				<div class="form-group">
					<input type="text" class="form-control" name="companyLogoPath"
					id="companyLogoPath" placeholder="Company Logo Path" data-rule="email"
					data-msg="Please enter a valid email" />
				<div class="validation"></div>
				</div>
				<div class="form-group">
					<input type="number" class="form-control" name="maxUser"
					id="maxUser" min="1" placeholder="Maximum User" data-rule="email"
					data-msg="Please enter a valid number" />
				<div class="validation"></div>
				</div>
				<div class="text-center">
					<button type="submit"> Submit </button>
					<button type="submit"> Personal Account </button>
				</div>
			</form>
		</div>
	</div>
</div>
</div>
	
	<!-- Create Account Form -->

</body>
</html>