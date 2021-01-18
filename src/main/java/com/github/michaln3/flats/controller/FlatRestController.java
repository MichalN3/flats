package com.github.michaln3.flats.controller;

import com.github.michaln3.flats.entity.Flat;
import com.github.michaln3.flats.service.FlatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class FlatRestController {

  private static final Logger logger = LoggerFactory.getLogger(FlatRestController.class);
  private final FlatService flatService;

  @Autowired
  public FlatRestController(FlatService flatService) {
    this.flatService = flatService;
  }

//  @GetMapping("/flats")
//  public List<Flat> allFlats() { return ; }

  @GetMapping(value = "/flats/{id}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
  public Flat getFlatById(@PathVariable("id") Long idik){
    logger.info("find flat by id: [{}]", idik);
    return new Flat();
  }
}
