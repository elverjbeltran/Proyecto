package com.example.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/loginAdmin")
    public String adminLogin() {
        return "loginAdmin";
    }

    @GetMapping("/loginDirector")
    public String directorLogin() {
        return "loginDirector";
    }

    @GetMapping("/loginEst")
    public String EstudLogin() {
        return "loginEst";
    }
    
    @GetMapping("/loginEv")
    public String EvaluaLogin() {
        return "loginEv";
    }
    
    @GetMapping("/loginCoor")
    public String CoordinadorLogin() {
        return "loginCoor";
    }

}
