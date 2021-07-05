package com.ivoronline.springboot_db_postgresql_jsonb.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String  name;
  public Integer age;

  @Type(type = "json")
  @Column(columnDefinition = "jsonb")
  public Address address;

}
