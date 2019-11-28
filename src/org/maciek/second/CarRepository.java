package org.maciek.second;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarRepository {
    List<Car> findCars();
}
