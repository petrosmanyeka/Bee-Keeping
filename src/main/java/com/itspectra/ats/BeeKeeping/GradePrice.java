package com.itspectra.ats.BeeKeeping;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class GradePrice {
    @Id
    /*@SequenceGenerator(
            name = "manyeka-sequence",
            sequenceName = "manyeka-sequence",
            allocationSize = 1
    )*/
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "manyeka_sequence"
    )
    private long id;
    private String grade;
    private double price;
    private double quantityInLiters;
}
