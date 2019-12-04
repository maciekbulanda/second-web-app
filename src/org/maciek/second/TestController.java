package org.maciek.second;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("test",new Test());
        return "test/main";
    }

    @RequestMapping(value = "/process")
    public String page2(@Valid Test test, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "test/main";
        }
        System.out.println(test.getVal1());
        return "test/ok";
    }
}
