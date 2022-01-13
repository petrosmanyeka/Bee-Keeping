package com.itspectra.ats.BeeKeeping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/farmer")
public class DefautController {
    @GetMapping
    public List<Farmer> getTableClass() {
        return List.of(
                new Farmer(
                        1,
                        "petros",
                        "Mbotwa",
                        "0997509133",
                        "male",
                        "bsc-com-36-19",
                        "Malawi",
                        34
                )
        );
    }

    public List<GradePrice> getHello(){
        return List.of(
                new GradePrice(
                        1,
                        "A",
                        4000,
                        2
                )
        );
    }



}
