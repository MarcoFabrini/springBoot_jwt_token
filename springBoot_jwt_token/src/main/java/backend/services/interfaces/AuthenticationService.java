package backend.services.interfaces;

import backend.model.Users;
import backend.request.LoginUsersRequest;
import backend.request.RegisterUsersRequest;

public interface AuthenticationService {
	Users signup(RegisterUsersRequest req) throws Exception;

	Users login(LoginUsersRequest req) throws Exception;
}// interface
