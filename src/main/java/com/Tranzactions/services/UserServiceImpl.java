package com.Tranzactions.services;

import com.Tranzactions.Entity.User;
import com.Tranzactions.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public void addUser(User u)
    {
        userRepo.update(u);
    }
}
