<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="./bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container">
            <form method="get" action="#">
                <div class="row justify-content-center">
                    <div class="col-lg-6 col-md-8 border border-success px-5 py-2 rounded">

                        <div class="input-group mb-3">
                            <input type="file" name="photo" class="form-control">
                        </div>

                        <div class="form-floating mb-3">
                            <input type="name" class="form-control" id="text_name" name="pet_name" placeholder="Jhon Dowg">
                            <label for="text_name">Nombre</label>
                        </div>

                        <div class="row">
                            <label for="radio_m" class="form-label">Nacimiento</label>
                            <input type="date" name="born" class="form-control">
                        </div>

                        <div class="row">
                            <div class="col-sm">
                                <label for="combo_specie"  class="form-label"/>Especie</label>
                                <select id="combo_specie"  class="form-select" name="specie">
                                    <c:forEach var="specie" items="${species}">
                                        <option value=${specie}>
                                            ${specie}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>

                            <div class="col-sm">
                                <label for="combo_breed"  class="form-label"/>Raza</label>
                                <select id="combo_breed"  class="form-select"  name="breed">
                                    <c:forEach items='${breeds}' var="breed">
                                        <option value=${breed}>
                                            ${breed}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-check">
                            <label for="radio_m" class="form-check-label">Macho</label>
                            <input type="radio" name="gender" value="H" class="form-check-input" id="radio_m">
                        </div>

                        <div class="form-check">
                            <label for="radio_h" class="form-check-label">Hembra</label>
                            <input type="radio" name="gender" value="M"  class="form-check-input" id="radio_h">
                        </div>

                        <div class="row">
                            <div class="col">
                                <label class="form-label">Altura</label>
                                <div class="input-group mb-3">
                                    <input type="number" name="height" min="10" max="300" class="form-control">
                                    <span class="input-group-text">.cm</span>
                                </div>
                            </div>

                            <div class="col">
                                <label class="form-label">Peso</label>
                                <div class="input-group mb-3">
                                    <input type="number" name="weight" min="10" max="300" class="form-control">
                                    <span class="input-group-text">.kg</span>
                                </div>
                            </div>                  
                        </div>

                        <div class="form-check">
                            <input type="checkbox" id="neutered" name="neutered" class="form-check-input"/>
                            <label class="form-check-label" for="neutered">Está castrado</label>
                        </div>

                        <!-- Para trabajadores -->
                        <div class="form-check">
                            <label for="radio_a" class="form-check-label">Adopcion</label>
                            <input type="radio" name="type" value="A" class="form-check-input" id="radio_a">
                        </div>


                        <div class="form-check">
                            <label for="radio_v" class="form-check-label">Venta</label>
                            <input type="radio" name="type" value="V"  class="form-check-input" id="radio_v">
                        </div>
                        <!-- Para trabajadores -->

                        <div class="row">
                            <input type="submit" class="btn btn-primary">
                        </div>

                    </div>
                </div>
            </form>
        </div>
    </body>
</html>