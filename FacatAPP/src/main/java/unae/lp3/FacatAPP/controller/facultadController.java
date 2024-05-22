/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lp3.FacatAPP.controller;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import unae.lp3.FacatAPP.model.Facultad;
import unae.lp3.FacatAPP.repositories.facultadRepository;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/facultades")
public class facultadController {

    @Autowired
    private facultadRepository facurepo;

    @GetMapping("/")
    public String list(Model model) {
        List<Facultad> facultades = new LinkedList<Facultad>();
//        Facultad facu1 = new Facultad();
//        facu1.setNombre("Facultad de Ciencias Artes y Tecnologia");
//        facu1.setSigla("FACAT");
//        Facultad facu2 = new Facultad();
//        facu2.setNombre("Facultad de Ciencias de la Salud");
//        facu2.setSigla("FACSA");
//        Facultad facu3 = new Facultad();
//        facu3.setNombre("Facultad de MIERDA");
//        facu3.setSigla("FACEM");
//        Facultad facu4 = new Facultad();
//        facu4.setNombre("Facultad de Ciencias Veterinarias");
//        facu4.setSigla("FACVA");
//        facultades.add(facu1);
//        facultades.add(facu2);
//        facultades.add(facu3);
//        facultades.add(facu4);
//        facurepo.save(facu1);
//        facurepo.save(facu2);
//        facurepo.save(facu3);
//        facurepo.save(facu4);
        facultades = facurepo.findAll();
        model.addAttribute("title",
                "Lista de Faultades");
        model.addAttribute("header",
                "Facultades");
        model.addAttribute("facultades",
                facultades);
        return "facultades/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        Facultad facu = new Facultad();
//        facu.setNombre("Facultad de Ciencias Artes y Tecno");
//        facu.setSigla("FACAT");
//        facu.setId(1);
        model.addAttribute("title",
                "Agregar de Faultad ");
        model.addAttribute("dato",
                facu);

        return "facultades/form";
    }

    @GetMapping("/editar/{id}")
    public String actualizar(Model model,
            Facultad facu) {
        int facuid = facu.getId();
        Facultad f = facurepo.findById(facuid).
                orElse(null);
        //facu=facurepo.findById(facu.getId());
//        facu.setNombre("Facultad de Ciencias Artes y Tecno");
//        facu.setSigla("FACAT");
//        facu.setId(1);
        model.addAttribute("title",
                "Editar de Faultad: ");
        model.addAttribute("dato",
                f);

        return "facultades/form";
    }

    @PostMapping("/form")
    public String guardar(Model model,
            Facultad facu) //            @RequestParam("nombre") String nombre,
    //            @RequestParam("sigla") String sigla) 
    {

//        model.addAttribute("nombre",
//                facu.getNombre());
//        model.addAttribute("sigla",
//                facu.getSigla());
        facurepo.save(facu);
        model.addAttribute("dato",
                facu);
        return "redirect:/facultades/";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(Model model,
            Facultad facu) {
        //int facuid = facu.getId();
//        Facultad f = facurepo.findById(facuid).
//                orElse(null);
        facurepo.delete(facu);
        model.addAttribute("dato",
                facu);

        return "redirect:/facultades/";
    }
}
