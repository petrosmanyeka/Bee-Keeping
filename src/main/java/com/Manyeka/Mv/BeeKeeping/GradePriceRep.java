package com.Manyeka.Mv.BeeKeeping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradePriceRep extends JpaRepository<GradePrice,Long> {
}
