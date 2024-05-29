package org.example.controller;


import org.example.entity.Supply;
import org.example.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supply")
public class SupplyController {

    @Autowired
    private SupplyService supplyService;

    /* CRUD -> Read */
    @GetMapping()
    public List<Supply> getSupplyList(){return supplyService.getSupplyList();}
}
