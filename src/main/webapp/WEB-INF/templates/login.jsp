<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <link rel="shortcut icon" type="image/x-icon" href="../img/logo.ico" />
    <link rel="stylesheet" href="../css/login.css">
    <title>Pagina</title>
</head>
<body>
    <section>
        <div class="imagen">
            <img src="../images/bg.jpg" alt="imagen">
        </div>
        <div class="contenido">
            <div class="contenedor">
                <h2>Login</h2>
                <form action="">
                    <div class="input-box">
                        <label for="usuario">Usuario</label>
                        <input type="text" id="usuario" name="usuario" required="">
                    </div>
                    <div class="input-box">
                        <label for="pass">Contraseña</label>
                        <input type="password" id="pass" name="pass" required="">
                    </div>
                    <div class="input-box">
                        <input type="submit" value="Ingresar">
                    </div>
                    <div class="input-box enlaces">
                        <!-- Modificar estos textos segun enlace presionado -->
                        <c:if test="${tipoUsuario == 'admin'}">
                            <a href="./alumno">Eres Alumno?</a>
                            <a href="./profesor">Eres Profesor?</a>
                        </c:if>
                        <c:if test="${tipoUsuario == 'alumno'}">
                            <a href="./admin">Eres Admin?</a>
                            <a href="./profesor">Eres Profesor?</a>
                        </c:if>
                        <c:if test="${tipoUsuario == 'profesor'}">
                            <a href="./alumno">Eres Alumno?</a>
                            <a href="./admin">Eres Admin?</a>
                        </c:if>
                    </div>
                </form>

            </div>
        </div>
    </section>

</body>
</html>