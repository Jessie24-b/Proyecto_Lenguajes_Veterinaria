<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">


            <div class="row justify-content-evenly">
                <div class="col-8">

                    <div class="row justify-content-evenly">

                        <!-- Carta de mascota -->
                        <c:forEach var="register" items="${register}">

                            <div class="card"  style="width: 15em;">
                                <img src="https://i.blogs.es/594843/chrome/450_1000.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">
                                        ${register.animal.name}
                                    </h5>
                                    <p class="card-text">
                                        ${register.animal.specie}.
                                    </p>
                                </div>

                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item">
                                        Raza: ${register.animal.breed}
                                    </li>
                                    <li class="list-group-item">
                                        Nacimiento: ${register.animal.born}
                                    </li>
                                </ul>

                                <div class="card-body">
                                    <div class="row">
                                        <a class="btn btn-primary" href="#" class="card-link">Detalles</a>
                                    </div>
                                </div>
                            </div>   

                        </c:forEach>
                        <!-- Carta de mascota -->

                        <div class="row justify-content-center">
                            <div class="col-6 row">
                                <a class="btn btn-primary">Registrar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
