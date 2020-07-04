package com.ehealt.ts.controller;

import com.ehealt.ts.models.Doctor;
import com.ehealt.ts.models.User;
import com.ehealt.ts.service.IDoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/new")
    public void add(Model model){
        model.addAttribute("doctor", new Doctor());
    }


    @PostMapping("/save")
    public void save(@Valid Doctor d, Model model){
        try {
            service.save(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping ("/edit/{id}")
    public void edit(@PathVariable int id, Model model) throws Exception {
        Optional<Doctor>doctor = service.findById(id);
        model.addAttribute("doctor", doctor);
    }





}
