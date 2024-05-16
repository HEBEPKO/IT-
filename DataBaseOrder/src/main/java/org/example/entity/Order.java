package org.example.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class Order {
    private int idOrder;
    private List<GoodsInOrder> goods;
    private String admissionDate;

    public Order(int idOrder, List<GoodsInOrder> goods, String admissionDate) {
        this.idOrder = idOrder;
        this.goods = goods;
        this.admissionDate = admissionDate;
    }
}
