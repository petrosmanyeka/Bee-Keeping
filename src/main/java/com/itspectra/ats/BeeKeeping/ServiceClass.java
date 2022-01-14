package com.itspectra.ats.BeeKeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceClass {
private final FarmRepository farmRepository;
@Autowired
    public ServiceClass(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

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
