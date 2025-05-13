package com.team3.personal_date.gateway.repository.client;

import com.team3.personal_date.gateway.repository.IClientRepository;
import org.springframework.stereotype.Component;

@Component
public class ClientRepository implements IClientRepository {
    private final JpaClientRepository repository;

    public ClientRepository(JpaClientRepository repository) {
        this.repository = repository;
    }
}
