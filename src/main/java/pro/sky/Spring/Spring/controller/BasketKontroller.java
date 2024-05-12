package pro.sky.Spring.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring.Spring.model.Basket;
import pro.sky.Spring.Spring.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketKontroller {
    private final BasketService basketService;

    public BasketKontroller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> addBaskets(@RequestParam List<Integer> ids) {
        return basketService.addBaskets(ids);

    }
    @GetMapping("/get")
    public List<Integer> getBaskets(){
        return basketService.getBaskets();
    }
}
