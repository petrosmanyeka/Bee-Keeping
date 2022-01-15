package com.itspectra.ats.BeeKeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.xpath.XPathVariableResolver;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/farmer")
public class DefautController {
    private final ServiceClass serviceClass;
    @Autowired

    public DefautController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping
    public List<Farmer> getTableClass() {
        return serviceClass.getTableClass();
    }

    @PostMapping

    public void registerNewFarmer(@RequestBody Farmer farmer){
         serviceClass.addNewFarmer(farmer);
    }

    @PutMapping(path = "{farmerId}")
    public void updateFarmer(
            @PathVariable("farmerId") Long farmerId,
            @RequestParam(required = false) String f_name,
            @RequestParam(required = false) String l_name
    ){
        serviceClass.updateFarmer(farmerId ,f_name ,l_name);
    }

}
