package com.itspectra.ats.BeeKeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

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


    public void addNewFarmer(Farmer farmer) {
        System.out.println(farmer);
    }

    @Transactional
    public void updateFarmer(Long farmerId, String f_name, String l_name) {
    Farmer farmer = farmRepository.findById(farmerId).orElseThrow(() -> new IllegalStateException(
            "student wint id " + farmerId + "does not exist"
    ));
    if (f_name != null && f_name.length() >0 && !Objects.equals(farmer.getF_name() ,f_name)){
        farmer.setF_name(f_name);
    }
        if (l_name != null && l_name.length() >0 && !Objects.equals(farmer.getL_name() ,l_name)){
            farmer.setL_name(l_name);
        }
    }
}
