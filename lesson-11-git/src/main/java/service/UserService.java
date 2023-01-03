package service;

import les05.User;
import shared.AbstractCRUD;
import shared.ReadByEmail;

public interface UserService extends AbstractCRUD<User>, ReadByEmail<User> {

}
