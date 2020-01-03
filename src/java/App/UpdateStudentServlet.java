/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class UpdateStudentServlet extends HttpServlet {

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
       String id = request.getParameter("id");
        String name = request.getParameter("name");
        String cclass = request.getParameter("cclass");
        String sec = request.getParameter("sec");
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mob");
        String add = request.getParameter("add");
        String city=request.getParameter("c");

        int idn = Integer.parseInt(id);
        
        StudentDTO sdto = new StudentDTO();
        sdto.setId(idn);
        sdto.setName(name);
        sdto.setCclass(cclass);
        sdto.setSec(sec);
        sdto.setFname(fname);
        sdto.setMname(mname);
        sdto.setEmail(email);
        sdto.setMob(mobile);
        sdto.setAdd(add);
        sdto.setCity(city);

        StudentDAO sdao = new StudentDAO();
        int i = sdao.UpdateStudent(sdto);

        response.sendRedirect("StudentListServlet");
        
        
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
