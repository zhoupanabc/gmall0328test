package com.atguigu.gmall.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class gmallController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
      return "hello";
    }
}
