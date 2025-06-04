package org.sumerge.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sumerge.userservice.entity.User;


import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
