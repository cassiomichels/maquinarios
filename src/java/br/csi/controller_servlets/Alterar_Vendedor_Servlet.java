package br.csi.controller_servlets;



import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"alterar_vendedor"})
public class Alterar_Vendedor_Servlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
    
        
        
        req.setAttribute("id", id);

        RequestDispatcher disp = req.getRequestDispatcher("/WEB-INF/views/atualizar_vendedor.jsp");
        disp.forward(req,resp);
    }
}