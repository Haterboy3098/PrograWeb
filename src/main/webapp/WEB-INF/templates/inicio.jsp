<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/x-icon" href="../images/logo.ico" />
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../css/inicio.css">
    <title>Aula Virtual</title>
</head>
<body>
    <div class="contenedor">
        <div class="opcion">
            <div class="caja">
                <div class="contenido">
                    <h2>AL</h2>
                    <h3>Alumno</h3>
                    <p>Si eres Alumno ingresa aquí</p>
                    <a href="./login/alumno">Ingresar</a>
                </div>
            </div>
        </div>
        <div class="opcion">
            <div class="caja">
                <div class="contenido">
                    <h2>PR</h2>
                    <h3>Profesor</h3>
                    <p>Si eres Profesor de algún curso ingresa aquí</p>
                    <a href="./login/profesor">Ingresar</a>
                </div>
            </div>
        </div>
        <div class="opcion">
            <div class="caja">
                <div class="contenido">
                    <h2>AD</h2>
                    <h3>Administrador</h3>
                    <p>Si eres Administrador ingresa aquí</p>
                    <a href="./login/admin">Ingresar</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>