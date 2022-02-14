package com.Manyeka.Mv.BeeKeeping;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GradePriceServ {
    @Autowired
    private GradePriceRep gradePriceRep;
    public String addGradeP(GradePrice gradePrice) {
        gradePriceRep.save(gradePrice);
        return "saved";
    }

    public String getGradeP() {
        gradePriceRep.findAll();
        return "Succesfly accesed";
    }

    public String deleteGradePrice(long id) {
        gradePriceRep.deleteById(id);
        return "price deleted";
    }

  /*  public String updatePrice(long id) {
        gradePriceRep.findById(id);
        return "update is completed";
    }*/
}
