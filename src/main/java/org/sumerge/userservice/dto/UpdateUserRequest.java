package org.sumerge.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.sumerge.userservice.entity.User;

import java.util.UUID;

@Data
public class UpdateUserRequest {

    @Size(max = 100)
    private String name;

    @Email
    private String email;

    private User.Role role;

    private UUID managerId;
}
