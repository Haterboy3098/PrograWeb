package com.example.aulaVirtual.controllers;

import com.example.aulaVirtual.form.LoginForm;
import com.example.aulaVirtual.model.dao.*;
import com.example.aulaVirtual.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@Controller
public class aulaVirtualController {

    @Autowired
    private userStudentRepo userStudentRepo;

    @Autowired
    private userTeacherRep userTeacherRepo;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String mostrarInicio(){

        return "inicio";
    }

    @RequestMapping(value="/login/{tipo}", method = RequestMethod.GET)
    public String mostrarLogin(@PathVariable("tipo") String tipoUsuario, Model model){

        HttpSession sesion = getSession();

        sesion.setAttribute("alumno",false);
        sesion.setAttribute("profesor",false);
        sesion.setAttribute("admin",false);

        if (tipoUsuario.equals("alumno")){
            sesion.setAttribute("alumno",true);
        }
        if (tipoUsuario.equals("profesor")){
            sesion.setAttribute("profesor",true);
        }
        if (tipoUsuario.equals("admin")){
            sesion.setAttribute("admin",true);
        }

        model.addAttribute("tipoUsuario",tipoUsuario);
        return "login";
    }


    @RequestMapping(value = "/procesar_login",method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String procesarLogin(LoginForm loginForm){

        HttpSession sesion=getSession();

        UserStudentEntity userStudent = userStudentRepo.findByUsername(loginForm.getUsername());
        if (userStudent != null){
            if (!userStudent.getPassword().equals(loginForm.getPass())){
                if((boolean)sesion.getAttribute("alumno")){
                    System.out.println("Error en el usuario de alumno");

                    return "redirect:/login/alumno";
                }
                if((boolean)sesion.getAttribute("profesor")){
                    System.out.println("Error en el usuario del profesor");
                    return "redirect:/login/profesor";
                }
                if((boolean)sesion.getAttribute("admin")) {
                    System.out.println("Error en el usuario admin");
                    return "redirect:/login/admin";
                }
            }else{
                System.out.println("Ingreso concedido");
                return "<h1>Bienvenido</h1>";
            }

        }
        return "<h1>Usuario no encontrado</h1>";
    }

    private HttpSession getSession(){
        final HttpServletRequest req = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();

        return req.getSession();
    }
}
