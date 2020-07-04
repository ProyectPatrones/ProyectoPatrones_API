package com.ehealt.ts.controller;

import com.ehealt.ts.models.Doctor;
import com.ehealt.ts.models.User;
import com.ehealt.ts.repositories.IUsersRepository;
import com.ehealt.ts.response.UserControlResponse;
import com.ehealt.ts.service.IUserService;
import jakarta.validation.Valid;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("/findAll")
    public List<User> findall(Model model)  {
        List<User>users= null;
        try {
            users = service.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("user",users);
         return users;
    }

    @GetMapping("/delete/{id}")
    public void  delete(Model model, @PathVariable int id){
        try {
            service.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @GetMapping("/edit/{id}")
    public  void edit(@PathVariable int id, Model model) throws Exception {
        Optional<User>user = service.findById(id);
        model.addAttribute("user", user);

    }

   @GetMapping("/add")
    public void adduser(Model model){

        model.addAttribute("user", new User() );

   }

   @GetMapping("/save")
    public String save (@Valid User u , Model model){
       try {
           service.save(u);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return "redirect:/listar";

   }

   @PostMapping("/{userId}/setUserControl/{userControl}")
    public UserControlResponse setUserControl(@PathVariable (value = "userId") int userId, @PathVariable (value = "controlId") int controlId){
        return service.setUserControl(userId,controlId);
   }


}
