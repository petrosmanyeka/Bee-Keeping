package com.Manyeka.Mv.BeeKeeping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class  GradePrice {
    @Id
    private long id;
    private String grade;
    private double price;
    private double quantityInLiters;

    public GradePrice() {
    }

    public GradePrice(String grade, double price, double quantityInLiters) {
        this.grade = grade;
        this.price = price;
        this.quantityInLiters = quantityInLiters;
    }

    public GradePrice(long id, String grade, double price, double quantityInLiters) {
        this.id = id;
        this.grade = grade;
        this.price = price;
        this.quantityInLiters = quantityInLiters;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(double quantityInLiters) {
        this.quantityInLiters = quantityInLiters;
    }

    @Override
    public String toString() {
        return "GradePrice{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", price=" + price +
                ", quantityInLiters=" + quantityInLiters +
                '}';
    }
}
