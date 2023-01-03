package ServletPack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Product;
import impl.ProductServiceImpl;
import service.ProductService;


@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService productService = ProductServiceImpl.getProductService();


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String productIdString = request.getParameter("id");
Product product = productService.read(Integer.parseInt(productIdString));
request.setAttribute("product", product);
request.getRequestDispatcher("singleProduct.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		Product product = new Product(name,description,validatedPrice(price));
		productService.create(product);
		response.setContentType("text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("success");
	}
	private double validatedPrice(String price) {
		if (price==null||price.isEmpty()) {
			return 0;
		}
		return Double.parseDouble(price);
	}


	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPut(req, resp);
	}


	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doDelete(req, resp);
	}

}
