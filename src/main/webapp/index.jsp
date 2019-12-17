<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Authentification</title>
<style>
h2 {
    font-family: Gill Sans, Verdana;
	font-size: 25px;
	color:#295694;
	margin-left: 170px;
}
 p{
  font-family: 'Open Sans', Arial, Helvetica, sans-serif;

}
body {
      background-image:url(./images/ensammbg.jpg);
	background-size:cover;
    background-repeat: no-repeat;
	height: 100%;}
</style>
</head>
<body>
<table>
	<tr>
		<td colspan="3"><img src="./images/ensambg.png" ></td>
		<td><p style="color: #3f4d66;"><h2>Gestion Ressources Humaines</h2></p></td>
		</tr>
		</table>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Sign In</h5>
						<form class="form-signin" method="post" action="/gestionRH/Login">
							<div class="form-label-group">
							<label
									for="inputEmail">Email address</label>
								<input type="email" id="inputEmail" class="form-control"
									placeholder="Email address" required autofocus> 
							</div>

							<div class="form-label-group">
							 <label
									for="inputPassword">Password</label>
								<input type="password" id="inputPassword" class="form-control"
									placeholder="Password" required>
							</div>

							<div >
								<p><a href="">mot de passe oublié</a></p>
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