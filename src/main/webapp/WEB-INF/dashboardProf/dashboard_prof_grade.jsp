<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List,com.grh.beans.Grade" %>
    <% List<Grade> grades = (List)request.getAttribute("grades"); %>
<!DOCTYPE html>
<html>
<head>
<%@include file="head_side_menu.jsp" %>

	<title>Grade</title>

<script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<%@include file="body_side_menu.jsp" %>

<%--mettez le centenu ici --%>

<div class="container" style="background: #fff ;">
	<div class="row">
		<div class="span5">
            <table class="table table-striped table-condensed">
                  <thead>
                  <tr>
                      <th>Cadre Grade</th>
                      <th>Grade</th>
                      <th>Echelon</th>                                          
                  </tr>
              </thead>   
              <tbody>
              <%for(Grade grade : grades){ %>
                <tr>
                    <td><%= grade.getCadreGrade() %></td>
                    <td><%= grade.getGrade() %></td>
                    <td><%= grade.getEchelon() %></td>
                    </td>                                       
                </tr>
                <%} %>
              
                                           
              </tbody>
            </table>
            </div>
<%-- --%>

<%@include file="footer_side_menu.jsp" %>

</body>
</html>