package com.microservices.services;

import com.microservices.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
     CustomerDto getCustomerById(UUID customerId);
}
