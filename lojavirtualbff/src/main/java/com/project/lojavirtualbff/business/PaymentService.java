package com.project.lojavirtualbff.business;

import com.project.lojavirtualbff.api.request.CardRequestDTO;
import com.project.lojavirtualbff.infraestructure.clients.clientpayment.ClientPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final ClientPayment clientPayment;

    public Boolean verifyPayment(CardRequestDTO cardRequestDTO) {
        return clientPayment.verifyPayment(cardRequestDTO);
    }
}
