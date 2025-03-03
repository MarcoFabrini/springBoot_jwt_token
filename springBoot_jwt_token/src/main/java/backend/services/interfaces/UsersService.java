package backend.services.interfaces;

import java.util.List;

import backend.model.Users;

public interface UsersService {
	List<Users> listAllUsers() throws Exception;

	Users getAuthenticatedUser() throws Exception;
}// interface
