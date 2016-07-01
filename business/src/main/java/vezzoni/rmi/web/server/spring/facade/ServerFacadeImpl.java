package vezzoni.rmi.web.server.spring.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vezzoni.rmi.web.server.spring.business.CarService;

public class ServerFacadeImpl implements ServerFacade {

    @Autowired
    private CarService service;
    
    @Override
    public CarService getCarService() {
        return service;
    }
    
}
