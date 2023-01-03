package service;

import domain.User;
import shared.AbstractCRUD;
import shared.ReadByEmail;

public interface UserService extends AbstractCRUD<User>, ReadByEmail<User> {

}
