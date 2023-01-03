package ServletPack;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import impl.ProductServiceImpl;
import les05.Product;
import service.ProductService;

/**
 * Servlet implementation class Products
 */
@WebServlet("/products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService = ProductServiceImpl.getProductService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Product> products = productService.readAll();
	String json = new Gson().toJson(products);
	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.getWriter().write(json);
	}



}
