package LucasHouse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MostrarDadosServlet")
public class MostrarDadosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies(); // Obtém todos os cookies da requisição
        
        String nome = null, email = null, curso = null, universidade = null, empresa = null, cargo = null;
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("cadastro_usuario")) { // Verifica se o nome do cookie é "cadastro_usuario"
                    String[] campos = cookie.getValue().split("\\|"); // Obtém os valores dos campos separados pelo caractere "|"
                    nome = campos[0];
                    email = campos[1];
                    curso = campos[2];
                    universidade = campos[3];
                    empresa = campos[4];
                    cargo = campos[5];
                    break; // Interrompe o loop após encontrar o cookie desejado
                }
            }
        }
        
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        // Exibe as informações do usuário em uma página HTML
        response.getWriter().println("<html><head><title>Dados do usuário</title></head><body>");
        response.getWriter().println("<h1>Dados do usuário</h1>");
        response.getWriter().println("<p><strong>Nome:</strong> " + nome + "</p>");
        response.getWriter().println("<p><strong>E-mail:</strong> " + email + "</p>");
        response.getWriter().println("<p><strong>Curso:</strong> " + curso + "</p>");
        response.getWriter().println("<p><strong>Universidade:</strong> " + universidade + "</p>");
        response.getWriter().println("<p><strong>Empresa:</strong> " + empresa + "</p>");
        response.getWriter().println("<p><strong>Cargo:</strong> " + cargo + "</p>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}

