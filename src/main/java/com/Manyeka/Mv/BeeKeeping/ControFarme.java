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
@GetMapping("/farme/{id}")
public Farmer getFarmerById(@PathVariable long id){
     return farmerRepos.findById(id).get();
}

@PostMapping
    public Farmer createFarmer(@RequestBody Farmer farmer){
     return farmerRepos.save(farmer);
}
@PutMapping
    public Farmer updateFarmer(@RequestBody Farmer farmer){
     return farmerRepos.save(farmer);
}
}
