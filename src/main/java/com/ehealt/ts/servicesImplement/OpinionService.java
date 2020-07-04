package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.Opinion;
import com.ehealt.ts.repositories.IOpinionRepository;
import com.ehealt.ts.service.IOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionService  implements IOpinionService {
    @Autowired
    private IOpinionRepository opinionRepository;

    @Override
    public Opinion save(Opinion opinion) throws Exception {
        Opinion opinion1 = opinionRepository.save(opinion);
        return opinion;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        opinionRepository.deleteById(id);
    }

    @Override
    public Optional<Opinion> findById(Integer id) throws Exception {
        return opinionRepository.findById(id);
    }

    @Override
    public List<Opinion> findAll() throws Exception {
        return (List<Opinion>)opinionRepository.findAll();
    }
}
