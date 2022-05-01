<%-- 
    Document   : listaprodutoInicial
    Created on : 30 de abr. de 2022, 16:02:44
    Author     : gabri
--%>

<%//@page import="dao.ProdutoDAO"%>
<%//@page import="entidade.Produto"%>
<%//@page import="entidade.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%//@page import="dao.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vinho</title>
        <link rel="stylesheet" type="text/css" href="css/paginaInicialStyles.css">
    </head>
    <body>
        <%@include file="menuVinho.jsp" %> 
        <div id="listaprodutoInicial-container" class="table-responsive">
            <h3>Lista de produtos</h3>
            <%
                //ArrayList<Produto> produto = new ProdutoDAO().consultarTodos();
            %>

            <table class="table table-striped table-sm">
                <th>Ação</th>
                <th>Id</th>
                <th>Descrição</th>
                <th>Quantidade</th>
                <th>PrecoVenda</th>
                <th>Estoque</th>
                <th>Status</th>
                <th>Categoria</th>
                <!-- <th>Imagem</th> -->
                <%
                    //for (int i = 0; i < produto.size(); i++) {
                        //Produto prod = produto.get(i);
                %>
                <tr>
                    <td><a href='/vinho/acao?param=edCompra&id=<%//= prod.getId()%>'><img src="img/shopping-cart.png" title="Shopping cart" align="center" alt="icone-Carrinho" width=20px height=20px></a></td>             
                    <td><%//= prod.getId()%></td>
                    <td><%//= prod.getDescricao()%></td>
                    <td><%//= prod.getQuantidade()%></td>
                    <td><%//= prod.getPrecoVenda()%></td>
                    <td><%//= prod.getEstoque()%></td>
                    <td><%//= prod.getStatus()%></td>
                    <td><%//= prod.getDesCategoria()%></td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <br>
        <br>
        <!--<a href='index.jsp'>Voltar</a>-->
    </body>
</html>
