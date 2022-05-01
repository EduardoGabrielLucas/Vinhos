<%-- 
    Document   : menuVinho
    Created on : 30 de abr. de 2022, 16:06:44
    Author     : gabri
--%>

<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vinho</title>

        <style>



            /*.bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }*/

            .container-fluid {
                background: -webkit-gradient(linear, left top, right top, from(#0003aa), to(#000000)) no-repeat;
                background: -moz-linear-gradient(left, #0003aa, #000000);
                filter:progid:DXImageTransform.Microsoft.Gradient(GradientType=1, StartColorStr='#0003aa', EndColorStr='#000000');
            }

        </style>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/navbar.css" rel="stylesheet">

        <link href="css/menuStyles.css" rel="stylesheet">

    </head>
    <body>
        
        
        
        <nav class="navbar navbar-expand-md navbar-dark bg-dark" aria-label="Fourth navbar example">
            <div class="container-fluid">
                <a class="navbar-brand" href="paginainicial.jsp"><img src="img/logo.png" align="center" alt="logo" width=110px height=50px></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarsExample04">
                    <ul class="navbar-nav me-auto mb-2 mb-md-0">

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Produtos</a>
                            <ul class="dropdown-menu" aria-labelledby="dropdown03">
                                <li><a class="dropdown-item" href="produtoVinho.jsp">Registrar produto</a></li>
                                <li><a class="dropdown-item" href="listaproduto.jsp">Product list</a></li>
                                <li><a class="dropdown-item" href="pesquisaProdutos.jsp">Product search</a></li>
                            </ul>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Category</a>
                            <ul class="dropdown-menu" aria-labelledby="dropdown03">
                                <li><a class="dropdown-item" href="categoriaSmartBuy.jsp">Category registration</a></li>
                                <li><a class="dropdown-item" href="listacategoria.jsp">Category List</a></li>
                                <li><a class="dropdown-item" href="pesquisaCategorias.jsp">Category Search</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-bs-toggle="dropdown" aria-expanded="false">Relatórios</a>
                            <ul class="dropdown-menu" aria-labelledby="dropdown04">
                                <li><a class="dropdown-item" href="relatorioProdutosCadastrado.jsp" target="_blank">Registered products</a></li>
                                <li><a class="dropdown-item" href="relatorioCategoriasCadastradas.jsp" target="_blank">Registered categories</a></li>
                                <li><a class="dropdown-item" href="relatorioComprasCarrinho.jsp" target="_blank">Shopping list</a></li>
                                <li><a class="dropdown-item" href="relatorioUsuariosCadastrados.jsp" target="_blank">Registered users</a></li>
                            </ul>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="pesquisaProdutoInicial.jsp">Search</a> 
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="TESTE.jsp">Teste</a> 
                        </li>
                        
                    </ul>                  
                    <ul>
                        <li class="nav-item">
                            <a class="navbar-brand" href="carrinhoCompra.jsp"><img src="img/shopping-cart.png" title="Carrinho de Compras" align="center" alt="icone-carrinho" width=30px height=30px></a>
                        </li>
                    </ul>
                    <ul>
                        <li class="nav-item">
                            <a class="nav-link" href="/vinho/acao?param=logout" ><img src="img/login-rounded-right.png" title="Logout of your accont" align="center" alt="icone-carrinho" width=30px height=30px></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <script src="js/bootstrap.bundle.min.js"></script>

    </body>
</html>