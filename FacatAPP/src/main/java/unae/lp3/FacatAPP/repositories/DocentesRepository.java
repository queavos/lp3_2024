/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unae.lp3.FacatAPP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unae.lp3.FacatAPP.model.Docente;

/**
 *
 * @author ossva
 */
public interface DocentesRepository
        extends JpaRepository<Docente, Integer> {

}
