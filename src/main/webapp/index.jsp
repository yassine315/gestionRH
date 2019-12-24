<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">S'authentifier</h5>
						<form class="form-signin" method="post" action="/gestionRH/Login">
							<div class="form-label-group">
							<label
									for="inputEmail">Address Email</label>
								<input type="email" id="inputEmail" class="form-control"
									placeholder="Address Email" required autofocus> 
							</div>

							<div class="form-label-group">
							 <label
									for="inputPassword">Mot de passe</label>
								<input type="password" id="inputPassword" class="form-control"
									placeholder="Mot de pass" required>
							</div>

							<div >
								<p><a href="">mot de passe oublie</a></p>
							</div>
							<button class="btn btn-lg btn-primary btn-block text-uppercase"
								type="submit" >Sign in</button>
							<hr class="my-4">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>