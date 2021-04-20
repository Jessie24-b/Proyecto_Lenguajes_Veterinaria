<%-- 
    Document   : table_employee
    Created on : 20/04/2021, 12:09:10 AM
    Author     : jennifer Granados M
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table class="table table-bordered" width="100%">
    <thead>
        <tr>
            <th scope="col" >Cédula</th>
            <th  scope="col">Nombre</th>
            <th  scope="col">Apellido</th>
            <th  scope="col">Carnet</th>
            <th  scope="col">Detalles</th>
            <th  scope="col">Editar</th>
            <th scope="col">Eliminar</th>
        </tr>
    </thead>
    <tbody>

    <c:forEach items="${employee}" var="em">
        <tr> 
            <td><c:out value="${em.id}"/></td>
            <td><c:out value="${em.name}"/></td>
            <td><c:out value="${em.lastName}"/></td>
            <td><c:out value="${em.carnet}"/></td>
            <td><button type="button" class="btn btn-success">Detalle</button></td>
            <td><button type="button" class="btn btn-warning">Editar</button> </td>
            <td><button type="button" class="btn btn-danger">Eliminar</button></td>
        </tr>
    </c:forEach>

</tbody>
</table>