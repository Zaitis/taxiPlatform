package pl.painm.taxiplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.painm.taxiplatform.repo.CarRepo;

@Service
public class CarService {

    private CarRepo carRepo;

    @Autowired
    CarService(CarRepo carRepo){
        this.carRepo=carRepo;
    }
}
