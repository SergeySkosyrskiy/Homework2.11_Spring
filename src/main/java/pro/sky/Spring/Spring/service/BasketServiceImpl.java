package pro.sky.Spring.Spring.service;

import org.springframework.stereotype.Service;
import pro.sky.Spring.Spring.model.Basket;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addBaskets(List<Integer> idList) {
        return basket.addProduct(idList);
    }

    @Override
    public List<Integer> getBaskets() {
        return basket.getProductIds();
    }
}
