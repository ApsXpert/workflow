<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PM Hub</title>
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
					<li><a href="auth/login">Login</a></li>
					<li><a href="auth/AccountServlet">Register</a></li>
				</ul>
			</nav>
			<!-- #nav-menu-container -->
		</div>
	</header>
	<!-- #header -->

	<!--==========================
    Hero Section
  ============================-->
	<section id="hero" class="wow fadeIn">
		<div class="hero-container">
			<br>
			<h2>Elegant project management solution</h2>
			<img src="/workflow/assets/images/hero-img.png" alt="Hero Imgs"> <a
				href="#get-started" class="btn-get-started scrollto">Get Started</a>
		</div>
	</section>
	<section id="contact" class="padd-section wow fadeInUp">

		<div class="container">
			<div class="section-title text-center">
				<h2>Contact</h2>
				<p class="separator">Sed ut perspiciatis unde omnis iste natus
					error sit voluptatem accusantium doloremque</p>
			</div>
		</div>

		<div class="container">
			<div class="row justify-content-center">

				<div class="col-lg-3 col-md-4">

					<div class="info">
						<div>
							<i class="fa fa-map-marker"></i>
							<p>
								A108 Adam Street<br>New York, NY 535022
							</p>
						</div>

						<div class="email">
							<i class="fa fa-envelope"></i>
							<p>info@example.com</p>
						</div>

						<div>
							<i class="fa fa-phone"></i>
							<p>+1 5589 55488 55s</p>
						</div>
					</div>

					<div class="social-links">
						<a href="#" class="twitter"><i class="fa fa-twitter"></i></a> <a
							href="#" class="facebook"><i class="fa fa-facebook"></i></a> <a
							href="#" class="instagram"><i class="fa fa-instagram"></i></a> <a
							href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
						<a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
					</div>

				</div>

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

	<!--==========================
    Footer
  ============================-->
	<footer class="footer">
		<div class="container">
			<div class="row">

				<div class="col-md-12 col-lg-4">
					<div class="footer-logo">

						<a class="navbar-brand" href="#">PM Hub</a>
						<p>Lorem Ipsum is simply dummy text of the printing and
							typesetting industry. Lorem Ipsum has been the industry's
							standard dummy text ever since the.</p>

					</div>
				</div>

				<div class="col-sm-6 col-md-3 col-lg-2">
					<div class="list-menu">

						<h4>Abou Us</h4>

						<ul class="list-unstyled">
							<li><a href="#">About us</a></li>
							<li><a href="#">Features item</a></li>
							<li><a href="#">Live streaming</a></li>
							<li><a href="#">Privacy Policy</a></li>
						</ul>

					</div>
				</div>

				<div class="col-sm-6 col-md-3 col-lg-2">
					<div class="list-menu">

						<h4>Abou Us</h4>

						<ul class="list-unstyled">
							<li><a href="#">About us</a></li>
							<li><a href="#">Features item</a></li>
							<li><a href="#">Live streaming</a></li>
							<li><a href="#">Privacy Policy</a></li>
						</ul>

					</div>
				</div>

				<div class="col-sm-6 col-md-3 col-lg-2">
					<div class="list-menu">

						<h4>Support</h4>

						<ul class="list-unstyled">
							<li><a href="#">faq</a></li>
							<li><a href="#">Editor help</a></li>
							<li><a href="#">Contact us</a></li>
							<li><a href="#">Privacy Policy</a></li>
						</ul>

					</div>
				</div>

				<div class="col-sm-6 col-md-3 col-lg-2">
					<div class="list-menu">

						<h4>Abou Us</h4>

						<ul class="list-unstyled">
							<li><a href="#">About us</a></li>
							<li><a href="#">Features item</a></li>
							<li><a href="#">Live streaming</a></li>
							<li><a href="#">Privacy Policy</a></li>
						</ul>

					</div>
				</div>

			</div>
		</div>

		<div class="copyrights">
			<div class="container">
				<p>&copy; Copyrights eStartup. All rights reserved.</p>
				<div class="credits">
					Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
				</div>
			</div>
		</div>

	</footer>
	<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
</body>
</html>