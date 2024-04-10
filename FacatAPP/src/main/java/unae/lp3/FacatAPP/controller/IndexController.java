/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lp3.FacatAPP.controller;

import java.util.LinkedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ossva
 */
//@RestController
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("datos",
                "Hola Mundo");

        return "index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        LinkedList<String> facultades = new LinkedList<String>();
        facultades.add("FACAT");
        facultades.add("FACEM");
        facultades.add("FACSA");
        model.addAttribute("title",
                "Lista de Faultades");
        model.addAttribute("header",
                "Facultades");
        model.addAttribute("facultades",
                facultades);
        return "lista";
    }
}
