package com.biz.demo.controller.synchronization;

import com.biz.demo.controller.domain.SqlInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/sysnchronization")
public class SyschronizationController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping(value = "/implement")
    public String implement(SqlInfo sqlInfo){
        System.out.println(sqlInfo);
        return "succes";
    }
}
