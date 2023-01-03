package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.BucketDao;
import dao.impl.BucketDaoImpl;
import domain.Bucket;
import service.BucketService;

public class BucketServiceImpl implements BucketService {
	private BucketDao bucketDao;
	private static BucketService bucketServiceImpl;
	private static Logger LOGGER = Logger.getLogger(BucketServiceImpl.class);

	public BucketServiceImpl() {

		try {
			bucketDao = new BucketDaoImpl();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error(e);
		}

	}

	public static BucketService getBucketService() {
		if (bucketServiceImpl == null) {
			bucketServiceImpl = new BucketServiceImpl();
		}
		return bucketServiceImpl;
	}

	@Override
	public Bucket create(Bucket t) {
		// TODO Auto-generated method stub
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		// TODO Auto-generated method stub
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		// TODO Auto-generated method stub
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bucketDao.delete(id);
	}

	@Override
	public List<Bucket> readAll() {
		// TODO Auto-generated method stub
		return bucketDao.readAll();
	}
}
