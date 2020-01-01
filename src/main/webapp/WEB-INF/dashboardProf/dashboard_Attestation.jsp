<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

</html>
	<%@include file="head_side_menu.jsp" %>
	<link rel="stylesheet" href="./css/attestation.css">
	
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>

<section class="pricing py-5">
  <div class="contenir" >
    <div class="row">
      <!-- Free Tier -->
      <div class="col-lg-4">
        <div class="card mb-5 mb-lg-0">
          <div class="card-body">
            <h6 class="card-price text-center">Attestation de conge</h6>
            <form class="form" action="./grh_attestation/attestation_conge.html" method="post">
            	<label for="som">SOM :</label><br/>
            	<input type="number" id="som" name="som" />
            	<button  type="submit" class="btn btn-block btn-primary text-uppercase">Generer</button>
            </form>
            
          </div>
        </div>
      </div>
      <!-- Plus Tier -->
      <div class="col-lg-4">
        <div class="card mb-5 mb-lg-0">
          <div class="card-body">
           <h6 class="card-price text-center">Attestation de travail</h6>
            <form class="form" action="./grh_attestation/attestation_travail.jsp" method="get">
            	<label for="som">SOM :</label><br/>
            	<input type="number" id="som" name="som" />
            	<button  type="submit" class="btn btn-block btn-primary text-uppercase">Generer</button>
            </form>
        </div>
      </div>
      </div>
      <!-- Pro Tier 
      <div class="col-lg-4">
        <div class="card mb-5 mb-lg-0">
          <div class="card-body">
          <h6 class="card-price text-center">Conge</h6>
            <form class="form" action="./grh_attestation.jsp" method="">
            	<label for="som">SOM :</label><br/>
            	<input type="number" id="som" name="som" />
            	<button  type="submit" class="btn btn-block btn-primary text-uppercase">Generer</button>
            </form>
          <!-- 
            <h5 class="card-title text-muted text-uppercase text-center">Pro</h5>
            <h6 class="card-price text-center">$49<span class="period">/month</span></h6>
            <hr>
            <ul class="fa-ul">
              <li><span class="fa-li"><i class="fas fa-check"></i></span><strong>Unlimited Users</strong></li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>150GB Storage</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>Unlimited Public Projects</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>Community Access</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>Unlimited Private Projects</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>Dedicated Phone Support</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span><strong>Unlimited</strong> Free Subdomains</li>
              <li><span class="fa-li"><i class="fas fa-check"></i></span>Monthly Status Reports</li>
            </ul>
            <a href="#" class="btn btn-block btn-primary text-uppercase">Button</a>
         
          </div>
        </div>
      </div>-->
    </div>
  </div>
</section>

<%--mettez le centenu ici --%>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src=""></script>

<%@include file="footer_side_menu.jsp" %>

</body>
</html>