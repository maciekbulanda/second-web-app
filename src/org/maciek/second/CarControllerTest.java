package org.maciek.second;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class CarControllerTest {
    @Test
    public void showCars() throws Exception {
        List<Car> expectedCarList = createCarList(1);
        CarRepository mockRepository = mock(CarRepository.class);
        when(mockRepository.findCars(1)).thenReturn(expectedCarList);
        CarsController carsController = new CarsController(mockRepository);
        MockMvc mockMvc = standaloneSetup(carsController).setSingleView(new InternalResourceView("/WEB-INF/views/cars.jsp")).build();
        mockMvc.perform(get("/cars?noCars=1")).andExpect(view().name("cars")).
                andExpect(model().attributeExists("carList")).andExpect(model().attribute("carList", hasItems(expectedCarList.toArray())));
    }

    static List<Car> createCarList(int noCars) {
        Car[] cars = {new Car("SG 0087A","Skoda", "Superb"),
                new Car("SG 0932A", "Mazda", "3")};
        List<Car> carList = new ArrayList<>();
        if (noCars == 0) {
            noCars = cars.length;
        }
        for (int i = 0; i < noCars; i++) {
            carList.add(cars[i]);
        }
        return carList;
    }

    static Car getCarById(int index) {
        Car[] cars = {new Car("SG 0087A","Skoda", "Superb"),
                new Car("SG 0932A", "Mazda", "3")};
        return cars[index];
    }
}
