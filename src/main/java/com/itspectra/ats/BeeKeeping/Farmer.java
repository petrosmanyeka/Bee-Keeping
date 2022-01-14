package com.itspectra.ats.BeeKeeping;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Farmer{
    @Id
    /*@SequenceGenerator(
            name = "manyeka_sequence",
            sequenceName = "manyeka_sequence",
            allocationSize = 1
    )*/
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "manyeka_sequence"
    )
    private long id;
    private String f_name;
    private String l_name;
    private String phoneNumber;
    private String gender;
    private String email;
    private String country;
    private int age;
}
