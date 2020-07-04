package com.ehealt.ts.repositories;

import com.ehealt.ts.models.UserControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserControlRepository extends JpaRepository<UserControl, Integer> {
}
