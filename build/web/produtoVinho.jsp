<%-- 
    Document   : produtoVinho
    Created on : 30 de abr. de 2022, 16:53:35
    Author     : gabri
--%>

<%@page import="apoio.Formatacao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entidade.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/categoriaSmartBuy.css">
        <title>Cadastro de Produto</title>
    </head>
    <body>
        <%@include file="menuVinho.jsp" %>

        <div id="main-container" class="table-responsive">



            <%
                Produto produto = (Produto) request.getAttribute("objProduto");

                if (produto == null) {
                    produto = new Produto();

                    produto.setId(0);
                    produto.setNome("");
                    produto.setDescricao("");
                    produto.setQuantidade(0);
                    produto.setPrecoCusto(0);
                    produto.setPercentualLucro(0);
                    produto.setPrecoVenda(0);
                    produto.setIdGrupoProduto(0);
                    produto.setIdSubGrupoProduto(0);
                    produto.setIdMarca(0);
                    produto.setIsActive("");
                    //produto.setImagem("");
                }
            %>

            <h1>Registrar produtos</h1>

            <main class="main-container">

                <!-- ADICIONAR PRODUTO -->
                <form name='formCategoria' method='post' action='/vinho/acao?param=salvarProduto'>
                    <input type="hidden" name="id"  value="<%=produto.getId()%>">

                    <div class="full-box">
                        <label for="nome">Nome</label>
                        <input type="text" name="nome" placeholder="Nome do produto" autocomplete="on" minlength="4" maxlength="20" value="<%=produto.getNome()%>" required>
                    </div>
                    <div class="full-box">
                        <label for="descricao">Descrição</label>
                        <input type="text" name="descricao" placeholder="Descrição do produto" autocomplete="on" minlength="4" maxlength="20" value="<%=produto.getDescricao()%>" required>
                    </div>
                    <div class="full-box spacing">
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Grupo de produtos</option>
                            <option value="1">One</option>
                            <option value="2">Two</option>
                            <option value="3">Three</option>
                        </select>
                    </div>
                    <div class="full-box spacing">
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Subgrupo de produtos</option>
                            <option value="1">One</option>
                            <option value="2">Two</option>
                            <option value="3">Three</option>
                        </select>
                    </div>
                    <div class="full-box spacing">
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Marca</option>
                            <option value="1">One</option>
                            <option value="2">Two</option>
                            <option value="3">Three</option>
                        </select>
                    </div>


                    <div class="half-box spacing">
                        <label for="precoCusto">Preço de custo</label>
                        <input class="money" type="text" class="form-control" onkeypress="$(this).mask('0,00', {reverse: true}); )" name="precoCusto" format="currency" precision="2" min="1" max="20000" placeholder="Enter the price for sale" value="<%=produto.getPrecoCusto()%>" required>
                    </div>
                    <div class="half-box spacing">
                        <label for="percentualLucro">Percentual de lucro</label>
                        <input type="number" name="quantidade" placeholder="Enter the quantity" maxlength="" min="1" max="10" value="<%=produto.getPercentualLucro()%>" required>
                    </div>
                    <div class="full-box spacing">
                        <label for="precoVenda">Preço de venda</label>
                        <input class="money" type="text" class="form-control" onkeypress="$(this).mask('0,00', {reverse: true}); )" name="precoVenda" format="currency" precision="2" min="1" max="20000" placeholder="Enter the price for sale" value="<%=produto.getPrecoVenda()%>" required>
                    </div>
                    <div class="form-check form-switch">
                        <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" checked />
                        <label class="form-check-label" for="flexSwitchCheckChecked" name="isActive">Ativo</label>
                    </div>
                    <div class="full-box">
                        <input type="submit" id="btn-submit" value='Salvar'>
                    </div>
                </form>
            </main>
        </div>
    </body>
</html>
