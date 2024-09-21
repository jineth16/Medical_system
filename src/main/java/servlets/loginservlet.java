/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginservlet extends HttpServlet {

    // Usuario y contraseña válidos
    private final String validUsername = "1121943377";
    private final String validPassword = "1121943377";

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener el nombre de usuario y la contraseña del formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Configurar el tipo de respuesta en HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Verificar si las credenciales son correctas
        if (validUsername.equals(username) && validPassword.equals(password)) {
            // Inicio de sesión exitoso
            out.println("<h1>Autenticación satisfactoria</h1>");
        } else {
            // Error en la autenticación
            out.println("<h1>Error en la autenticación</h1>");
        }

        out.close();
    }
}