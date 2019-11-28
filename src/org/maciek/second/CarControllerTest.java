package org.maciek.second;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;


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
        List<Car> expectedCarList = createCarList();
        CarRepository mockRepository = mock(CarRepository.class);
        when(mockRepository.findCars()).thenReturn(expectedCarList);
        CarsController carsController = new CarsController(mockRepository);
        MockMvc mockMvc = standaloneSetup(carsController).setSingleView(new InternalResourceView("/WEB-INF/views/cars.jsp")).build();
        mockMvc.perform(get("/cars")).andExpect(view().name("cars")).
                andExpect(model().attributeExists("carList")).andExpect(model().attribute("carList", hasItems(expectedCarList.toArray())));
    }

    static List<Car> createCarList() {
        return Arrays.asList(new Car("SG 0087A","Skoda", "Superb"),
                new Car("SG 0932A", "Mazda", "3"));

    }
}
