package com.Manyeka.Mv.BeeKeeping;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@ToString
@Entity
@Table
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long farmersId;
    private String f_name;
    private String l_name;
    private String phoneNumber;
    private String gender;
    private String email;
    private int age;
}
