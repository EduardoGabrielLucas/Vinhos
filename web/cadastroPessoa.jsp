<%-- 
    Document   : cadastroPessoa
    Created on : 25/04/2022, 21:46:53
    Author     : gabriel.lopes2
--%>

<%@page import="entidade.Pessoa"%>
<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Vinho - Cadastro</title>
        <link rel="stylesheet" href="css/cadastroStyles.css">

        <script language="Javascript">
            function validacaoEmail(field) {
                usuario = field.value.substring(0, field.value.indexOf("@"));
                dominio = field.value.substring(field.value.indexOf("@") + 1, field.value.length);
                if ((usuario.length >= 1) &&
                        (dominio.length >= 3) &&
                        (usuario.search("@") == -1) &&
                        (dominio.search("@") == -1) &&
                        (usuario.search(" ") == -1) &&
                        (dominio.search(" ") == -1) &&
                        (dominio.search(".") != -1) &&
                        (dominio.indexOf(".") >= 1) &&
                        (dominio.lastIndexOf(".") < dominio.length - 1)) {
                    document.getElementById("msgemail").innerHTML = "E-mail válido";
                    alert("email valido");
                } else {
                    document.getElementById("msgemail").innerHTML = "<font color='red'>Email inválido </font>";
                    alert("E-mail invalido");
                }
            }
        </script> 

    </head>
    <body>

        <div id="main-container">   <!-- criando um container para o formulario -->

            <p class="text-center"><img src="img/logo.png" align="center" alt="Logo" width=200px height=70px></p>


            <%
                Pessoa person = (Pessoa) request.getAttribute("salvaCadastro");
                
                if (person == null) {
                    person = new Pessoa();
                    
                    person.setId(0);
                    person.setNome("");
                    person.setEndereco("");
                    person.setTelefone("");
                    person.setCpf("");
                }
                Usuario user = (Usuario) request.getAttribute("salvaCadastro");

                if (user == null) {
                    user = new Usuario();

                    user.setId(0);
                    user.setEmail("");
                    user.setSenha("");
                    user.setIdPessoa(0);
                }
            %>


            <h1>Registre-se para acessar o sistema</h1>


            <form id="register-form" name='formCategoria' method='post' action='/vinho/acao?param=salvaCadastro'> <!-- criando o formulário -->
                <input type="hidden" name="idUsuario" value="<%= user.getId()%>">
                <div class="full-box"> <!-- criando um formulário para o email -->
                    <label for="email">E-mail</label>
                    <input type="email" name="email" id="email" placeholder="Seu e-mail" onblur="validacaoEmail(f1.email)" value="<%= user.getEmail()%>" data-min-length="3" date-required required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>
                
                <div id="msgemail"></div>
                
                <div class="full-box">  <!-- criando um formulário para a senha -->
                    <label for="password">Senha</label>
                    <input type="password" name="password" id="password" placeholder="Sua senha" value="<%= user.getSenha()%>" data-max-length="50" required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>   
                
                <input type="hidden" name="idPessoa" value="<%= person.getId()%>">

                <div class="half-box spacing">  <!-- criando um formulário para o nome -->
                    <label for="name">Nome</label>
                    <input type="text" name="name" id="name" placeholder="Seu nome" value="<%= person.getNome()%>" data-max-length="16" required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>
                
                <div class="half-box">  <!-- criando um formulário para o telefone -->
                    <label for="phone">Telefone</label>
                    <input type="phone" name="phone" id="phone" placeholder="Seu telefone" value="<%= person.getTelefone()%>" data-max-length="50" required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>

                <div class="full-box">  <!-- criando um formulário para o endereço -->
                    <label for="address">Endereço</label>
                    <input type="address" name="address" id="lastname" placeholder="Seu endereço completo" value="<%= person.getEndereco()%>" data-max-length="50" required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>
                
                <div class="full-box">  <!-- criando um formulário para o cpf -->
                    <label for="cpf">CPF</label>
                    <input type="cpf" name="cpf" id="cpf" placeholder="Seu CPF" value="<%= person.getCpf()%>" data-max-length="50" required>   <!-- o nome do imput deve ser igual ao for da label -->
                </div>

                <div class="full-box"> <!-- criando um botão para enviar o formulário para o servidor -->
                    <input type="submit" id="btn-submit" value="Register">
                </div>

            </form>

        </div>
        <p class="error-validation template"></p>   <!-- serve para informar o erro abaixo dos dados cadastrais -->
        <script src="js/scripts.js"></script>
    </body>
</html>
