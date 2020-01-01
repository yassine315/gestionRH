<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>

	<title>Ajouter un département</title>
    <link rel="stylesheet" href="./css/ajouter_departement.css">
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>
    <div class="main" >
        <div class="container" >
            <div class="signup-content">
                <div class="signup-form">
                    <form method="POST" class="register-form" id="register-form">
                        <h2>Ajouter un département</h2>
                        <div class="form-group">       
                            <label for="id"> Nom du département :</label>
                            <input type="text" name="id" id="id" required/>
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom1">Nom du chef de département:</label>
                                <input type="text" name="Nom1" id="Nom1" required/>
                            </div>
                            <div class="form-group">
                                <label for="Prénom1">Prénom du chef de département :</label>
                                <input type="text" name="Prénom1" id="Prénom1" required/>
                            </div>
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom2">Nom du coordonnateur filière:</label>
                                <input type="text" name="Nom2" id="Nom2" required/>
                            </div>
                            <div class="form-group">
                                <label for="Prénom2">Prénom du coordonnateur filière:</label>
                                <input type="text" name="Prénom2" id="Prénom2" required/>
                            </div>
                        </div>
                        <div class="form-group">
                            
                             <label for="Contact1">Tel du chef département :</label>
                            
                            <input type="text" name="Contact1" id="Contact1" required/>
                             <label for="Contact2">Tél. du coordonnateur filière :</label>
                            <input type="text" name="Contact2" id="Contact2" required/>
                        </div>
                            <div class="form-group">
                                <label for="date de création">date de création:</label>
                                <input type="date" name="creat_date">
                            </div>
                        
            
                        
                        <div class="form-group">
                            <label for="email">Email :</label>
                            <input type="email" name="email" id="email" />
                            <label for="url">Page :</label>
                            <input type="url" name="Site internet ">
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Annuler" class="submit" name="reset" id="reset" />
                            <input type="submit" value="Ajouter" class="submit" name="submit" id="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

<%@include file="footer_side_menu.jsp" %>

<!-- JS -->
    
    <script >(function($) {

  $('#reset').on('click', function(){
      $('#register-form').reset();
  });

})(jQuery);</script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>