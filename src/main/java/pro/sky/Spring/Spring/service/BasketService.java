package pro.sky.Spring.Spring.service;

import pro.sky.Spring.Spring.model.Basket;

import java.util.List;

public interface BasketService {


    List<Integer> addBaskets(List<Integer> ids);

    List<Integer> getBaskets();


}
