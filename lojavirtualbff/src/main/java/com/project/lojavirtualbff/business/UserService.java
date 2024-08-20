package com.project.lojavirtualbff.business;

import com.project.lojavirtualbff.api.request.UserRequestDTO;
import com.project.lojavirtualbff.api.response.UserResponseDTO;
import com.project.lojavirtualbff.infraestructure.clients.clientuser.ClientUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ClientUser clientUser;

    public UserResponseDTO registerUser(UserRequestDTO userRequestDTO) {
        return clientUser.recordUserData(userRequestDTO);
    }

    public UserResponseDTO findUserByEmail(String email) {
        return clientUser.findUserByEmail(email);
    }

    public void deleteUserByEmail(String email) {
        clientUser.deleteUserData(email);
    }

}
