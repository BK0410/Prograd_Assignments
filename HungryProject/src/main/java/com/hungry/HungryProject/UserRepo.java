package com.hungry.HungryProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

	User save(User user);

}
