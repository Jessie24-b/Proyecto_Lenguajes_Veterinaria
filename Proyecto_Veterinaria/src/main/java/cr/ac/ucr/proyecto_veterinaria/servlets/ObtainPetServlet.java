package cr.ac.ucr.proyecto_veterinaria.servlets;

import cr.ac.ucr.proyecto_veterinaria.domain.Animal;
import cr.ac.ucr.proyecto_veterinaria.domain.Register;
import java.io.IOException;

import java.sql.Date;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*  @author Luis Leiton

    Este servlet obtiene las mascotas que estan en venta y adopcion   
    para llenar la vista de obtener mascotas.
 */

public class ObtainPetServlet extends HttpServlet {

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
 
        LinkedList<Register> sale = new LinkedList<>();
        LinkedList<Register> adoption = new LinkedList<>();
        
        
        /* Codigo para obtener de la base de datos animales 
            para adopcion y venta. 
        */
        
        LinkedList<Register> registers = new LinkedList<>();
        
        Animal an = new Animal();
        an.setBorn(new Date(2015 - 1900,11,12));
        an.setName("Pepito");
        an.setHeight(12);
        an.setWeight(12);
        an.setId(1);
        an.setBreed("Chihuhua");
        an.setSpecie("Can");
        
        Register reg = new Register();
        reg.setAnimal(an);
        
        registers.add(reg);
        
        Animal imal = new Animal();
        imal.setBorn(new Date(2020  - 1900,11,12));
        imal.setName("Doggo");
        imal.setHeight(12);
        imal.setWeight(12);
        imal.setId(1);
        imal.setBreed("San Bernardo");
        imal.setSpecie("Can");
        
        Register ister = new Register();
        ister.setAnimal(imal);
        
        registers.add(ister);
        sale = registers;
        adoption = registers;
        
         /*-----------------------------------------------------*/
        
        request.setAttribute("sale", sale);
        request.setAttribute("adoption", adoption);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view_obtain_pet.jsp");
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
