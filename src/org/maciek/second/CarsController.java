package org.maciek.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarsController {
    private CarRepository carRepository;

    @Autowired
    public CarsController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping("/cars")
    public String carsPage(Model model) {

        model.addAttribute(carRepository.findCars());
        return "cars";
    }
}
