package org.example.entity;

import lombok.*;

@Getter
@Setter
public class Good {
    private String nameGood;
    private String descriptionGood;
    private int price;

    public Good(String nameGood, String descriptionGood, int price) {
        this.nameGood = nameGood;
        this.descriptionGood = descriptionGood;
        this.price = price;
    }
}
