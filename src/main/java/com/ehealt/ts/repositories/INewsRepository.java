package com.ehealt.ts.repositories;

import com.ehealt.ts.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsRepository extends JpaRepository<News, Integer> {
}
