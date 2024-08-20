package com.project.lojavirtualbff.business;

import com.project.lojavirtualbff.api.response.ProductsDTO;
import com.project.lojavirtualbff.infraestructure.clients.clientproducts.ClientProducts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ClientProducts clientProducts;

    public List<ProductsDTO> findAllProducts() {
        return clientProducts.findAllProducts();
    }

    public ProductsDTO findByName(String name) {
        return clientProducts.findByName(name);
    }
}
