<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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


<title>Login</title>
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
					<li><a href="#contact">Register</a></li>
				</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</header>
	<!-- #header -->



	
		<section id="contact" class="padd-section wow fadeInUp">

		<div class="container">
			<div class="section-title text-center">
				<h2><b>Login</b></h2>
		
			</div>
		</div>

		<div class="container">
			<div class="row justify-content-center">

			<!-- 	<div class="col-lg-3 col-md-4">
					
				</div>
-->
				<div class="col-lg-5 col-md-8">
					<div class="form">
						<div id="sendmessage">Your message has been sent. Thank you!</div>
						<div id="errormessage"></div>
						<form action="" method="post" role="form" class="contactForm">
							<div class="form-group">
								<input type="text" name="name" class="form-control" id="name"
									placeholder="Your Name" data-rule="minlen:4"
									data-msg="Please enter at least 4 chars" />
								<div class="validation"></div>
							</div>
							<div class="form-group">
								<input type="email" class="form-control" name="email" id="email"
									placeholder="Your Email" data-rule="email"
									data-msg="Please enter a valid email" />
								<div class="validation"></div>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="subject"
									id="subject" placeholder="Subject" data-rule="minlen:4"
									data-msg="Please enter at least 8 chars of subject" />
								<div class="validation"></div>
							</div>
							<div class="form-group">
								<textarea class="form-control" name="message" rows="5"
									data-rule="required" data-msg="Please write something for us"
									placeholder="Message"></textarea>
								<div class="validation"></div>
							</div>
							<div class="text-center">
								<button type="submit">Send Message</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- #contact -->
</body>
</html>