package org.maciek.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    private CarRepository carRepository;

    @Autowired
    public CarsController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping
    public List<Car> carsPage(@RequestParam(value = "noCars", defaultValue = "0") int noCars) {
        return carRepository.findCars(noCars);
    }

    @RequestMapping("/{carId}")
    public String carPage(@PathVariable int carId, Model model) {
        model.addAttribute(carRepository.findCar(carId));
        return "carInfo";
    }

    @RequestMapping(value ="/carAdd", method = RequestMethod.GET)
    public String carAddPage(Model model) {
        if (model.containsAttribute("car")) {
        }
        else {
            model.addAttribute(new Car());
        }
        return "carAdd";
    }

    @RequestMapping(value = "/carAdd", method = RequestMethod.POST)
    public String carAdded(@Valid Car car, Errors errors) {
        if (errors.hasErrors()) {
            return "carAdd";
        }
        System.out.println(car.toString());
        return "redirect:/cars";
    }
}
