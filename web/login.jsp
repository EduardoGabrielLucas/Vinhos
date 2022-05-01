<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewrport" content="width=device-width, initial-scale=1.0">
        <title>Vinho - Login</title>

        <!-- link para buscar os icones -->
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> 
        <!-- link para os estilos da página -->
        <link rel="stylesheet" type="text/css" href="css/loginStyles.css">
    </head>
    <body>

        <div id="login-container"> <!-- cria um container com usuário, senha, midia social e um link para caso o usuário esqueça a senha -->


            <%
                Usuario user = (Usuario) request.getAttribute("consultaUsuario");

                if (user == null) {
                    user = new Usuario();

                    user.setId(0);
                    user.setEmail("");
                    user.setSenha("");
                    user.setIdPessoa(0);
                }
            %>


            <img src="img/logo.png" align="center" alt="logo-ecommerce" width=200px height=70px>    
            <h1>Login</h1>

            <main class="form-signin">


                <form method="post" action="/vinho/acao?param=consultaUsuario"> <!-- cria um formulário com os inputs para o usuário colocar o email e senha -->



                    <input type="hidden" name="id" value="<%= user.getId()%>">
                    <label for="email">E-mail</label>
                    <input type="email" name="email" id="email" placeholder="Seu e-mail" autocomplete="on" value="<%= user.getEmail()%>" required autofocus>
                    <label for="password">Senha</label>
                    <input type="password" name="password" id="password" placeholder="Sua senha" value="<%= user.getSenha()%>"  required autofocus>
                    <!-- link para caso o usuário esqueça a senha -->
                    <!--<a href="#" id="forgot-password">Forgot your password or email?</a> -->
                    <!-- o input serve para levar as informações do formulário/usuário para o servidor -->


                    <%
                        String msg = String.valueOf(request.getAttribute("msgLogin"));

                        if (msg.equals("erro")) {
                    %>
                    <p id="msgErroLogin">Email ou senha inválido!</p>
                    <%
                    } else {
                    %>
                    <p id="msgErroLogin"></p>
                    <%
                        }
                    %>


                    <input type="submit" value="Login">
                </form>

                <!-- cria o container social -->
                <!-- <div id="social-container">
                    <p>Or sign in via your social networks</p>
                    <i class="fa fa-facebook-f"></i> <!-- cria o ícone do facebook -->
                <!--<i class="fa fa-linkedin"></i> <!-- cria o ícone do linkedin -->
                <!--</div> -->

                <!-- cria o container para se registrar -->
                <div id="register-container">
                    <p>Não encontramos seu cadastro</p>
                    <a href="cadastroPessoa.jsp">Cadastre-se</a>
                </div>
            </main>
        </div>

    </body>
</html>