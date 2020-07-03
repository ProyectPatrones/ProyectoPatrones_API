package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.User;
import com.ehealt.ts.repositories.IUsersRepository;
import com.ehealt.ts.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUsersRepository usersRepository;

    @Override
    public User save(User user) throws Exception {
        User user1= usersRepository.save(user);
        return user;
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        usersRepository.deleteById(id);
    }

    @Override
    public Optional<User> findById(Integer id) throws Exception {
        return  usersRepository.findById(id);
    }

    @Override
    public List<User> findAll() throws Exception {
        return (List<User>)usersRepository.findAll();
    }
}
