package LucasHouse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Obtém os dados do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String curso = request.getParameter("curso");
        String universidade = request.getParameter("universidade");
        String empresa = request.getParameter("empresa");
        String cargo = request.getParameter("cargo");
        
        // Cria o cookie com os dados do usuário
        Cookie cookie = new Cookie("cadastro_usuario", nome + "|" + email + "|" + curso + "|" + universidade + "|" + empresa + "|" + cargo);
        cookie.setValue(cookie.getValue().replace(" ", "_"));
        
        // Define a duração do cookie (10 minutos)
        cookie.setMaxAge(10 * 60);
        
        // Adiciona o cookie na resposta
        response.addCookie(cookie);
        
        // Monta a resposta para o usuário
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro realizado com sucesso</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Cadastro realizado com sucesso!</h1>");
        out.println("<p>Obrigado por se cadastrar. Seus dados foram armazenados em um cookie e estarão disponíveis por 10 minutos.</p>");
        out.println("Seja bem vindo " + nome  );
        out.println("<br/> Seu cargo: " + cargo);
        out.println("</body>");
        out.println("</html>");
    }
}
