package com.ehealt.ts.controller;

import com.ehealt.ts.models.Control;
import com.ehealt.ts.service.IControlService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/control")
public class ControlController {
    @Autowired
    IControlService service;
    @GetMapping("/show/{id}")
    public Optional<Control> show (@PathVariable int id, Model model) throws Exception {
        Optional<Control>control = service.findById(id);
        model.addAttribute("control", control);
        return control;
    }

    @PostMapping("/save")
    public void save (@RequestBody Control control) throws Exception {
        service.save(control);
    }

    @GetMapping("/edit/{id}")
    public void edit (@PathVariable int id, Model model) throws Exception {
        Optional<Control>control = service.findById(id);
        model.addAttribute("control", control);
    }


}
