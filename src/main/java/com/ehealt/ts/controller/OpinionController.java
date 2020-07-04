package com.ehealt.ts.controller;

import com.ehealt.ts.models.Opinion;
import com.ehealt.ts.service.IOpinionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/opinion")
public class OpinionController {
    @Autowired
    IOpinionService opinionService;

    @GetMapping("show/{id}")
    public Optional<Opinion> show(@PathVariable int id, Model model) {
        Optional<Opinion>opinion = null;
        try {
            opinion = opinionService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("opinion", opinion);
        return opinion;
    }

    @PostMapping("/save")
    public void save(@RequestBody Opinion o) throws Exception {
        opinionService.save(o);
    }

    @GetMapping("/edit/{id}")
    public  void edit (@PathVariable int id, Model model) throws Exception {
        Optional<Opinion>opinion = opinionService.findById(id);
        model.addAttribute("opinion", opinion);
    }

    @GetMapping("/findAll")
    public List<Opinion> findAll(Model model) throws Exception {
        List<Opinion> opinions  = opinionService.findAll();
        model.addAttribute("opinion", opinions);
        return opinions;
    }

}
