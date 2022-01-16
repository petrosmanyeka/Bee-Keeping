package com.itspectra.ats.BeeKeeping;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@ApiOperation(value ="api/v1/farmer",tags = "Default controller class" )
@RestController
@RequestMapping(path = "api/v1/farmer")
public class DefautController {
    private final ServiceClass serviceClass;
    @Autowired
    public DefautController(ServiceClass serviceClass) {

        this.serviceClass = serviceClass;
    }

    @ApiOperation(value ="Fetch all farmes",response = Iterable.class)
    @GetMapping
    public List<Farmer> getTableClass() {
        return (List<Farmer>) serviceClass.getTableClass();
    }

    @ApiOperation(value ="insert farmer record",response = Farmer.class)
    @PostMapping
    public void registerNewFarmer(@RequestBody Farmer farmer){
         serviceClass.addNewFarmer(farmer);
    }

    @ApiOperation(value ="Update farmers Record",response = Farmer.class)
    @PutMapping(path = "{farmerId}")
    public void updateFarmer(
            @PathVariable("farmerId") Long farmerId,
            @RequestParam(required = false) String f_name,
            @RequestParam(required = false) String l_name
    ){
        serviceClass.updateFarmer(farmerId ,f_name ,l_name);
    }

}
