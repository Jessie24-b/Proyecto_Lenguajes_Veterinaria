<%-- 
    Document   : view_employee
    Created on : 19/04/2021, 10:39:39 PM
    Author     : jennifer Granados M
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">

    </head>
    <body>
        <br>
        <!--Deberiamos tener el mismo nav -->

        <div class="container">

            <h3> Listado de Empleados</h3>
            <br/>
            <div class="mb-1 p-1 ">
                <div class="form-row">
                    <div class="form-group col-md-12">
                        <form  action="https://translate.google.com/">
                            <button type="submit" class="btn btn-primary btn-lg">Agregar</button>
                        </form> 
                        <br/>
                        <form class="d-flex">
                            <select name="cx" class="custom-select col-md-2" id="inputGroupSelect01">
                                <option value="cedula">Cédula</option>
                                <option value="nombre" >Nombre</option>
                                <option  value="apellido">Apellido</option>
                                <option  value="carnet">Carnet</option>                                
                            </select>
                            <input class="form-control me-2 col-md-4" type="search" placeholder="nombre" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Buscar</button>
                        </form>
                    </div>
                </div>
            </div>

            <div id="table">
                <%@include file="table_employee.jsp" %>
            </div>

        </div>
           

    </body>
</html>
