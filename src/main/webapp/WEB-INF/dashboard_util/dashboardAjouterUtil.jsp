
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>

	<!-- Font Icon -->
    <link rel="stylesheet" href="./fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="./css/AjouterProf.css">
    
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>

    <div class="container-fluid" >
        <div class="container-fluid" >
            <div class="signup-content">
                <div class="signup-form">
                    <form method="POST"  id="register-form">
                        <h2>Ajouter un utilisateur</h2>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom">Nom :</label>
                                <input type="text" name="nomUt" id="Nom" required/>
                            </div>
                            <div class="form-group">
                                <label for="Pr�nom">Pr�nom :</label>
                                <input type="text" name="prenomUt" id="Pr�nom" required/>
                            </div>

                        </div>
                        <div class="form-group">
                            <label for="codeAff">CIN :</label>
                            <input type="text" name="cinUt" id="codeAff">
                        </div>

                        <div class="form-group">
                             <label for="tel">Tel :</label>
                            <input type="tel" name="telUt" id="tel" required/>
                        </div>
          
                        <div class="form-group">
                            <label for="email">Email :</label>
                            <input type="email" name="emailUt" id="email" />
                            
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="date de naissance">Mot de passe :</label>
                                <input type="pasword" name="mpUt" id="date de naissance" required/>
                            </div>
                            <div class="form-group">
                                <label for="Lieu">Confirmer Mot de passe  :</label>
                                <input type="password" name="Lieu" id="Lieu" required/>
                            </div>
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

    <!-- JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script >(function($) {

  $('#reset').on('click', function(){
      $('#register-form').reset();
  });

})(jQuery);</script>

<%-- --%>

<%@include file="footer_side_menu.jsp" %>

</body>
</html>