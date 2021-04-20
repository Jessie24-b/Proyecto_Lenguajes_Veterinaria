package cr.ac.ucr.proyecto_veterinaria.servlets;

import cr.ac.ucr.proyecto_veterinaria.domain.Animal;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*  @author Luis Leiton

    Este servlet obtiene un animal especifico de un usuario y lo 
    envia a la vista de animal.
   
    Ademas del animal tiene que obtener los servicios que ha recibido
    para llenar la tabla de servicios.
 */

public class GetAnimalServlet extends HttpServlet {

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

        /* 
            Codigo para obtener de la base de datos el animal especifico.
            Ademas de la informacion de sus servicios recibidos.
        */

        Animal an = new Animal();
        an.setBorn(new Date(2015 - 1900, 11, 12));
        an.setName("DOG");
        an.setHeight(12);
        an.setWeight(12);
        an.setId(1);
        an.setBreed("Chihuhua");
        an.setSpecie("Can");
       
         /* ---------------------------------------------------------- */
        
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view_animal.jsp");
        request.setAttribute("animal", an);
        dispatcher.forward(request, response);  
    }

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
}
