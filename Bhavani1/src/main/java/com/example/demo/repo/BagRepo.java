package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BagModel;

public interface BagRepo extends JpaRepository<BagModel, Integer>{

}
