<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>


	<!-- Font Icon -->
    <link rel="stylesheet" href="./fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="./css/ajouter_filiere.css">
    <title>Ajouter une filière</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="./fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="./css/ajouter_filiere.css">
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>


 <div class="main" >
        <div class="container" >
            <div class="signup-content">
                <div class="signup-form">
                    <form method="POST" class="register-form" id="register-form">
                        <h2>Ajouter une filière</h2>
                        <div class="form-group">       
                            <label for="id"> Nom de filière :</label>
                            <input type="text" name="id" id="id" required/>
                        </div>
                        <div class="form-radio">
                            <label for="Genre" class="radio-label">Type de formation :</label>
                            <div class="form-radio-item">
                                <input type="radio" name="Genre" id="Initiale" checked>
                                <label for="Initiale">Initiale</label>
                                <span class="check"></span>
                            </div>
                            <div class="form-radio-item">
                                <input type="radio" name="Genre" id="Continue">
                                <label for="Continue">Continue</label>
                                <span class="check"></span>
                            </div>
                            </div>
                        <div>
                        <select name="Niveau">
                          <option value="Licence fondamentale">Licence fondamentale</option>
                          <option value="Licence professionnelle">Licence professionnelle</option>
                          <option value="Master fondamental">Master fondamental</option>
                          <option value="Master professionnel">Master professionnel</option>
                          <option value="Master  de recherche">Master  de recherche</option>
                          <option value="Cycle ingénieur">Cycle ingénieur</option>
                          <option value="années préparatoires">Années préparatoires</option>
                          <option value="Doctorat">Doctorat</option>
                          <option value="autre">autre</option>
                        </select>
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom1">Nom du chef de filière:</label>
                                <input type="text" name="Nom1" id="Nom1" required/>
                            </div>
                            <div class="form-group">
                                <label for="Prénom1">Prénom du chef de filière :</label>
                                <input type="text" name="Prénom1" id="Prénom1" required/>
                            </div>
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