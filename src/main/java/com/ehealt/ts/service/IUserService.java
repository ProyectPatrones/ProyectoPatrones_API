package com.ehealt.ts.service;

import com.ehealt.ts.models.User;
import com.ehealt.ts.response.UserControlResponse;
import org.springframework.stereotype.Service;


public interface IUserService extends ICrudService<User> {
    UserControlResponse setUserControl(int userId, int controlId);
}
