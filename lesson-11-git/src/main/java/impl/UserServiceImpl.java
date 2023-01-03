package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.UserDao;
import dao.impl.BucketDaoImpl;
import dao.impl.UserDaoImpl;
import les05.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	private UserDaoImpl userDaoImpl;
	private static Logger LOGGER = Logger.getLogger(BucketDaoImpl.class);

	public UserServiceImpl() {

		try {
			userDao = new UserDaoImpl();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			LOGGER.error(e);
		}

	}

	private static UserServiceImpl userServiceImpl;

	public static UserServiceImpl getUserServiceImpl() {
		if (userServiceImpl == null) {
			userServiceImpl = new UserServiceImpl();
		}
		return userServiceImpl;
	}

	@Override
	public User create(User t) {
		// TODO Auto-generated method stub
		return userDao.create(t);
	}

	@Override
	public User read(Integer id) {
		// TODO Auto-generated method stub
		return userDao.read(id);
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return userDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return userDao.readAll();
	}

	@Override
	public User readByEmail(String t) {
		// TODO Auto-generated method stub
		return userDao.readByEmail(t);
	}

}
