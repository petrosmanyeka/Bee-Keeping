package com.itspectra.ats.BeeKeeping;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Farmer {
    private long id;
    private String f_name;
    private String l_name;
    private String phoneNumber;
    private String gender;
    private String email;
    private String country;
    private int age;
}
