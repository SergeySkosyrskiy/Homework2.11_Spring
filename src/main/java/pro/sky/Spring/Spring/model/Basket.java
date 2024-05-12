package pro.sky.Spring.Spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> productIds;
    public Basket() {
        this.productIds = new ArrayList<>();
    }

    public List<Integer> addProduct(List<Integer> idList) {
        productIds.addAll(idList);
        return idList;
    }

    public List<Integer> getProductIds() {
        return Collections.unmodifiableList(productIds);
    }
}
