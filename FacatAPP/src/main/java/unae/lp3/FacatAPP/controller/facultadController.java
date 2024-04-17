/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lp3.FacatAPP.controller;

import java.util.LinkedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lp3.FacatAPP.model.Facultad;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/facultades")
public class facultadController {

    @GetMapping("/list")
    public String list(Model model) {
        LinkedList<Facultad> facultades = new LinkedList<Facultad>();
        Facultad facu1 = new Facultad();
        facu1.setNombre("Facultad de Ciencias Artes y Tecnologia");
        facu1.setSigla("FACAT");
        Facultad facu2 = new Facultad();
        facu2.setNombre("Facultad de Ciencias de la Salud");
        facu2.setSigla("FACSA");
        Facultad facu3 = new Facultad();
        facu3.setNombre("Facultad de MIERDA");
        facu3.setSigla("FACEM");
        Facultad facu4 = new Facultad();
        facu4.setNombre("Facultad de Ciencias Veterinarias");
        facu4.setSigla("FACVA");
        facultades.add(facu1);
        facultades.add(facu2);
        facultades.add(facu3);
        facultades.add(facu4);
        model.addAttribute("title",
                "Lista de Faultades");
        model.addAttribute("header",
                "Facultades");
        model.addAttribute("facultades",
                facultades);
        return "lista";
    }
}
