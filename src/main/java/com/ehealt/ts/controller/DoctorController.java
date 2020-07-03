package com.ehealt.ts.controller;

import com.ehealt.ts.models.Doctor;
import com.ehealt.ts.models.User;
import com.ehealt.ts.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private IDoctorService service;

    @GetMapping("/findAll")
    public List<Doctor> findall(Model model) throws Exception {
        List<Doctor> doctors = service.findAll();
        model.addAttribute("doctor", doctors);
        return doctors;
    }

    @GetMapping("/delete/{id}")
    public void delete(Model model, @PathVariable int id){
        try {
            service.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}
