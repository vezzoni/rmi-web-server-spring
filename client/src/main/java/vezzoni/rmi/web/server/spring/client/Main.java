package vezzoni.rmi.web.server.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vezzoni.rmi.web.server.spring.business.CarService;
import vezzoni.rmi.web.server.spring.facade.ServerFacade;
import vezzoni.rmi.web.server.spring.model.Car;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        ServerFacade service = (ServerFacade) context.getBean("serverFacade");
        
        CarService carService = service.getCarService();
        Car car = carService.get(null);
        
        System.out.println(car);
    }

}
