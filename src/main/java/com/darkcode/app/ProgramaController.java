package com.darkcode.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.app.domain.Programa;


@Controller
public class ProgramaController {
    @GetMapping("/programa")
    public String informacionPrograma(Model model){
        Programa programa = new Programa();
        programa.setNombreP("Programacion");
        programa.setNivel("II");
        programa.setCreditos("4");
        programa.setEstadoP(true);
        model.addAttribute("programaAttributes", programa);
        return "show_programa";
    }
}
