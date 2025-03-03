package backend.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
	Optional<Users> findByEmail(String email);
}// interface
