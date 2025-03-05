package backend.services.implementation;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import backend.model.Users;
import backend.repository.UsersRepository;
import backend.services.interfaces.UsersService;

@Service
public class UsersImplementation implements UsersService {
	private final UsersRepository usersRepository;

	public UsersImplementation(UsersRepository userRepository) {
		this.usersRepository = userRepository;
	}// UsersImplementation

	@Override
	public Users getAuthenticatedUser() throws Exception {
		Authentication authentication = SecurityContextHolder
				.getContext()
				.getAuthentication();

		Users currentUser = (Users) authentication.getPrincipal();

		return currentUser;
	}// authenticatedUser

	@Override
	public List<Users> listAllUsers() throws Exception {
		Users currentUser = getAuthenticatedUser(); // Ottieni l'utente autenticato
		return usersRepository.findAllByIdNot(currentUser.getId()); // Escludi il suo ID
	}// listAllUsers

}// class
