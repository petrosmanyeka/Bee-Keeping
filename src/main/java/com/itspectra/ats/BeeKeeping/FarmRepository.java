package com.itspectra.ats.BeeKeeping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository <Farmer,Long >{}
