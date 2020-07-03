package com.ehealt.ts.controller;

import com.ehealt.ts.models.Reminder;
import com.ehealt.ts.service.IReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/save/{id}")
    public void save(@Valid Reminder r, Model model) throws Exception {
        reminderService.save(r);
    }

}
