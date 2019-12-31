<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.grh.beans.Prof,java.util.List"  %>
    
    
    <% List<Prof> profs = (List)request.getAttribute("profs"); %>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>


	
	<link rel="stylesheet" href="./css/boit_dialogue_generer.css">
	<title>Prof</title>

</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>



	<div class="row" style="background : #fff ;">
		
        
        <div class="col-md-12">
        <div class="table-responsive">

                
              <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   
                   <!-- <th><input type="checkbox" id="checkall" /></th>-->
                   <th>SOM</th>
                   <th>First Name</th>
                    <th>Last Name</th>
                     <th>Address</th>
                     <th>Email</th>
                     <th>Contact</th>
                      <th>Edit</th>
                      
                       <th>Generer</th>
                   </thead>
    <tbody>
    <%for(Prof prof : profs){ %>
 <tr>
    <!-- <td><input type="checkbox" class="checkthis" /></td>-->
    <td><%= prof.getSom() %></td>
    <td><%= prof.getPrenomProf() %></td>
    <td><%= prof.getNomProf() %></td>
    <td><%= prof.getAdresse() %></td>
    <td><%= prof.getEmailProf() %></td>
    <td><%= prof.getTelCasUrg() %></td>
    <td><p data-placement="top" data-toggle="tooltip"  title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
    <td><p data-placement="top" data-toggle="tooltip" title="generer" ><button class="generer btn btn-danger btn-xs" data-title="generer" data-id="<%= prof.getSom() %>" data-toggle="modal" data-target="#generer" ><span class="glyphicon glyphicon-file"></span></button></p></td>
 </tr>
 <%} %>
    </tbody>
        
</table>

<div class="clearfix"></div>

                
            </div>
            
        </div>
	</div>


<div class="modal fade" id="generer"  role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Génerer attestation</h4>
      </div>
        
      
         
        <div class="modal-body">
            

          <div class="quiz">
           
           <label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           		<a class="url-target" href="/gestionRH/Generer?type=attestation&name=attestation_conge.jsp&som=">Attestation congé </a>
           </label>
          
           <label class="element-animation2 btn btn-lg btn-primary btn-block">
           		<span class="btn-label">
           			<i class="glyphicon glyphicon-chevron-right"></i>
           		</span> <a class="url-target" href="/gestionRH/Generer?type=attestation&name=attestation_travail.jsp&som=">Attestation de travail</a>
           	</label>
          
          <label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=attestation&name=order_mission.jsp&som=">Ordre de mission</a>
           	</label>
           	
           	
           	
           <label class="element-animation4 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span>
           		<a class="url-target" href="/gestionRH/Generer?type=attestation&name=quitte_territoire.jsp&som=">Quitter térritoire</a>
           </label>
           
           <label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=demande&name=demande_attestation_travail.jsp&som=">Demande Attestation de Travail</a>
           	</label>
           	
           	<label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=demande&name=demande_attestation_salaire.jsp&som=">Demande Attestation de Salaire</a>
           	</label>
           	
           	<label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=demande&name=demande_quitter.jsp&som=">Demande Attestation de Quitte de Téritoire</a>
           	</label>
           	<label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=recu&name=recu_medical.html&som=">Reçu Medical</a>
           	</label>
           	
           	<label class="element-animation1 btn btn-lg btn-primary btn-block">
           	<span class="btn-label">
           		<i class="glyphicon glyphicon-chevron-right"></i>
           	</span>
           <a class="url-target" href="/gestionRH/Generer?type=recu&name=recu_document.html&som=">Reçu Document</a>
           	</label>
       </div>
   </div>
</div>
</div>


          
</div>        
    <!-- /.modal-content --> 
      <!-- /.modal-dialog --> 
    
    
    <!-- boit dialoge de editer -->
    <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
       
      </div>
      <div class="modal-body">
      <!-- formulaire de moification -->
      	<form class="form-horizontal" role="form">
      	 
                <h2>Modifier Professeur</h2>
                
                
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="nom"> Nom</label>
                    
                    
                    
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="Nom" class="form-control" autofocus>
                       
                    </div>
                    
                </div>
                
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="nom"> Prénom</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="prenom" class="form-control" autofocus>
                    </div>
                    </div>
                     <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="som"> SOM</label>
                    <div class="col-sm-9">
                        <input type="number" id="firstName" placeholder="Som" class="form-control" autofocus>
                    </div>
                    </div>
                     <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="grade"> Grade</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="grade" class="form-control" autofocus>
                    </div>
                    </div>
                     <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="dateRecrutement"> Date de Recrutement</label>
                    <div class="col-sm-9">
                        <input type="date" id="firstName" placeholder="dateRecrutement" class="form-control" autofocus>
                    </div>
                    </div>
                     <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label" name="cin">CIN</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="cin" class="form-control" autofocus>
                    </div>
                    </div>
           
             
                <div class="form-group">
                    <label for="country" class="col-sm-3 control-label">Etat Civile</label>
                    <div class="col-sm-9">
                        <select id="country" class="form-control">
                            <option>Marié</option>
                            <option>Célibataire</option>
                            <option>Divorvé</option>
                            
                        </select>
                    </div>
                </div> 

        <div class="modal-footer ">
        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Modifier</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span>Anuller</button>
      </div>
      </form> 
      
        </div>
        </div>
        </div>
        </div>
    <!-- /.modal-content --> 

<!--  -->


<%@include file="footer_side_menu.jsp" %>

 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>

  <script type="text/javascript"> 

  function replaceUrlParam(url, paramName, paramValue)
  {
      if (paramValue == null) {
          paramValue = '';
      }
      var pattern = new RegExp('\\b('+paramName+'=).*?(&|#|$)');
      if (url.search(pattern)>=0) {
          return url.replace(pattern,'$1' + paramValue + '$2');
      }
      url = url.replace(/[?#]$/,'');
      return url + (url.indexOf('?')>0 ? '&' : '?') + paramName + '=' + paramValue;
  }
 
  $(document).on("click", ".generer", function () {
	     var som = $(this).data("id");
	     $('.url-target').each(function(){ 
	            var oldUrl = $(this).attr("href"); // Get current url
	            $(this).attr("href",replaceUrlParam(oldUrl,'som',som) ); // Set herf value
	         	});
	     
	});
</script>
<!--  script pour boit e dialogue -->


</script>
</body>
</html>