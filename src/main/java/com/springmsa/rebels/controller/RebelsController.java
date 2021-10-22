package com.springmsa.rebels.controller;

import com.springmsa.rebels.dao.RebelsDao;
import com.springmsa.rebels.model.Rebels;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/rebels")
public class RebelsController {

    @Autowired
    private RebelsDao dao;

    @Operation(summary = "GET rebel with ID")
    @GetMapping("/{id}")
    public Rebels searchRebelById(@PathVariable int id) {
        return dao.findById(id);
    }

}
