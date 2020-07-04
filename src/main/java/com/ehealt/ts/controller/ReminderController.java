package com.ehealt.ts.controller;

import com.ehealt.ts.models.Reminder;
import com.ehealt.ts.service.IReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.Optional;

@RestController
@RequestMapping("/api/reminder")
public class ReminderController {
    @Autowired
    private IReminderService reminderService;

    @GetMapping("/show/{id}")
    public Optional<Reminder> show(@PathVariable int id, Model model) throws Exception {
        Optional<Reminder>reminder = reminderService.findById(id);
        model.addAttribute("reminder", reminder);
        return reminder;
    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception {
        reminderService.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Reminder r) throws Exception {
        reminderService.save(r);
    }
    @GetMapping ("/edit/{id}")
    public void edit(@PathVariable int id, Model model) throws Exception {
        Optional<Reminder>reminder = reminderService.findById(id);
        model.addAttribute("reminder", reminder);
    }

}
