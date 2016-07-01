package vezzoni.rmi.web.server.spring.facade;

import java.io.Serializable;
import vezzoni.rmi.web.server.spring.business.CarService;

public interface ServerFacade extends Serializable {
    
    CarService getCarService();
    
}
