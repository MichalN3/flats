package com.github.michaln3.flats.service;

import com.github.michaln3.flats.repository.FlatRepository;
import org.springframework.stereotype.Service;

@Service
public class FlatService {
  private final FlatRepository flatRepository;

  public FlatService(FlatRepository flatRepository) {
    this.flatRepository = flatRepository;
  }
}
