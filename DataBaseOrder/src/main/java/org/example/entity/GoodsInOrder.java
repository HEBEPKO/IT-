package org.example.entity;

import lombok.*;

@Getter
@Setter
public class GoodsInOrder {
    private Good good;
    private int numberOfGoods;

    public GoodsInOrder(Good good, int numberOfGoods) {
        this.good = good;
        this.numberOfGoods = numberOfGoods;
    }
}
