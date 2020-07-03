package com.ehealt.ts.controller;

import com.ehealt.ts.models.News;
import com.ehealt.ts.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    @Autowired
    INewsService newsService;
    @GetMapping("/show/{id}")
    public Optional<News> showAll(@PathVariable int id, Model model) throws Exception {
        Optional<News> news = newsService.findById(id);
        model.addAttribute("news", news);
        return news;
    }
}
