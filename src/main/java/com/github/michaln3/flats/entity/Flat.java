package com.github.michaln3.flats.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flats")
public class Flat {
  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int size;
  @ManyToOne
  @JoinColumn(name = "investments_id")
  private Investment investment;
  private Long price;
  private FlatStatus status;

  public Flat() {}

  public Flat(final Long id, final int size, final Investment investment, final Long price, final FlatStatus status) {
    this.id = id;
    this.size = size;
    this.investment = investment;
    this.price = price;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public int getSize() {
    return size;
  }

  public void setSize(final int size) {
    this.size = size;
  }

  public Investment getInvestment() {
    return investment;
  }

  public void setInvestment(final Investment investment) {
    this.investment = investment;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(final Long price) {
    this.price = price;
  }

  public FlatStatus getStatus() {
    return status;
  }

  public void setStatus(final FlatStatus status) {
    this.status = status;
  }
}
