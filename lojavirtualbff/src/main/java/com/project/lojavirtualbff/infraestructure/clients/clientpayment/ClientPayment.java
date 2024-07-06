package com.project.lojavirtualbff.infraestructure.clients.clientpayment;

import com.project.lojavirtualbff.api.request.CardRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "payment-api", url = "localhost:8383")
public interface ClientPayment {

    // Requisições Feign Client

    //requisição criada na api de pagamentos - api.requests
    @PostMapping("/pagamento")
    Boolean verifyPayment(@RequestBody CardRequestDTO cardRequestDTO);



}
