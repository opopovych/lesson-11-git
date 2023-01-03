package ServletPack;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import dto.UserLogin;
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// UserService userService = UserService.getUserService();
		// User user = userService.getUser(login);
		User user = userService.readByEmail(email);
		//if (user != null && user.getPassword().equals(password)) {
		//	request.setAttribute("userEmail", email);
		//	request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	//	} else {
		//	request.getRequestDispatcher("login.jsp").forward(request, response);

	//	}

		if (user != null && user.getPassword().equals(password)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userId", user.getId());
			UserLogin userLogin = new UserLogin();
			userLogin.destinationUrl = "cabinet.jsp";
			userLogin.userEmail = user.getEmail();

			String json = new Gson().toJson(userLogin);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		}
	}

}
