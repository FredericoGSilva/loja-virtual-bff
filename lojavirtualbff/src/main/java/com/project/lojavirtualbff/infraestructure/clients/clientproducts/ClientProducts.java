package com.project.lojavirtualbff.infraestructure.clients.clientproducts;

import com.project.lojavirtualbff.api.request.UserRequestDTO;
import com.project.lojavirtualbff.api.response.ProductsDTO;
import com.project.lojavirtualbff.api.response.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "products-api", url = "localhots:8181")
public interface ClientProducts {

    @GetMapping("/produtos")
    List<ProductsDTO> findAllProducts();

    @GetMapping("/produtos/{nome}")
    ProductsDTO findByName(@PathVariable ("nome") String name);

}
