package carshop.controllers;


import carshop.db.services.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartPageController {

    @Autowired
    private TaskTableService taskTableService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to the best Car Shop!";
    }

    @RequestMapping("/descriptions")
    public String descriptions() {
        return taskTableService.getAllDescriptions().toString();
    }
}