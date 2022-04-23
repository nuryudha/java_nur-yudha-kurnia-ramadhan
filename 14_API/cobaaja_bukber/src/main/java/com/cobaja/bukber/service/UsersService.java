package com.cobaja.bukber.service;

import com.cobaja.bukber.model.Users;
import com.cobaja.bukber.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users>usersList(){
        return usersRepository.findAll(); // nampilin semua data pake Findall
    }
    public List<Users>genderKelamin(String kelamin){
        return usersRepository.findByGender(kelamin);
    }


}
