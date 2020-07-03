package com.ehealt.ts.controller;

import com.ehealt.ts.models.Control;
import com.ehealt.ts.service.IControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
