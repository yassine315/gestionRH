<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <div class="wrapper">
            <!-- Sidebar Holder -->
            <nav id="sidebar">
                <div class="sidebar-header">
                    <h3><a href="http://localhost:8080/gestionrh1/tamplate_principale.jsp">ENSAM admin</a></h3>
                </div>

                <ul class="list-unstyled components">
                    <p>Adminestrer</p>
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">Proffesseurs</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li><a href="#">Ajouter</a></li>
                            <li><a href="#">Servire</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Filieres</a>
                    </li>
                    <li class="active">
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false">Utilisateurs</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="#">Creer</a></li>
                            <li><a href="#">Gerer</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">chi haja</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>

                <ul class="list-unstyled CTAs">
                    <li><a href="#" class="download">button</a></li>
                    <li><a href="#" class="article">Deconnecter</a></li>
                </ul>
            </nav>

            <!-- Page Content Holder -->
            <div id="content">

                <nav class="navbar navbar-default">
                    <div class="container-fluid">

                        <div class="navbar-header">
                            <button type="button" id="sidebarCollapse" class="btn btn-info navbar-btn">
                                <i class="glyphicon glyphicon-align-left"></i>
                                <span>changer</span>
                            </button>
                        </div>

                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
             </div>