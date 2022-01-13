package com.itspectra.ats.BeeKeeping;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceClass {
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
