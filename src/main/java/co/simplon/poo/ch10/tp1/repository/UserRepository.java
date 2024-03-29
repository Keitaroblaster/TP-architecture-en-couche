package co.simplon.poo.ch10.tp1.repository;

import java.util.List;

import co.simplon.poo.ch10.tp1.model.User;
import co.simplon.poo.ch10.tp1.utils.persistence.CrudRepository;

public interface UserRepository extends CrudRepository<User> {
	User getByLogin(String login);
	List<User> getAllUsers();

}
