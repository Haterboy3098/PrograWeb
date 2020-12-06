package com.example.aulaVirtual.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class aulaVirtualController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String mostrarInicio(){

        return "inicio";
    }

    @RequestMapping(value="/login/{tipo}", method = RequestMethod.GET)
    public String mostrarLogin(@PathVariable("tipo") String tipoUsuario, Model model){


        model.addAttribute("tipoUsuario",tipoUsuario);
        return "login";
    }
}
