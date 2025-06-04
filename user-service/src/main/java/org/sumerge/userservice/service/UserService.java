package org.sumerge.userservice.service;



import org.sumerge.userservice.dto.CreateUserRequest;
import org.sumerge.userservice.dto.UpdateUserRequest;
import org.sumerge.userservice.dto.UserResponse;

import java.util.UUID;

public interface UserService {
    UserResponse createUser(CreateUserRequest request);
    UserResponse getUserById(UUID id);
    UserResponse updateUser(UUID id, UpdateUserRequest request);
}
