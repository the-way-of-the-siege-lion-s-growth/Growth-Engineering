package daoservcetow.daoservcetow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BizController {

    @RequestMapping("reslut")
    public String getRusult(){
        return "映射";
    }
}
