package vezzoni.rmi.web.server.spring.business.impl;

import java.util.UUID;
import org.springframework.stereotype.Service;
import vezzoni.rmi.web.server.spring.business.CarService;
import vezzoni.rmi.web.server.spring.model.Car;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public Car get(String id) {
        Car car = new Car();
        car.setId(UUID.randomUUID().toString());
        car.setName("CRV");
        
        return car;
    }
    
}
