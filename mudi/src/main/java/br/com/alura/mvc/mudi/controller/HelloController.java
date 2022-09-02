package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest servletRequest){
        servletRequest.setAttribute("nome", "Mundo");
        return "hello";
    }
}
