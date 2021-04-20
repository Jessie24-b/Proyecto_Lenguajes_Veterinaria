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
        
        <div class="card"  style="width: 15em;">
            <img src="https://i.blogs.es/594843/chrome/450_1000.jpg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">
                    ${animal.name}
                </h5>
                <p class="card-text">
                    ${animal.specie}.
                </p>
            </div>

            <ul class="list-group list-group-flush">
                <li class="list-group-item">
                    Raza: ${animal.breed}
                </li>
                <li class="list-group-item">
                    Nacimiento: ${animal.born}
                </li>
            </ul>

            <div class="card-body">
                <div class="row">
                    <a class="btn btn-primary" href="#" class="card-link">Modificar</a>
                </div>
            </div>
        </div>   




        <div class="accordion accordion-flush" id="accordionFlushExample">
            <div class="accordion-item">
                <h2 class="accordion-header" id="flush-headingOne">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                        Servicios recibidos.
                    </button>
                </h2>
                <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                    <div class="accordion-body">


                        <div class="row">
                            <h2>Esto es un titulo</h2>
                            <p>Fecha: Servicio recibido</p>
                            <p>Esto es la descripcion del servicio.</p>   
                        </div>
                        <hr>
                        <div class="row" >
                            <h2>Esto es un titulo</h2>
                            <p>Esto es la descripcion del servicio.</p>   
                        </div>
                    </div>
                </div>
            </div>
        </div>


        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    </body>
</html>
