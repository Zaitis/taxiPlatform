package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.painm.taxiplatform.repo.CarRepo;

public class CarService {

    private CarRepo carRepo;

    @Autowired
    CarService(CarRepo carRepo){
        this.carRepo=carRepo;
    }
}
