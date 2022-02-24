package com.Manyeka.Mv.BeeKeeping;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/farmer")
public class ControFarme {
    @Autowired
    private FarmerRepos farmerRepos;
 @GetMapping
public List<Farmer> getAllFarmers(){
    return farmerRepos.findAll();
}

@PostMapping
    public Farmer createFarmer(@RequestBody Farmer farmer){
     return farmerRepos.save(farmer);
}
}
