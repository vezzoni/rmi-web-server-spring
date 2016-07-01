package vezzoni.rmi.web.server.spring.business;

import java.io.Serializable;
import vezzoni.rmi.web.server.spring.model.Car;

public interface CarService extends Serializable {
    
    Car get(String id);
    
}
