package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.repo.DriverRepo;

public class DriverService {
    private DriverRepo driverRepo;

    @Autowired
    public DriverService(DriverRepo driverRepo){
        this.driverRepo=driverRepo;
    }
}
