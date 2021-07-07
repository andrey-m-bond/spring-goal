package carshop.controllers;


import carshop.db.models.ClientModel;
import carshop.db.models.GoodModel;
import carshop.services.ClientsTableService;
import carshop.services.GoodsTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
        return goodsTableService.getAll();
    }

    @RequestMapping("/clients")
    public String clients() {
        return clientsTableService.getAll();
    }

    @PostMapping("/clients")
    @ResponseBody
    public String addClient(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        return clientsTableService.addRecord(ClientModel.builder()
                                                        .id(id)
                                                        .name(name)
                                                        .build()).toString();
    }

    @PostMapping("/goods")
    @ResponseBody
    public String addGood(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        return goodsTableService.addRecord(GoodModel.builder()
                                                    .id(id)
                                                    .name(name)
                                                    .build()).toString();
    }
}