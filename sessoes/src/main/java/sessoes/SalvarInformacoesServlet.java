package sessoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SalvarInformacoes")
public class SalvarInformacoesServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();

    String login = request.getParameter("login");
    String pessoais = request.getParameter("pessoais");
    String academicas = request.getParameter("academicas");
    String profissionais = request.getParameter("profissionais");

    session.setAttribute("login", login);
    session.setAttribute("pessoais", pessoais);
    session.setAttribute("academicas", academicas);
    session.setAttribute("profissionais", profissionais);

    Integer acessos = (Integer) session.getAttribute("acessos");
    if (acessos == null) {
      acessos = 0;
    }
    acessos++;
    session.setAttribute("acessos", acessos);

    if (acessos >= 3) {
      response.sendRedirect("excedido.jsp");
    } else {
      response.sendRedirect("sucesso.jsp");
    }
  }

}
