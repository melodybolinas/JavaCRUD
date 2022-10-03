/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysamplecrud.springboot.repository;

/**
 *
 * @author melodybolinas
 */
import mysamplecrud.springboot.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientsRepository extends JpaRepository<Patient, Long>{
    
}
