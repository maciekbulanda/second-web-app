package org.maciek.second;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarCollection implements CarRepository {
    @Override
    public List<Car> findCars() {
        return CarControllerTest.createCarList();
    }
}