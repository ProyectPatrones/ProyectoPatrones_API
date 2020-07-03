package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.News;
import com.ehealt.ts.repositories.INewsRepository;
import com.ehealt.ts.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NewService  implements INewsService {
    @Autowired
    private INewsRepository repository;
    @Override
    public News save(News news) throws Exception {
        return null;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<News> findById(Integer id) throws Exception {
        return repository.findById(id);
    }

    @Override
    public List<News> findAll() throws Exception {
        return null;
    }
}
