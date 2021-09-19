package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.taxiplatform.model.Driver;
import pl.painm.taxiplatform.repo.DriverRepo;

@Service
public class DriverService {
    private DriverRepo driverRepo;

    @Autowired
    public DriverService(DriverRepo driverRepo){
        this.driverRepo=driverRepo;
    }

    public void  saveAs(Driver driver) {
        driverRepo.save(driver);}

    public Driver findByLogin(String login){
        Driver driver =driverRepo.findByLogin(login);
        return driver;
    }



}
