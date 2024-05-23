package org.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

//@Entity
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    private String productName;
    private String descriptionProduct;
    private Double productPrice;

}
