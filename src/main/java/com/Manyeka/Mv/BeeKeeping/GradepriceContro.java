package com.Manyeka.Mv.BeeKeeping;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class GradepriceContro {
    @Autowired
    private GradePriceServ gradePriceServ;

    @PostMapping("/helo")
    public String addGradeP(@RequestBody GradePrice gradePrice) {
        return gradePriceServ.addGradeP(gradePrice
        );
    }

    @GetMapping("/price")
    public String getGradeP() {
        return gradePriceServ.getGradeP();
    }
   @DeleteMapping("/delet")
    public String deleteGradePrice(@PathVariable("id") long priceId) {
        return gradePriceServ.deleteGradePrice(priceId);
    }
/*
    @PutMapping("/updates")
    public String updatePrice(long id){
        return gradePriceServ.updatePrice(id);
    }*/

}