package dao;

import domain.User;
import shared.AbstractCRUD;
import shared.ReadByEmail;

public interface UserDao extends AbstractCRUD<User>, ReadByEmail<User> {

}
