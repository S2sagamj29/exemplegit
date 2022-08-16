package com.example.democustomdb.repo;

import com.example.democustomdb.Enity.NewCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewCategoryRepo extends JpaRepository<NewCategoryEntity,Long>,getInfo {
}
