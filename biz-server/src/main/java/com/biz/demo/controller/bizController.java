package com.biz.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class bizController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/core/page/down/{page}")
    public String bizControl(@PathVariable String page){
//        String url = "http://DAOSERVICE/reslut";
//        String object = restTemplate.getForObject(url, String.class);
//        System.out.println(object);
        System.out.println(page);
        return "database/"+ page;
    }


    @RequestMapping(value = "/index")
    public String bizControl(){
        String url = "http://DAOSERVICE/reslut";
        String object = restTemplate.getForObject(url, String.class);
        System.out.println(object);
        return "index";
    }
}
