<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>

	<title>Insert title here</title>
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
                        <h2>Ajouter un Professeur</h2>
                            <div class="form-group">       
                            <label for="id"> SOM :</label>
                            <input type="text" name="id" id="id" required/>
                        </div>
                        <div class="form-row">
                        <div class="form-group">
                                <label for="Nom">Nom :</label>
                                <input type="text" name="Nom" id="Nom" required/>
                            </div>
                            <div class="form-group">
                                <label for="Prénom">Prénom :</label>
                                <input type="text" name="Prénom" id="Prénom" required/>
                            </div>
                        </div>
                         <div class="form-row">
                        <div class="form-group">
                                <label for="date de naissance">Date de naissance :</label>
                                <input type="text" name="date de naissance" id="date de naissance" required/>
                            </div>
                            <div class="form-group">
                                <label for="Lieu">Lieu :</label>
                                <input type="text" name="Lieu" id="Lieu" required/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="adresse">Adresse :</label>
                            <input type="text" name="adresse" id="adresse" required/>
                             <label for="tel">Tel :</label>
                            <input type="text" name="tel" id="tel" required/>
                             <label for="Contact">Contact en cas d'urgence :</label>
                            <input type="text" name="Contact" id="Contact" required/>
                        </div>
                        <div class="form-radio">
                            <label for="Genre" class="radio-label">Sex :</label>
                            <div class="form-radio-item">
                                <input type="radio" name="Genre" id="Homme" checked>
                                <label for="Homme">Homme</label>
                                <span class="check"></span>
                            </div>
                            <div class="form-radio-item">
                                <input type="radio" name="Genre" id="femme">
                                <label for="femme">Femme</label>
                                <span class="check"></span>
                            </div>
                            </div>
                            <div class="form-group">
                                <label for="nationalité">Nationalité :</label>
                                <input type="text" name="nationalité" id="nationalité" required/>
                            <label for="etat civil">Etat civil :</label>
                            <input type="text" name="etat civil" id="etat civil" required/>
                              <label for="fonction">Fonction :</label>
                              <input type="text" name="fonction" id="fonction" required/>
                              <label for="nbrEnfant">Nombre d'enfants :</label>
                              <input type="text" name="nbrEnfant" id="nbrEnfant" required/>
                            </div>
                        
                  
                        <div class="form-group">
                            <label for="Affectation">Affectation :</label>
                            <input type="text" name="Affectation" id="Affectation">
                        </div>
                        <div class="form-group">
                            <label for="codeAff">Code affectation :</label>
                            <input type="text" name="codeAff" id="codeAff">
                        </div>
                        
                        <div class="form-group">
                            <label for="email">Email :</label>
                            <input type="email" name="email" id="email" />
                            <label for="Photo">Photo :</label>
                            <input type="file"  accept="image/gif,image/jpg, image/jpeg, image/png" required name='img'/>
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
    <<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script >(function($) {

  $('#reset').on('click', function(){
      $('#register-form').reset();
  });

})(jQuery);</script>

<%-- --%>

<%@include file="footer_side_menu.jsp" %>

</body>
</html>