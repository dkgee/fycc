package com.tank.fycc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * 作者：JinHuaTao
 * 时间：2018/4/11 15:07
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hay,I am Jane";
    }
}
