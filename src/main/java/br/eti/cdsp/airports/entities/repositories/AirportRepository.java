/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.cdsp.airports.entities.repositories;

import br.eti.cdsp.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DIT2A
 */
public interface AirportRepository extends JpaRepository<Airport,Long> {
    
}
