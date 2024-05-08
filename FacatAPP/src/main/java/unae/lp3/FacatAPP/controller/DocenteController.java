/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lp3.FacatAPP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lp3.FacatAPP.model.Docente;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/docentes")
public class DocenteController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("attribute",
                "value");
        return "view.name";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("attribute",
                "value");
        return "view.name";
    }

    @GetMapping("/editar/{id}")
    public String editar(Model model,
            Docente doce) {
        model.addAttribute("attribute",
                "value");
        return "view.name";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(Model model,
            Docente doce) {
        model.addAttribute("attribute",
                "value");
        return "view.name";
    }

}
