<%--
  Created by IntelliJ IDEA.
  User: cotep
  Date: 22-06-2023
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tienda</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<h1 align="center">Tienda Inmueble Tco<span class="badge bg-secondary">Bienvenido</span></h1>
<br/>
<div class="container">
    <div class="form sign-up-container">
        <!--Registro-->
        <h1>Inmueble</h1>
        <form class="formulario" action="indexServlet" method="post">
            <input type="text" placeholder="Tipo de  construccion" id="tipoC" name="tipoC">
            <input type="text" placeholder="Ciudad" id="ciudad" name="ciudad">
            <input type="email" placeholder="Dirección" id="direccion" name="direccion">
            <input type="number" placeholder="Precio" id="precio" name="precio">

            <a  class="ok-account" href="Einmueble.jsp">¿Deseas eliminar un inmueble?</a>
            <input type="submit" value="Revisar">
        </form>
    </div>
</div>
