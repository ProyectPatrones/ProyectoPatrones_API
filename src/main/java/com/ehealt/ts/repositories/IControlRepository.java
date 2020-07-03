package com.ehealt.ts.repositories;

import com.ehealt.ts.models.Control;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IControlRepository extends JpaRepository<Control, Integer> {
}
