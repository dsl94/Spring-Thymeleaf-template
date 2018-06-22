package com.intisa.intisia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.intisa.intisia.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsernameIgnoreCase(String username);
}
