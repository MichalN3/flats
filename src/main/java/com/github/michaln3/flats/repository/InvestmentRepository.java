package com.github.michaln3.flats.repository;

import com.github.michaln3.flats.entity.Flat;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentRepository {
  List<Flat> findAll();
}
