package com.ss.controller;

import com.ss.domain.TtfPinyins;
import com.ss.service.PinYinServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestBootController {

    @Autowired
    PinYinServiceI pinYinServiceI;

    @GetMapping(value = "/testboot")
    public List<TtfPinyins> get(@RequestParam(value = "num", required = false, defaultValue = "1") int num,
                                @RequestParam(value = "size", required = false, defaultValue = "10") int size) {

       return pinYinServiceI.getAll(num, size);

       //PageHelper.startPage(num, size);
       // return ttfPinyinsMapper.getAll();
    }
}