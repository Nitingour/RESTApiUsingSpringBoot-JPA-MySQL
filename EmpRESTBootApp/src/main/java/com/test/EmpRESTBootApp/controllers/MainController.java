package com.test.EmpRESTBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
@RequestMapping("/")
public ModelAndView hello()
{
   return new ModelAndView("hello","msg","Hello Spring Boot");	

}
}
