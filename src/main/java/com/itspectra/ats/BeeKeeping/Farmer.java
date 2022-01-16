package com.itspectra.ats.BeeKeeping;


import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(notes = "Id of farmer",name = "ID",required = true,value = "1")
    private long id;

    @ApiModelProperty(notes = "First name of farmer",name = "name",required = true)
    private String f_name;
    @ApiModelProperty(notes = "Last name of farmer",name = "name",required = true)
    private String l_name;
    @ApiModelProperty(notes = "phone number of farmer",name = "number",required = true)
    private String phoneNumber;
    @ApiModelProperty(notes = "Id of farmer",name = "ID",required = true,value = "1")
    private String gender;
    @ApiModelProperty(notes = "gender of farmer",name = "gender",required = true)
    private String email;
    @ApiModelProperty(notes = "Email of farmer",name = "email",required = true)
    private String country;
    @ApiModelProperty(notes = "Id of farmer",name = "ID",required = true,value = "1")
    private int age;

}
