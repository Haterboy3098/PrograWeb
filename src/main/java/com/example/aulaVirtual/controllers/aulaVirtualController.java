package com.example.aulaVirtual.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class aulaVirtualController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String mostrarInicio(){

        return "inicio";
    }

}
