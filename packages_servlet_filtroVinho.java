/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pretto
 */
@WebFilter("/*")
public class filtro extends HttpServlet implements Filter {

    List<String> urls = new ArrayList<>();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
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
            out.println("<title>Servlet filtro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet filtro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    /*============================================================================*/
    /*INICIO*/
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
        processRequest(request, response);
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
    
    /*FIM*/
    /*============================================================================*/
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        urls.add("/vinho/");
        urls.add("/vinho/acao");
        urls.add("/vinho/index.jsp");
        urls.add("/vinho/loginSmartBuy.jsp");
        urls.add("/vinho/cadastroSmartBuy.jsp");
        urls.add("/vinho/css/bootstrap.min.css");
        urls.add("/vinho/css/cadastroStyles.css");
        urls.add("/vinho/css/loginStyles.css");
        urls.add("/vinho/css/menuStyles.css");
        urls.add("/vinho/css/navbar.css");
        urls.add("/vinho/css/signin.css");
        urls.add("/vinho/img/EscritaEcomerce.png");
        urls.add("/vinho/img/EscritaEcomerce1.png");
        urls.add("/vinho/img/EscritaEcomerce2.png");
        urls.add("/vinho/img/EscritaEcomerce3.png");
        urls.add("/vinho/img/mountain.jpg");
        urls.add("/vinho/img/background.jpg");
        urls.add("/vinho/img/bg-register-page.jpg");
        urls.add("/vinho/js/bootstrap.bundle.min.js");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        
        // Informa qual a URI que est?? usando
        System.out.println("getReqURI: " + req.getRequestURI());

        //valida se a URL esta vindo - se sim, 
        if (urls.contains(req.getRequestURI())) {
            request.setAttribute("parametro", "consultaUsuario");
            chain.doFilter(request, response);
            System.out.println("estou no doFilter54");
        } else {
            HttpSession sessao = ((HttpServletRequest) request).getSession();

            System.out.println("Entrei no Else do doFilter");
            // caso n??o perten??a a lista, verifica se h?? usu??rio na sess??o
            // se n??o houver, encaminha para o Login
            if (sessao.getAttribute("usuarioLogado") == null) {
                ((HttpServletResponse) response).sendRedirect("login.jsp");
            } else {
                // se usu??rio estiver logado, apenas abra a p??gina solicitada
                System.out.println("Destino: " + req.getRequestURI());
                chain.doFilter(request, response);
            }
        }

    }
}