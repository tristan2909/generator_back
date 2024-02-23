package net.guides.springboot2.springboot2jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrud.model.NumberOptions;

@Repository
public interface NumberOptionsRepository extends JpaRepository<NumberOptions, Long> {}