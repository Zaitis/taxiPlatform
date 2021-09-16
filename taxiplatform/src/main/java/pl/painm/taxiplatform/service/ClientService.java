package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.repo.ClientRepo;

public class ClientService {
    private ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo){
        this.clientRepo=clientRepo;
    }
}
