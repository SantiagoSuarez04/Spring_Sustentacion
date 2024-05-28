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
        model.addAttribute("tutorialAttributes", tutorial);
        return "show_tutorial";


}}
