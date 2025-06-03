package com.purva.RedPluto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;

    private double percentage;
    private String division;

    public void calculatePercentageAndDivision() {
        int total = m1 + m2 + m3 + m4 + m5;
        this.percentage = total / 5.0;

        if (percentage >= 60) {
            this.division = "First Division";
 } else if (percentage >= 50) {
            this.division = "Second Division";
 } else if (percentage >= 40) 
        	this.division = "Third Division";
   else {
        	this.division = "Fail";
            
        }
    }

}
