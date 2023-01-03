package ServletPack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import impl.UserServiceImpl;
import les05.User;
import service.UserService;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// private UserServiceImpl userServiceImpl;
	private UserService userService = UserServiceImpl.getUserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		// UserService userService = UserService.getUserService();
		// User user = userService.getUser(login);
		User user = userService.readByEmail(login);
		if (user != null && user.getPassword().equals(password)) {
			request.setAttribute("userEmail", login);
			request.getRequestDispatcher("cabinet.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}

	}

}
