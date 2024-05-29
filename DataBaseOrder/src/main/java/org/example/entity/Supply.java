package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "supply")
public class Supply {
    @Id
    private Integer supplyID;
//    private List<OrderItem> supplyItems;
    private Date supplyDate;
}
