package org.example.entity;

import lombok.*;

@Getter
@Setter
public class Good {
    private String nameGood;
    private String descriptionGood;
    private Double price;

    public Good(String nameGood, String descriptionGood, Double price) {
        this.nameGood = nameGood;
        this.descriptionGood = descriptionGood;
        this.price = price;
    }
}
