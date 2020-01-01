<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>

    <title>Ajouter un Module</title>
<!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <!-- Main css -->
    <link rel="stylesheet" href="./css/ajoutermodule.css">
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>
 <div class="main" >
        <div class="container" >
            <div class="signup-content">
                <div class="signup-form">
                    <form method="POST" class="register-form" id="register-form">
                        <h2>Ajouter un Module</h2>
                        <div class="form-group">       
                            <label for="id"> Nom de Module :</label>
                            <input type="text" name="id" id="id" required/>
                        </div>
                        <div><label for="filière">Nom de filière :</label>
                                <input type="text" name="filière" id="filière" required/>
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom1">Nom du professeur :</label>
                                <input type="text" name="Nom1" id="Nom1" required/>
                            </div>
                            <div class="form-group">
                                <label for="Prénom1">Prénom du professeur :</label>
                                <input type="text" name="Prénom1" id="Prénom1" required/>
                            </div>
                        </div>
                    
                            <div class="form-group">
                                <label for="date de démarrage">date de démarrage:</label>
                                <input type="date" name="debut_date">
                            </div>
                            <div class="form-group">
                                <label for="date de fin">date de fin:</label>
                                <input type="date" name="finish_date">
                            </div>
                        <div class="form-group">
                            <label for="nbheure">Nombre de heures :</label>
                            <input type="number" name="nbheure" id="nbheure" />
                        </div>
                        
                        <div class="form-group">
                            <label for="email">Email :</label>
                            <input type="email" name="email" id="email" />
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