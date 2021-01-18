package com.github.michaln3.flats.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Investments")
public class Investment {
  @Id
  private int id;
  private String name;
  private String description;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "investment")
  private Set<Flat> flats;

  public Investment() {}

  public Investment(final int id, final String name, final String description, final Set<Flat> flats) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.flats = flats;
  }

  int getId() {
    return id;
  }

  void setId(final int id) {
    this.id = id;
  }

  String getName() {
    return name;
  }

  void setName(final String name) {
    this.name = name;
  }

  String getDescription() {
    return description;
  }

  void setDescription(final String description) {
    this.description = description;
  }

  Set<Flat> getFlats() {
    return flats;
  }

  void setFlats(final Set<Flat> flats) {
    this.flats = flats;
  }
}
