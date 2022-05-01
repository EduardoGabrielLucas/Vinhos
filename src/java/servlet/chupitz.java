/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import entidade.Categoria;
import entidade.Produto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author pretto
 */
public class chupitz extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet chupitz</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet chupitz at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String param = request.getParameter("param");

        if (param.equals("selectProduto")) {
            String descricao = request.getParameter("descricao");
            System.out.println("Valor do Select: " + descricao);
            //request.setAttribute("paginaRetorno", "listaproduto.jsp");

            encaminharPagina("listaproduto.jsp", request, response);
        }

        //============== PESQUISA PRODUTOS =====================================OK
        if (param.equals("pesquisaProdutos")) {
            String criterio = request.getParameter("campoDeBusca");
            System.out.println("Cheguei na pesquisa do produto!");
            ArrayList<Produto> produto = new ProdutoDAO().consultar(criterio);

            request.setAttribute("categoriasPesquisa", produto);

            encaminharPagina("pesquisaProdutos.jsp", request, response);
        }

        //============== PESQUISA CATEGORIAS ===================================OK
        if (param.equals("pesquisaCategorias")) {
            String criterio = request.getParameter("campoDeBusca");
            //String data = request.getParameter("")

            //ArrayList<Categoria> categoria = new CategoriaDAO().consultarEspecial(criterio,data);
            ArrayList<Categoria> categoria = new CategoriaDAO().consultar(criterio);

            request.setAttribute("categoriasPesquisa", categoria);

            encaminharPagina("pesquisaCategorias.jsp", request, response);
        }

        //============== PESQUISA PRODUTO E CATEGORIA ==========================
        if (param.equals("pesquisaProdutoECategoria")) {
            /*String criterio = request.getParameter("campoDeBuscaDescricao");
            System.out.println("Cheguei na pesquisa do produto e categoria!");
            ArrayList<Produto> produto = new ProdutoDAO().consultarP(criterio);
            
            System.out.println("Passou");
            request.setAttribute("categoriasPesquisa", produto);

            encaminharPagina("pesquisaProdutoInicial.jsp", request, response); */

            String produto = request.getParameter("campoDeBuscaDescricao");
            int categoria = Integer.parseInt(request.getParameter("comboCategoria"));
            //ArrayList<Produto> produto = new ArrayList<Produto>();

            String prod = "";
            int cat = 0;
            String sql = "";

            if (produto.equals("") == false) {
                prod = produto;
                {

                }
            } else {
                prod = "vazio";
            }

            if (categoria == 0) {
                cat = 0;
            } else {
                cat = categoria;
                {

                }
            }

            if ((prod == "vazio") && (cat == 0)) {
                sql = "vazio";
            }

            if ((prod != "vazio") && (cat > 0)) {
                sql = "p.descricao ILIKE '%" + prod + "%' AND c.id = " + cat;
            }

            if ((prod != "vazio") && (cat == 0)) {
                sql = "p.descricao ILIKE '%" + prod + "%'";
            }

            if ((prod == "vazio") && (cat > 0)) {
                sql = "c.id = " + cat;
            }

            //ArrayList<Produto> produto = new ProdutoDAO().consultarProdutoEcategoria(criterio,criterio2);
            ArrayList<Produto> produto1 = new ProdutoDAO().consultarP(sql);

            System.out.println("Passou");
            request.setAttribute("categoriasPesquisa", produto1);

            encaminharPagina("pesquisaProdutoInicial.jsp", request, response);

        }
        
        
        
        
        
        //============== PESQUISA COMPRAS ==========================
        if (param.equals("pesquisaCompras")) {
            /*String criterio = request.getParameter("campoDeBuscaDescricao");
            System.out.println("Cheguei na pesquisa do produto e categoria!");
            ArrayList<Produto> produto = new ProdutoDAO().consultarP(criterio);
            
            System.out.println("Passou");
            request.setAttribute("categoriasPesquisa", produto);

            encaminharPagina("pesquisaProdutoInicial.jsp", request, response); */

            String produto = request.getParameter("campoDeBuscaDescricao");
            int categoria = Integer.parseInt(request.getParameter("comboCategoria"));
            
            //ArrayList<Produto> produto = new ArrayList<Produto>();

            String prod = "";
            int cat = 0;
            String sql = "";

            if (produto.equals("") == false) {
                prod = produto;
                {

                }
            } else {
                prod = "vazio";
            }

            if (categoria == 0) {
                cat = 0;
            } else {
                cat = categoria;
                {

                }
            }

            if ((prod == "vazio") && (cat == 0)) {
                sql = "vazio";
            }

            if ((prod != "vazio") && (cat > 0)) {
                sql = "p.descricao ILIKE '%" + prod + "%' AND c.id = " + cat;
            }

            if ((prod != "vazio") && (cat == 0)) {
                sql = "p.descricao ILIKE '%" + prod + "%'";
            }

            if ((prod == "vazio") && (cat > 0)) {
                sql = "c.id = " + cat;
            }

            //ArrayList<Produto> produto = new ProdutoDAO().consultarProdutoEcategoria(criterio,criterio2);
            ArrayList<Produto> produto1 = new ProdutoDAO().consultarP(sql);

            System.out.println("Passou");
            request.setAttribute("categoriasPesquisa", produto1);

            encaminharPagina("pesquisaProdutoInicial.jsp", request, response);

        }
        
        
        
        

        if (param.equals("pesquisa")) {
            String criterio = request.getParameter("campoDeBusca");

            ArrayList<Produto> produto = new ProdutoDAO().consultar(criterio);

            if (produto == null) {
                request.setAttribute("categoriasPesquisa", produto);

                encaminharPagina("listaproduto.jsp", request, response);
                System.out.println("estou entrando na pesquisa de produtos");
            }

            ArrayList<Categoria> categoria = new CategoriaDAO().consultar(criterio);
            if (categoria == null) {
                request.setAttribute("categoriasPesquisa", categoria);

                encaminharPagina("listacategoria.jsp", request, response);
                System.out.println("estou entrando na pesquisa de categorias");
            }

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void encaminharPagina(String pagina, HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher rd = request.getRequestDispatcher(pagina);
            rd.forward(request, response);
        } catch (Exception e) {
            System.out.println("Erro ao encaminhar: " + e);
        }
    }

}
