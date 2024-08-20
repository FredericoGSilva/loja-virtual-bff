package com.project.lojavirtualbff.infraestructure.clients.clientuser;

import com.project.lojavirtualbff.api.request.UserRequestDTO;
import com.project.lojavirtualbff.api.response.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "user-api", url = "localhots:8282")
public interface ClientUser {

    @PostMapping("/user")
    UserResponseDTO recordUserData(@RequestBody UserRequestDTO userResquestDTO);

    @GetMapping("/user")
    UserResponseDTO findUserByEmail(@RequestParam ("email") String email);

    @DeleteMapping("/user")
    Void deleteUserData(@RequestParam ("email") String email);

}
