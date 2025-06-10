package org.sumerge.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sumerge.userservice.entity.User;


import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
