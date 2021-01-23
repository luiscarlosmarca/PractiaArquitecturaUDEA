package co.edu.udea.microservicioudearegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    private String str="Hola desde el mundo Spring Boot";
    @GetMapping("/")
    public String msj()
    {
        return str;
    }

    @GetMapping("/hello")
    public String msj2()
    {
        return str;
    }
}

