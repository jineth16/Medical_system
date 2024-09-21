import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los datos del usuario desde el formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Configurar el tipo de respuesta
        response.setContentType("text/html");
        // Aquí normalmente se guardaría en la base de datos
        try (PrintWriter out = response.getWriter()) {
            // Aquí normalmente se guardaría en la base de datos
            out.println("<h1>Registro exitoso para el usuario: " + username + "</h1>");
        }
    }
}
