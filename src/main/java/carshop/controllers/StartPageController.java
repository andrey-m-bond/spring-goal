package carshop.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartPageController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the best Car Shop!";
    }
}