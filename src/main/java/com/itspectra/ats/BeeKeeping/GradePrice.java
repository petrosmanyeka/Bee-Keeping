package com.itspectra.ats.BeeKeeping;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class GradePrice {
    private long id;
    private String grade;
    private double price;
    private double quantityInLiters;
}
