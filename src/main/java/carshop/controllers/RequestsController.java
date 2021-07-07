package carshop.controllers;


import carshop.services.ClientsTableService;
import carshop.services.GoodsTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestsController {

    private final GoodsTableService goodsTableService;
    private final ClientsTableService clientsTableService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to the best Car Shop ever!";
    }

    @RequestMapping("/goods")
    public String descriptions() {
        return goodsTableService.getList().toString();
    }

    @RequestMapping("/clients")
    public String clients() {
        return clientsTableService.getList().toString();
    }
}