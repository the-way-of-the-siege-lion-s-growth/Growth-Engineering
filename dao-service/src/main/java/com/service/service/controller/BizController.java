package com.service.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BizController {

    @RequestMapping("reslut")
    public String getRusult(){
        return "qu ni  ma de ying she";
    }
}
