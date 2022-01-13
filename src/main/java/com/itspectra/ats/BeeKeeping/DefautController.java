package com.itspectra.ats.BeeKeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
