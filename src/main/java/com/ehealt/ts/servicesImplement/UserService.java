package com.ehealt.ts.servicesImplement;

import com.ehealt.ts.models.Control;
import com.ehealt.ts.models.User;
import com.ehealt.ts.models.UserControl;
import com.ehealt.ts.repositories.IControlRepository;
import com.ehealt.ts.repositories.IUserControlRepository;
import com.ehealt.ts.repositories.IUsersRepository;
import com.ehealt.ts.response.UserControlResponse;
import com.ehealt.ts.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUsersRepository usersRepository;

    @Autowired
    private IUserControlRepository userControlRepository;

    @Autowired
    private IControlRepository controlRepository;

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

    @Override
    public UserControlResponse setUserControl(int userId, int controlId){
        User user = usersRepository.findById(userId).get();
        Control control = controlRepository.findById(controlId).get();

        UserControl userControl = new UserControl();
        userControl.setUser(user);
        userControl.setControl(control);
        userControl = userControlRepository.save(userControl);

        UserControlResponse userControlResponse = new UserControlResponse();
        userControlResponse.setUser(user.getId());
        userControlResponse.setControl(control.getId());

        return userControlResponse;
    }
}
