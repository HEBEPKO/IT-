package org.example.service.impl;


import org.example.entity.Supply;
import org.example.repository.SupplyJPARepository;
import org.example.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupplyServiceImpl implements SupplyService {

    @Autowired
    private SupplyJPARepository supplyJPARepository;

    @Override
    public List<Supply> getSupplyList() {
        return supplyJPARepository.findAll();
    }
}
