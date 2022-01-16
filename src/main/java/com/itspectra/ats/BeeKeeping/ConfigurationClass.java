package com.itspectra.ats.BeeKeeping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigurationClass {

   @Bean

    CommandLineRunner commandLineRunner(FarmRepository farmRepository){
        return args -> {
           Farmer petros = new Farmer(
                    1,
                    "petros",
                    "Mbotwa",
                    "0997509133",
                    "male",
                    "bsc-com-36-19",
                    "Malawi",
                    34
            );
            farmRepository.saveAll(
                    List.of (petros)
            );
        };
    }
}
