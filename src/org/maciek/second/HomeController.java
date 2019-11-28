package org.maciek.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = GET)
    public String home() {
        System.out.println(new Date());
        return "home";
    }
}
