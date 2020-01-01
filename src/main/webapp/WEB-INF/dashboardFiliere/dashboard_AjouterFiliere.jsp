<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.grh.beans.Prof,java.util.List"  %>
        <% List<Prof> profs = (List)request.getAttribute("profs"); %>
    
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

<<<<<<< HEAD
 <div >
        <div class="container-fluid" >
            <div class="signup-content">
                <div class="signup-form">
                    <form action="/gestionRH/AjouterFiliere" method="POST" class="register-form" id="register-form">
                        <h2>Ajouter une filière</h2>
                        <div class="form-group">       
                            <label for="id"> Nom de filière :</label>
                            <input type="text" name="nomFiliere" id="id" required/>
                        </div>
                            
                        <div "form-group">
                        <label>Formation pour :</label>
                        <select name="formation" class="form-group">
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
                        
                          <div>
                          <label>Responsable :</label>
                        <select name="idProf" class="form-group">
                        <%for(Prof prof : profs){ %>
                          <option value="<%= prof.getIdProf() %>"><%= prof.getSom()+" "+prof.getNomProf()+" "+prof.getPrenomProf() %></option>
                        <%} %>
                        </select>
                        </div>
                       
                    
                            <div class="form-group">
                                <label for="date de création">date de création:</label>
                                <input type="date" name="creatDate">
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

})(jQuery);</script><%-- --%>

<%@include file="footer_side_menu.jsp" %>

</body>
</html>