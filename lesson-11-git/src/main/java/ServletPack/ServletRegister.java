package ServletPack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import impl.UserServiceImpl;
import les05.Role;
import les05.User;
import service.UserService;

//@WebServlet("/login")
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String warning = "This email is busy";
	// private UserService userService = UserService.getUserService();
	UserService userService = UserServiceImpl.getUserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		// String role = request.getParameter("role");
		String password = request.getParameter("password");

		//User user = userService.readByEmail(email);
		//if (user != null && user.getEmail().equalsIgnoreCase(email)) {
		//	request.setAttribute("warning", warning);
		//	request.getRequestDispatcher("index.jsp").forward(request, response);

		//} else {
			// userService.saveUser(new User(firstName, lastName, email, password));
			if (!email.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty() && !password.isEmpty()) {
				userService.create(new User(email, firstName, lastName, Role.USER.toString(), password));
			}
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("success");

			//request.setAttribute("userEmail", email);

			//request.getRequestDispatcher("cabinet.jsp").forward(request, response);
		}

	}

//}
