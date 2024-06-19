package com.darkcode.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.app.domain.Tutorial;

@Controller
public class TutorialController {

    @GetMapping("/tutorial")
    public String informacionTutorial(Model model) {
        Tutorial tutorial = new Tutorial();
        tutorial.setNombre("Pancakes");
        tutorial.setDescripcion("tutorial pancakes");
        tutorial.setUrl("https:tutorial.com");
        tutorial.setEstado("publicado");
        tutorial.setFecha("2024");
        tutorial.setAutor("Santiago");
        model.addAttribute("tutorialAttributes", tutorial);
        return "show_tutorial";


}}
