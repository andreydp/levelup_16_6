package ua.dp.levelup;

import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.dp.levelup.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by java on 13.06.2017.
 */
public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        //get all cars from context
        Map<String, Car> carsMap = context.getBeansOfType(Car.class);
        for (Car c : carsMap.values()) {
            System.out.println(c.toString());
        }

        //print all cars in json
        Gson gson = new Gson();
        List<Car> carList = new ArrayList<Car>(carsMap.values());

        for (Car c : carList) {
            System.out.println(gson.toJson(c));
        }

        //get car2 by unique id

        Car car2 = context.getBean("car2", Car.class);
        System.out.println(car2);

    }
}