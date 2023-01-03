package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import les05.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	private static ProductService productServiceImpl;
	private static Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);

	public ProductServiceImpl() {

		try {
			productDao = new ProductDaoImpl();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			LOGGER.error(e);
		}

	}

	public static ProductService getProductService() {
		if (productServiceImpl == null) {
			productServiceImpl = new ProductServiceImpl();
		}

		return productServiceImpl;
	}

	@Override
	public Product create(Product t) {
		// TODO Auto-generated method stub
		return productDao.create(t);
	}

	@Override
	public Product read(Integer id) {
		// TODO Auto-generated method stub
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		// TODO Auto-generated method stub
		return productDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		// TODO Auto-generated method stub
		return productDao.readAll();
	}

}
