package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.Reminder;
import com.ehealt.ts.repositories.IReminderRepository;
import com.ehealt.ts.service.IReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderService  implements IReminderService {
    @Autowired
    private IReminderRepository reminderRepository;
    @Override
    public Reminder save(Reminder reminder) throws Exception {
        Reminder reminder1 = reminderRepository.save(reminder);
        return reminder;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        reminderRepository.deleteById(id);
    }

    @Override
    public Optional<Reminder> findById(Integer id) throws Exception {
        return reminderRepository.findById(id);
    }

    @Override
    public List<Reminder> findAll() throws Exception {
        return null;
    }
}
