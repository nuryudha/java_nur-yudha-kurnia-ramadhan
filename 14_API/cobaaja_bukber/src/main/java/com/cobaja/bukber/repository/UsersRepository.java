package com.cobaja.bukber.repository;

import com.cobaja.bukber.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UsersRepository extends JpaRepository<Users,Integer> {
    public List<Users> findByGender (String Kelamin);

}
