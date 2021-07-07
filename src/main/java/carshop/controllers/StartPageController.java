package carshop.controllers;


import carshop.db.services.ClientTableService;
import carshop.db.services.TaskTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StartPageController {

    private final TaskTableService taskTableService;
    private final ClientTableService clientTableService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to the best Car Shop ever!";
    }

    @RequestMapping("/descriptions")
    public String descriptions() {
        return taskTableService.getAllDescriptions().toString();
    }

    @RequestMapping("/clients")
    public String clients() {
        return clientTableService.getList().toString();
    }
}