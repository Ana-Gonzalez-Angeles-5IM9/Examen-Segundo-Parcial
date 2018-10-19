<%-- 
    Document   : Login
    Created on : 15/10/2018, 08:26:39 AM
    Author     : AnaGonzález
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="../css/login.css">
        <link type="text/css" rel="stylesheet" href="../css/styles.css">
        <link type="text/css" rel="stylesheet" href="../css/estilo.css">
        <title>Login</title>
    </head>
    <body>
        <div class="cont">
            <form method="post" name="Login" action="registro.jsp">
                <div class="form sign-in">
                    <h2>Bienvenido</h2>
                    <label>
                        <span>Email</span>
                        <input type="email" name="email">
                    </label>
                    <label>
                        <span>Contraseña</span>
                        <input type="password" name="password">
                    </label>
                    <p class="forgot-pass">¿Olvidaste tu contraseña?</p><br>
                    <input type="submit" class="submit" value="Entrar"><br>
                    <button type="button" class="fb-btn">Conectar con <span>facebook</span></button>
                </div>
            </form>
            <div class="sub-cont">
                <div class="img">
                  <div class="img__text m--up">
                    <h2>¿Eres nuevo?</h2>
                    <p>¡Registrate ahora!</p>
                  </div>
                  <div class="img__text m--in">
                    <h2>¿Ya tienes una cuenta?</h2>
                    <p>Si ya tienes una cuenta simplemente inicia sesión.</p>
                  </div>
                  <div class="img__btn">
                    <span class="m--up">Regístrate</span>
                    <span class="m--in">Iniciar sesión</span>
                    <script>
                        document.querySelector('.img__btn').addEventListener('click', function() {
                            document.querySelector('.cont').classList.toggle('s--signup');
                        });
                    </script>
                  </div>
            </div>
                <form method="post" name="Registro" action="RegistroUserServelet"
                    <div class="form sign-up">
                        <h2>Es momento de unirse</h2>
                        <label>
                            <span>Email</span>
                            <input type="email" name="usu"/>
                        </label>
                        <label>
                            <span>Contraseña</span>
                            <input type="password" name="pass">
                        </label><br>
                        <input type="submit" class="submit" value="Registrar"><br>
                        <button type="button" class="fb-btn">Unirte con <span>facebook</span></button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
