package com.Manyeka.Mv.BeeKeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@SpringBootApplication

public class  BeeKeepingApplication implements CommandLineRunner {
  @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("mapoto")).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(BeeKeepingApplication.class, args);
    }


    @Autowired

    private FarmerRepos farmerRepos;

    @GetMapping
    public void  run(String...arg){
        Farmer farmer = new Farmer();
        farmer.setF_name("mapoto");
        farmer.setL_name("mapoto");
        farmer.setPhoneNumber("099557457");
        farmer.setGender("male");
        farmer.setEmail("mhebuiebiu");
        farmer.setAge(34);
        farmerRepos.save(farmer);

        Farmer farmer1 = new Farmer();
        farmer1.setF_name("manyebwuiw");
        farmer1.setL_name("maudbudi");
        farmer1.setPhoneNumber("099557457");
        farmer1.setGender("muydyi");
        farmer1.setEmail("lbdudieuddud");
        farmer1.setAge(34);
        farmerRepos.save(farmer1);



    }


}
