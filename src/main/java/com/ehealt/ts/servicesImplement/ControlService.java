package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.Control;
import com.ehealt.ts.repositories.IControlRepository;
import com.ehealt.ts.service.IControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ControlService implements IControlService {

    @Autowired
    private IControlRepository controlRepository;
    @Override
    public Control save(Control control) throws Exception {
        Control control1 = controlRepository.save(control);
        return control;
    }

    @Override
    public void deleteById(Integer id) throws Exception {

    }

    @Override
    public Optional<Control> findById(Integer id) throws Exception {
        return controlRepository.findById(id);
    }

    @Override
    public List<Control> findAll() throws Exception {
        return null;
    }
}
