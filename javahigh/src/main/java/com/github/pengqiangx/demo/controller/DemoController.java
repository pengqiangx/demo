package com.github.pengqiangx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pengqiang on 2017/10/10.
 */
@Controller
public class DemoController {

    @RequestMapping(value="/demo/param",method = RequestMethod.GET)
    public String hello(@RequestParam("param1") String param1,
                        @RequestParam("param2") String param2,
                        @RequestParam("param3") String param3){
        return "hello world!";
    }

    @RequestMapping(value="/demo/varParam/{param1}/{param2}/{param3}",method = RequestMethod.GET)
    public String hello2(@PathVariable String param1,
                         @PathVariable  String param2,
                         @PathVariable String param3){
        return "hello world!";
    }
}
