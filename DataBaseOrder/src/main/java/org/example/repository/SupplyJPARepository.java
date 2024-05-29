package org.example.repository;

import org.example.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyJPARepository extends
        JpaRepository<Supply,Integer>{
    Supply getSupplyBySupplyID(Integer supplyID);
}