package com.Manyeka.Mv.BeeKeeping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FarmerContro {

    @Autowired
    private FarmerServ farmerServ;

    @Autowired
    private FarmerRepos farmerRepos;

    @PostMapping("/post")
    public Farmer addFarmer(@RequestBody Farmer farmer){
        return farmerRepos.save(farmer);
    }
    @DeleteMapping("/kalh")
    public String deleteFarmerById(@PathVariable("id") long farmersId ){
       farmerRepos.deleteById(farmersId);
       return "peacefuly deleted";

    }
    @PutMapping("/updates")
    public String updatesFarmer(long farmersId){
       farmerRepos.findById(farmersId);
       return "we have updated";
    }
    @GetMapping("/get")
    public String getFarmer(){
        farmerRepos.findAll();
        return "it is done";
    }

}