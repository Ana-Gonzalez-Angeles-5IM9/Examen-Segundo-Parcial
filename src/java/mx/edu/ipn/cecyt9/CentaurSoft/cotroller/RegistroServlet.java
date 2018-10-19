/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.CentaurSoft.cotroller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.CentaurSoft.utils.Conexion;

/**
 *
 * @author AnaGonzález
 */
public class RegistroServlet extends HttpServlet {

    private Connection conex;


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
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        String nombre="";
        String materno="";
        String paterno="";
        String escuela="";
        String materia="";
        String deporte="";

        final String INSERT = "insert into informacion(nombre,apellidop,apellidom,escuela,materiafav,deportefav) values(?, ?,?,?,?,?);";

        nombre = request.getParameter("nombre");
        materno = request.getParameter("materno");
        paterno = request.getParameter("paterno");
        escuela = request.getParameter("escuela");
        materia = request.getParameter("materia");
        deporte = request.getParameter("deporte");

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conex.prepareStatement(INSERT);
            stmt.setString(1, nombre);
            stmt.setString(2, paterno);
            stmt.setString(3, materno);
            stmt.setString(4, escuela);
            stmt.setString(5, materia);
            stmt.setString(6, deporte);



            if (stmt.executeUpdate() == 0) {
                System.out.println("Algo no se hizo bien en el registro"); 
            }
            conex.close();
        } catch (Exception eee) {
            System.out.println("error al realizar registro");
        }
        response.sendRedirect("../jsp/index.jsp");
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
