/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysamplecrud.springboot.controller;

import mysamplecrud.springboot.model.Patient;
import mysamplecrud.springboot.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author melodybolinas
 */
import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {
    
    @Autowired
    private PatientsRepository patientsRepository;
    
    //Get Date From Database
    @GetMapping
    public List<Patient> getAllPatient() {
        return patientsRepository.findAll();
    }
    //Create Data
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientsRepository.save(patient);
    }
}
