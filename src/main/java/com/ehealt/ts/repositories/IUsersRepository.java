package com.ehealt.ts.repositories;

import com.ehealt.ts.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends JpaRepository<User,Integer>{

}
